package vn.edu.vtc.bl;

import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;
import vn.edu.vtc.persistance.Shop;

import java.sql.Array;

public class ShopBLTest {
    @Test
    public void getShopTest1(){
        try {
            Shop actual = new Shop();
            Shop expected = new Shop();
            actual = ShopBL.getShop(1);
            expected.setShopId(1);
            expected.setName("VTC Milk Tea");
            expected.setTel("0837827421");
            expected.setAddress("18 Tam Trinh Hai Ba Trung Ha Noi");
            Assert.assertTrue(actual.getName().equals(expected.getName()));
            Assert.assertTrue(actual.getTel().equals(expected.getTel()));
            Assert.assertTrue(actual.getAddress().equals(expected.getAddress()));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void getShopTest2(){
        try {
            Shop actual = new Shop();
            actual = ShopBL.getShop(0);
            Assert.assertFalse(actual.getName().equals(null));
            Assert.assertTrue(actual.getTel().equals(null));
            Assert.assertTrue(actual.getAddress().equals(null));
        }catch (Exception e){
            //TODO:
        }
    }
}
