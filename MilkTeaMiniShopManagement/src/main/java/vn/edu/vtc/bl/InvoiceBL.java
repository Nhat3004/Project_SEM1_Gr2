package vn.edu.vtc.bl;

import vn.edu.vtc.dal.InvoiceDAL;
import vn.edu.vtc.persistance.Drink;

import java.util.List;

public class InvoiceBL {
    private static InvoiceDAL dal = new InvoiceDAL();

    public static int insertInvoice(int staffID, int shopID, int ice, int sugar) {
        return dal.insertInvoice(staffID, shopID, ice, sugar);
    }

    public static boolean insertInvoiceDetails(int invoiceID, String drinkCode, int quantity) {
        return dal.insertInvoiceDetails(invoiceID, drinkCode, quantity) > 0;
    }

    public static boolean updateInvoiceDetails(int invoiceID, String drinkCode, int quantity, int change) {
        return dal.updateInvoiceDetails(invoiceID, drinkCode, quantity, change) > 0;
    }
}
