package vn.edu.vtc.bl;

import vn.edu.vtc.dal.DrinkDAL;
import vn.edu.vtc.persistance.Drink;

import java.util.List;

public class DrinkBL {
    public static List<Drink> getAllDrink(){
        return DrinkDAL.getAll();
    }
    public static Drink getByCode(String code){
        return DrinkDAL.getByCode(code);
    }
    public static boolean insertDrink(Drink drink){
        return DrinkDAL.insertDrink(drink) >0;
    }
    public static boolean updateDrink(Drink drink){
        return DrinkDAL.updateDrink(drink) >0;
    }
}
