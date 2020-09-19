package vn.edu.vtc.dal;

import vn.edu.vtc.persistance.Drink;
import vn.edu.vtc.persistance.Invoice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InvoiceDAL {
    public static Invoice getInvoiceByID(int id) {
        String sql = "select * from Invoice where invoice_id =" + id;
        Invoice invoice = new Invoice();
        try (Connection con = DbUtil.getConnection();
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {
            while (rs.next()) {
                invoice = getInvoice(rs);
            }
        } catch (SQLException ex) {
            invoice.setId(-1);
            System.out.println(ex);
        }
        return invoice;
    }

    public static List<Drink> getInvoiceDetails(int id) {
        String sql = "select concat(d.drink_name,'-Ice:',od.ice,'-Sugar: ',od.sugar) as drink_name,d.drink_code, d.drink_unit_price, od.quantity, od.ice, od.sugar from InvoiceDetails od inner join Drink d where invoice_id="
                + id + " and od.drink_code=d.drink_code";
        List<Drink> lst = new ArrayList<>();
        try (Connection con = DbUtil.getConnection();
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {
            while (rs.next()) {
                lst.add(getDrink(rs));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            lst = null;
        }
        return lst;
    }

    public static int insertInvoice(int staffID, int shopID) {
        String sql1 = "call sp_insertInvoice(" + staffID + "," + shopID + ")";
        try (Connection con = DbUtil.getConnection();
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql1);) {
        } catch (SQLException ex) {
            System.err.println(ex);
        }

        int idInvoice = -1;
        String sql2 = "select max(invoice_id) from Invoice";
        try (Connection con = DbUtil.getConnection();
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql2)) {
            while (rs.next()) {
                idInvoice = rs.getInt("max(invoice_id)");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            idInvoice = -1;
        }
        return idInvoice;

    }

    public static int insertInvoiceDetails(int invoiceID, String drinkCode, int quantity, int ice, int sugar) {
        int result;
        String sql1 = "call sp_insertInvoiceDetails(" + invoiceID + ",'" + drinkCode + "'," + quantity + "," + ice + ","
                + sugar + ")";
        try (Connection con = DbUtil.getConnection();
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql1);) {
            result = 1;
        } catch (SQLException ex) {
            System.err.println(ex);
            result = -1;
        }
        return result;
    }

    public static int updateInvoiceDetails(int invoiceID, String drinkCode, int quantity, int change, int ice,
            int sugar) {
        int result;
        String sql1 = "call sp_updateInvoiceDetails(" + invoiceID + ",'" + drinkCode + "'," + quantity + "," + change
                + "," + ice + "," + sugar + ")";
        try (Connection con = DbUtil.getConnection();
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql1);) {
            result = 1;
        } catch (SQLException ex) {
            System.err.println(ex);
            result = -1;
        }
        return result;
    }

    private static Invoice getInvoice(final ResultSet rs) throws SQLException {
        Invoice invoice = new Invoice();
        invoice.setId(rs.getInt("invoice_id"));
        invoice.setShopId(rs.getInt("shop_id"));
        invoice.setStaffId(rs.getInt("staff_id"));
        invoice.setDate(rs.getString("invoice_date"));
        return invoice;
    }

    private static Drink getDrink(final ResultSet rs) throws SQLException {
        Drink drink = new Drink();
        drink.setCode(rs.getString("drink_code"));
        drink.setName(rs.getString("drink_name"));
        drink.setUnitPrice(rs.getDouble("drink_unit_price"));
        drink.setQuantity(rs.getInt("quantity"));
        drink.setIce(rs.getInt("ice"));
        drink.setSugar(rs.getInt("sugar"));
        drink.setAmount(drink.getUnitPrice() * drink.getQuantity());
        return drink;
    }

}
