package vn.edu.vtc.dal;

import vn.edu.vtc.persistance.Drink;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DrinkDAL {
    public static List<Drink> getAll() {
        String sql = "select * from Drink order by sold DESC";
        List<Drink> lst = new ArrayList<>();
        try (Connection con = DbUtil.getConnection();
             Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery(sql)) {
            while (rs.next()) {
                lst.add(getDrink(rs));
            }
        } catch (SQLException ex) {
            lst = null;
        }
        return lst;
    }
    public  static Drink getByCode(String code){
        String sql = "Select * from Drink where drink_code='"+code+"'";
        Drink drink = new Drink();
        try (Connection con = DbUtil.getConnection();
             Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery(sql)) {
            while (rs.next()) {
                drink=getDrink(rs);
            }
        } catch (SQLException ex) {
            drink = null;
        }
        return drink;
    }
    private static Drink getDrink(final ResultSet rs) throws SQLException {
        Drink drink = new Drink();
        drink.setCode(rs.getString("drink_code"));
        drink.setName(rs.getString("drink_name"));
        drink.setUnitPrice(rs.getDouble("drink_unit_price"));
        drink.setSold(rs.getInt("sold"));
        return drink;
    }

    public static int insertDrink(Drink drink) {
        int result;
        String callStoreProcedure = "call sp_insertDrink(?,?,?,?)";
        try (CallableStatement cstm = DbUtil.getConnection().prepareCall(callStoreProcedure)) {
            cstm.setString(1, drink.getCode());
            cstm.setString(2, drink.getName());
            cstm.setDouble(3, drink.getUnitPrice());
            cstm.registerOutParameter(4, Types.INTEGER);
            cstm.execute();
            result = cstm.getInt(4);
        } catch (Exception e) {
            System.out.println(e);
            result = -1;
        }
        return result;
    }

    public static int updateDrink(Drink drink) {
        int result;
        String callStoreProcedure = "call sp_updateDrink(?,?,?)";
        try (CallableStatement cstm = DbUtil.getConnection().prepareCall(callStoreProcedure)) {
            cstm.setString(1, drink.getCode());
            cstm.setDouble(2, drink.getUnitPrice());
            cstm.registerOutParameter(3, Types.INTEGER);
            cstm.execute();
            result = cstm.getInt(3);
        } catch (Exception e) {
            result = -1;
        }
        return result;
    }
}
