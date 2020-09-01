package vn.edu.vtc.iu;

import vn.edu.vtc.bl.DrinkBL;
import vn.edu.vtc.persistance.Drink;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ManagerIU {

    private static Scanner scn() {
        return new Scanner(System.in);
    }

    public static void Manager() throws SQLException {
        String selection = "1";
        while (selection != null) {
            System.out.println("+----------------------------------+");
            System.out.println("| >1. Show all drink order by sold.|");
            System.out.println("| >2. Insert new drink.            |");
            System.out.println("| >3. Update drink(unit price).    |");
            System.out.println("| >4. Log out.                     |");
            System.out.println("| >0. Exit app.                    |");
            System.out.println("+----------------------------------+");
            System.out.print(">Enter[0-4]: ");
            selection = scn().nextLine();

            switch (selection) {
                case "1":
                    showTopSold();
                    break;
                case "2":
                    insertDrink();
                    break;
                case "3":
                    updateDrink();
                    break;
                case "4":
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

    private static void showTopSold() {
        int i = 1;
        while (i != 0) {
            List<Drink> ls = DrinkBL.getAllDrink();
            System.out.printf("Page: %d/%d\n", i, (ls.size() / 10) + 1);
            System.out.println("+-----------+------------------------------------+-----------+------+");
            System.out.printf("| %-10s| %-35s| %-10s| %-5s|\n", "Code", "Name", "Unit Price", "Sold");
            System.out.println("+-----------+------------------------------------+-----------+------+");
            if (i <= ls.size() / 10) {
                for (int j = i * 10 - 10; j < i * 10; j++) {
                    System.out.printf("| %-10s| %-35s| %10.1f| %5d|\n", ls.get(j).getCode(), ls.get(j).getName(), ls.get(j).getUnitPrice(), ls.get(j).getSold());
                }
            } else {
                for (int j = i * 10 - 10; j < ls.size(); j++) {
                    System.out.printf("| %-10s| %-35s| %10.1f| %5d|\n", ls.get(j).getCode(), ls.get(j).getName(), ls.get(j).getUnitPrice(), ls.get(j).getSold());
                }
            }
            System.out.println("+-----------+------------------------------------+-----------+------+");
            System.out.printf("Enter 0 to back, or [1-%d] to choose page: ", (ls.size() / 10) + 1);
            i = scn().nextInt();
            if (i > (ls.size() / 10) + 1) {
                System.err.printf("Page %d is not available!!!\nPlease, retry!\n", i);
                i = 1;
            }
        }
    }

    private static void insertDrink() {
        System.out.println("+----------------------------------+");
        System.out.println("| >Insert new drink.               |");
        System.out.println("+----------------------------------+");
        boolean isExist = false;
        Drink drink = new Drink();
        do {
            System.out.print(">Code: ");
            drink.setCode(scn().nextLine().toUpperCase());
            if (DrinkBL.getByCode(drink.getCode()).getCode() != null) {
                System.out.println("Drink is existed!");
                isExist = true;
            }
        } while (isExist);
        System.out.print(">Input name of drink: ");
        drink.setName(scn().nextLine());
        do {
            System.out.print(">Input unit price: ");
            drink.setUnitPrice(scn().nextDouble());
            if (drink.getUnitPrice() <= 0) {
                System.out.println(">Unit price must be greater than 0!");
            }
        } while (!(drink.getUnitPrice() > 0));
        if (DrinkBL.insertDrink(drink)) {
            System.out.println(">Insert successfully.");
        } else {
            System.out.println(">Insert fail.");
        }

    }

    private static void updateDrink() {
        System.out.println("+----------------------------------+");
        System.out.println("| >Update drink.                   |");
        System.out.println("+----------------------------------+");
        boolean isExist;
        String code;
        Drink drink;
        do {
            System.out.print(">Input drink code: ");
            code = scn().nextLine().toUpperCase();
            drink = DrinkBL.getByCode(code);
            if (drink.getCode() == null) {
                System.out.println(">Drink isn't existed!");
                isExist = false;
            } else {
                System.out.println("+-----------+------------------------------------+-----------+------+");
                System.out.printf("| %-10s| %-35s| %-10s| %-5d|\n", drink.getCode(), drink.getName(), String.format("%,.0f", drink.getUnitPrice()), drink.getSold());
                System.out.println("+-----------+------------------------------------+-----------+------+");
                isExist = true;
            }
        } while (!isExist);
        do {
            System.out.print(">Input new unit price:");
            drink.setUnitPrice(scn().nextDouble());
            if (drink.getUnitPrice() <= 0) {
                System.out.println(">Unit price must be greater than 0!");
            }
        } while (!(drink.getUnitPrice() > 0));
        if (DrinkBL.updateDrink(drink)) {
            System.out.println(">Update successfully.");
        } else {
            System.out.println(">Update fail.");
        }
        System.out.println("+----------------------------------+\n");

    }
}
