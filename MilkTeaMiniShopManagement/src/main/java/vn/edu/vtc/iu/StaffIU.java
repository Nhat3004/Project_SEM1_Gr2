package vn.edu.vtc.iu;

import vn.edu.vtc.bl.DrinkBL;
import vn.edu.vtc.bl.InvoiceBL;
import vn.edu.vtc.dal.InvoiceDAL;
import vn.edu.vtc.dal.ShopDAL;
import vn.edu.vtc.dal.StaffDAL;
import vn.edu.vtc.persistance.Drink;
import vn.edu.vtc.persistance.Invoice;
import vn.edu.vtc.persistance.Shop;
import vn.edu.vtc.persistance.Staff;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffIU {
    private static Scanner scn() {
        return new Scanner(System.in);
    }

    public static void Staff(int staffID) throws SQLException {
        int shopID = 1;
        int invoiceID;
        String selection = "1";
        while (selection != null) {
            while (selection != null) {
                System.out.println("+----------------------------------+");
                System.out.println("| >1. Create order & print invoice |");
                System.out.println("| >2. Update order.                |");
                System.out.println("| >3. Log out.                     |");
                System.out.println("| >0. Exit app.                    |");
                System.out.println("+----------------------------------+");
                System.out.print(">Enter[0-3]: ");
                selection = scn().nextLine();
                switch (selection) {
                    case "1":
                        invoiceID = createOrder(staffID, shopID);
                        printInvoice(invoiceID);
                        break;
                    case "2":
                        invoiceID = updateOrder(staffID);
                        printInvoice(invoiceID);
                        break;
                    case "3":
                        LoginIU.login();
                        selection = null;
                        break;
                    case "0":
                        selection = null;
                        break;
                    default:
                        System.out.println("Retry, please.\n");
                }
            }
        }
    }

    private static int createOrder(int staffID, int shopID) {
        int idInvoice = 1;
        boolean save = false;

        List<Drink> dr = new ArrayList<>();
        idInvoice = InvoiceBL.insertInvoice(staffID, shopID);
        do {
            String code;
            String choice;
            int quantity;
            boolean isExist, isExist2 = false;
            Drink drink = new Drink();
            do {
                System.out.print("> Drink code: ");
                code = scn().nextLine();
                // Drink drink1 = getByCode(code);
                Drink drink1 = DrinkBL.getByCode(code);
                if (drink1.getCode() == null) {
                    System.out.println("> Drink isn't existed!");
                    isExist = false;
                } else {
                    System.out.printf(" %s: %10sVND\n", drink1.getName(),
                            String.format("%,.0f", drink1.getUnitPrice()));
                    isExist = true;
                }
            } while (!isExist);
            do {
                System.out.print("> Quantity: ");
                quantity = scn().nextInt();
            } while (quantity <= 0);
            for (Drink drr : dr) {
                if (drr.getCode().equals(code)) {
                    int temp;
                    temp = drr.getQuantity();
                    drr.setQuantity(temp + quantity);
                    isExist2 = true;
                }
            }
            if (!isExist2) {
                drink.setCode(code);
                drink.setQuantity(quantity);
                dr.add(drink);
            }
            System.out.print("> Enter [S,s] to save and print invoice/ other key add new drink: ");
            choice = scn().nextLine();
            if (choice.equals("S") || choice.equals("s")) {
                save = true;
            } else {
                save = false;
            }
        } while (!save);
        for (Drink drr : dr) {
            InvoiceBL.insertInvoiceDetails(idInvoice, drr.getCode(), drr.getQuantity());
        }
        return idInvoice;
    }

    private static int updateOrder(int staffID) {
        int invoiceID;
        String code;

        boolean isExist = false, save = false, update = false;
        System.out.print("> Enter invoice ID to update: ");
        invoiceID = scn().nextInt();
        Invoice in = new Invoice();
        List<Drink> lst = new ArrayList<>();
        in = InvoiceDAL.getInvoiceByID(invoiceID);
        if (in.getId() == 0) {
            System.out.println(">Invoice doesn't exist.");
            invoiceID = 0;
        } else {
            lst = InvoiceDAL.getInvoiceDetails(invoiceID);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTime1 = LocalDateTime.now();
            LocalDateTime localDateTime2 = LocalDateTime.parse(in.getDate(), formatter);
            long time = java.time.Duration.between(localDateTime2, localDateTime1).toMinutes();
            if (time > 60.0 && staffID == in.getStaffId()) {
                System.out.println("You can only update this invoice within 60 minutes of it being created.");
                invoiceID = 0;
            } else if (staffID != in.getStaffId()) {
                System.out.println("You are not allow to update this invoice!");
                invoiceID = 0;
            } else if (time <= 60 && staffID == in.getStaffId()) {
                System.out.println("+------------------------------------------------------------------+");
                System.out.println("+------------------------------------------------------------------+");
                int i = 1;
                for (Drink drink : lst) {
                    System.out.printf("| %2d| %-30s| %10s| %5d| %10s|\n", i, drink.getName(),
                            String.format("%,.0f", drink.getUnitPrice()), drink.getQuantity(),
                            String.format("%,.0f", drink.getAmount()));
                    i++;
                }
                System.out.println("+------------------------------------------------------------------+\n");
                do {
                    System.out.print("> Drink code: ");
                    code = scn().nextLine().toUpperCase();
                    for (Drink dr : lst) {
                        if (dr.getCode().equals(code)) {
                            System.out.print("> New quantity: ");
                            int temp, change;
                            temp = scn().nextInt();
                            change = temp - dr.getQuantity();
                            dr.setQuantity(temp);
                            update = InvoiceBL.updateInvoiceDetails(invoiceID, dr.getCode(), dr.getQuantity(), change);
                            isExist = true;
                        }
                    }
                    if (update) {
                        System.out.println("> Update successfully.");
                    }
                    if (!isExist) {
                        System.out.println("> Drink code doesn't exist.");
                    }
                    String choice;
                    System.out.print("> Enter [S] to print updated invoice/ other key update another drink: ");
                    choice = scn().nextLine().toUpperCase();
                    if (choice.equals("S") || choice.equals("s")) {
                        save = true;
                    } else {
                        save = false;
                    }
                } while (!save);
            }
        }
        return invoiceID;
    }

    public static void printInvoice(int id) throws SQLException {
        Invoice in = new Invoice();
        List<Drink> lst = new ArrayList<>();
        in = InvoiceDAL.getInvoiceByID(id);
        double received, refund;
        if (in.getId() == 0) {
            // System.out.println("> Invoice doesn't exist.");
        } else {
            lst = InvoiceDAL.getInvoiceDetails(id);
            Staff st = StaffDAL.getStaffByID(in.getStaffId());
            Shop sh = ShopDAL.getShopById(in.getShopId());
            int i = 1;
            double total = 0.0;
            for (Drink drink : lst) {
                total = total + drink.getAmount();
            }
            System.out.printf("Total payment: %10sVND\n", String.format("%,.0f", total));
            do {
                System.out.print("> Money given by customer: ");
                received = scn().nextDouble();
                if (received < total) {
                    System.out.printf("Money given by customer must be greater than total payment: %10sVND\n",
                            String.format("%,.0f", total));
                }
            } while (received < total);
            System.out.println("\n+-----------------------------------------------+");
            System.out.printf("> %-45s <\n> Tel: %-40s <\n> Address: %-36s <\n", sh.getName(), sh.getTel(), sh.getAddress());
            System.out.println("+-----------------------------------------------+");
            System.out.println("|                     INVOICE                   |");
            System.out.println("+-----------------------------------------------+");
            System.out.printf("> Invoice code: %-32d<\n", in.getId());
            System.out.printf("> Date: %-40s<\n", in.getDate());
            System.out.printf("> Staff: %s, tel: %s      <\n", st.getName(), st.getTel());
            System.out.println("+-----------------------------------------------+");
            System.out.println("| No.| Name                                     |");
            System.out.println("| Unit Price   | Quantity | Amount              |");
            System.out.println("+-----------------------------------------------+");
            for (Drink drink : lst) {
                System.out.printf("| %2d | %-40s |\n| %12s | %8d | %17sVND|\n", i, drink.getName(),
                        String.format("%,.0f", drink.getUnitPrice()), drink.getQuantity(),
                        String.format("%,.0f", drink.getAmount()));
                System.out.println("|-----------------------------------------------|");

                i++;
            }
            refund = received - total;
            System.out.println("+-----------------------------------------------+");
            System.out.printf("|                  Total:    %16sVND|\n",
                    String.format("%,.0f", total));
            System.out.printf("|                  Received: %16sVND|\n",
                    String.format("%,.0f", received));
            System.out.printf("|                  Refund:   %16sVND|\n",
                    String.format("%,.0f", refund));
            System.out.println("+-----------------------------------------------+");
            System.out.println("|       Get your laughing gear round this!      |");
            System.out.println("+-----------------------------------------------+\n\n\n");
        }

    }
}
