package vn.edu.vtc.bl;

import org.junit.Assert;
import org.junit.Test;
import vn.edu.vtc.persistance.Drink;

public class DrinkBLTest {
    @Test
    public void getByCodeTest1(){
        Drink actual = new Drink();
        Drink expected = new Drink();
        actual = DrinkBL.getByCode("TOPPING1");
        expected.setCode("TOPPING1");
        expected.setName("Pearl");
        expected.setSold(0);
        expected.setUnitPrice(5000.0);
        Assert.assertTrue(actual.getCode().equals(expected.getCode()));
        Assert.assertTrue(actual.getName().equals(expected.getName()));
        Assert.assertTrue(actual.getUnitPrice().equals(expected.getUnitPrice()));
        Assert.assertTrue(actual.getSold()==(expected.getSold()));

    }
    @Test
    public void insertDrinkTest1(){
        Drink actual = new Drink();
        Drink expected = new Drink();
        expected.setCode("TOPPING10");
        expected.setName("Pearl10");
        expected.setSold(0);
        expected.setUnitPrice(5000.0);
        Assert.assertTrue(DrinkBL.insertDrink(expected));
        actual = DrinkBL.getByCode("TOPPING10");
        Assert.assertTrue(actual.getCode().equals(expected.getCode()));
        Assert.assertTrue(actual.getName().equals(expected.getName()));
        Assert.assertTrue(actual.getUnitPrice().equals(expected.getUnitPrice()));
        Assert.assertTrue(actual.getSold()==(expected.getSold()));

    }
    @Test
    public void updateDrinkTest1(){
        Drink actual = new Drink();
        Drink expected = new Drink();
        expected.setCode("TOPPING10");
        expected.setName("Pearl10");
        expected.setSold(0);
        expected.setUnitPrice(1000.0);
        Assert.assertTrue(DrinkBL.updateDrink(expected));
        actual = DrinkBL.getByCode("TOPPING10");
        Assert.assertTrue(actual.getCode().equals(expected.getCode()));
        Assert.assertTrue(actual.getName().equals(expected.getName()));
        Assert.assertTrue(actual.getUnitPrice().equals(expected.getUnitPrice()));
        Assert.assertTrue(actual.getSold()==(expected.getSold()));

    }
}
