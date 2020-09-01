package vn.edu.vtc;

import vn.edu.vtc.iu.LoginIU;
import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        try (Connection ignored = vn.edu.vtc.dal.DbUtil.getConnection()) {
        } catch (SQLException ex) {
            System.out.println("| Connection Error!                                 |");
            System.out.println(ex);
        }
        LoginIU.login();
        System.out.println("\nSee you later!");
        System.out.println("|~~~~~~~~~~~_~~~~~~~~~~~~~~~|\n" +
                "|       .__(.)< (MEOW,MEOW) |\n" +
                "|        \\___)              |\n" +
                "|~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    }
}
