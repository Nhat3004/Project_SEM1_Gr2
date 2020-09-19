package vn.edu.vtc.bl;

import vn.edu.vtc.dal.StaffDAL;
import vn.edu.vtc.persistance.Staff;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StaffBL {
    private static StaffDAL dal = new StaffDAL();
    public static String getMd5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static Staff login(String acc, String pss){
        return dal.login(getMd5(acc), getMd5(pss));
    }
    public static boolean accountRegex(String acc){
        if (acc.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,20}$")){
            return true;
        }else {
            return false;
        }

    }

    public static boolean passwordRegex(String pss){
        if (pss.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")){
            return true;
        }else {
            return false;
        }
    }
}