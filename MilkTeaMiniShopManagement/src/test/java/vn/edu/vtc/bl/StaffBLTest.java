package vn.edu.vtc.bl;

import org.junit.Assert;
import org.junit.Test;
import vn.edu.vtc.persistance.Staff;

public class StaffBLTest {
    @Test
    public void getMD5Test1() {
        try {
            String result = StaffBL.getMd5("Nhatnl3004");
            String expected = "df7ac565f8308523e45b3b528513d8bd";
            Assert.assertEquals(result, expected);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void getMD5Test2() {
        try {
            String result = StaffBL.getMd5("Nhatnl19024");
            String expected = "80be2a761fe62ab3f023e3f77dc9b8dd";
            Assert.assertEquals(result, expected);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void getMD5Test3() {
        try {
            String result = StaffBL.getMd5("cuongDeeptry1");
            String expected = "38ed25b6ec4c911283f7da1626e9cead";
            Assert.assertEquals(result, expected);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void getMD5Test4() {
        try {
            String result = StaffBL.getMd5("cuongDeeptry2");
            String expected = "7a98924465e161165a7fa692b11649f1";
            Assert.assertEquals(result, expected);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void regexAccountTest1() {
        try {
            Assert.assertTrue(StaffBL.accountRegex("Nhatnl3004"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void regexAccountTest2() {
        try {
            Assert.assertTrue(StaffBL.accountRegex("cuongDeeptry1"));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void regexAccountTest3() {
        try {
            Assert.assertFalse(StaffBL.accountRegex("Nhatnl"));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void regexAccountTest4() {
        try {
            Assert.assertFalse(StaffBL.accountRegex("98765431"));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void regexAccountTest5() {
        try {
            Assert.assertFalse(StaffBL.accountRegex("Nhatnl99999999999999999999"));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void regexPasswordTest1() {
        try {
            Assert.assertTrue(StaffBL.passwordRegex("Nhatnl19024"));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void regexPasswordTest2() {
        try {
            Assert.assertTrue(StaffBL.passwordRegex("cuongDeeptry2"));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void regexPasswordTest3() {
        try {
            Assert.assertFalse(StaffBL.passwordRegex("123456"));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void regexPasswordTest4() {
        try {
            Assert.assertFalse(StaffBL.passwordRegex("qwert"));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void regexPasswordTest5() {
        try {
            Assert.assertFalse(StaffBL.passwordRegex("Nhatnl.3040"));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    @Test
    public void loginTest() {
        try {
            Staff actual = StaffBL.login("Nhatnl3004", "Nhatnl19024");
            Staff expected = new Staff();
            expected.setStaffId(1);
            expected.setName("Nguyen Long Nhat");
            expected.setTel("0966452513");
            expected.setAddress("Vinh Phuc");
            expected.setEmail("longnhat8556@gmail.com");
            expected.setId_card("026200004041");
            expected.setPosition("Staff");
            Assert.assertTrue(actual.getStaffId() == (expected.getStaffId()));
            Assert.assertTrue(actual.getName().equals(expected.getName()));
            Assert.assertTrue(actual.getTel().equals(expected.getTel()));
            Assert.assertTrue(actual.getAddress().equals(expected.getAddress()));
            Assert.assertTrue(actual.getEmail().equals(expected.getEmail()));
            Assert.assertTrue(actual.getId_card().equals(expected.getId_card()));
            Assert.assertTrue(actual.getPosition().equals(expected.getPosition()));
        } catch (Exception e) {

            //TODO: handle exception
        }
    }
}