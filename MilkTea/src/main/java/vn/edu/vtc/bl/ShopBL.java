package vn.edu.vtc.bl;

import vn.edu.vtc.dal.ShopDAL;
import vn.edu.vtc.persistance.Shop;

import java.sql.SQLException;

public class ShopBL {
    public static Shop getShop(int id) throws SQLException {
        return ShopDAL.getShopById(id);
    }
}
