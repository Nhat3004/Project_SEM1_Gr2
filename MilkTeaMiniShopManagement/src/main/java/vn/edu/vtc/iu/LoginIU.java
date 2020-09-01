package vn.edu.vtc.iu;

import vn.edu.vtc.bl.StaffBL;
import vn.edu.vtc.persistance.Staff;

import java.io.Console;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginIU {

    public static Scanner scn() {
        return new Scanner(System.in);
    }

    private static String pos;
    private static int id;

    public static void login() throws SQLException {
        System.out.println("+---------------------------------------------------+");
        System.out.println("| Welcome to our app: Milk Tea mini shop management.|");
        System.out.println("| Please login to use your features. ^^^            |");
        System.out.println("+---------------------------------------------------+\n");

        boolean log = true;
        while (log) {
            System.out.println("+---------------------------------------------------+");
            System.out.print("> Enter your account: ");
            String acc = scn().nextLine();
//            System.out.print("> Enter your password: ");
//            String pss = scn().nextLine();

        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }
        String pss=null;
        char[] passwordArray = console.readPassword("> Enter your password: ");
        pss = new String(passwordArray);
            System.out.println("+---------------------------------------------------+\n");
            if (!StaffBL.accountRegex(acc)) {
                System.out.println("> Your account is invalid, 8-20 characters, at least\none uppercase letter, one lowercase letter and one\nnumber.");
                log = true;
            }
            if (!StaffBL.passwordRegex(pss)) {
                System.out.println("> Your password is invalid, minimum eight characters,\nat least one uppercase letter, one lowercase letter\nand one number.");
                log = true;
            } else {
                Staff staff = StaffBL.login(acc, pss);
                if (staff.getStaffId() == 0) {
                    System.out.println("+---------------------------------------------------+");
                    System.out.println("> Login fail!");
                    System.out.println("> Incorrect password or account doesn't exist.");
                    log = true;
                } else {
                    System.out.println("+---------------------------------------------------+");
                    System.out.println("> Login successfully!");
                    System.out.printf("> Welcome %s %s.\n", staff.getPosition(), staff.getName());
                    log = false;
                    pos = staff.getPosition();
                    id= staff.getStaffId();
                }
                System.out.println("+---------------------------------------------------+\n");
            }
        }
        if (pos.equals("Manager")) {
            ManagerIU.Manager();
        } else if (pos.equals("Staff")) {
            StaffIU.Staff(id);
        }
    }
}
