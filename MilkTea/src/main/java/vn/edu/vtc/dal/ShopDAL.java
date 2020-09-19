package vn.edu.vtc.dal;

import vn.edu.vtc.persistance.Shop;

import java.sql.*;

public class ShopDAL {
    public static Shop getShop(final ResultSet rs) throws SQLException {
        Shop sp = new Shop();
        sp.setName(rs.getString("shop_name"));
        sp.setAddress(rs.getString("shop_address"));
        sp.setTel(rs.getString("shop_tel"));
        return sp;
    }

    public static Shop getShopById(int id) throws SQLException {
        Shop shop = new Shop();
        String sql = "select * from Shop where shop_id=" + id;
        try (Connection conn = DbUtil.getConnection();
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery(sql)) {
            while (rs.next()) {
                shop = getShop(rs);
            }
        } catch (SQLException e) {
            System.out.println(e);
            shop = null;
        }
        return shop;
    }
}
