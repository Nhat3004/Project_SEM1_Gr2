package vn.edu.vtc.dal;

import vn.edu.vtc.persistance.Staff;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaffDAL {
    public Staff login(String acc, String pss) {
        Staff staff = new Staff();
        String sql = "select * from Staff where account='" + acc + "' and password='" + pss + "'";
        try (Connection conn = DbUtil.getConnection();
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery(sql)) {
            while (rs.next()) {
                staff = getStaff(rs);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            staff = null;
        }
        return staff;
    }
    public static Staff getStaffByID(int id){
        Staff staff = new Staff();
        String sql = "select * from Staff where staff_id="+id;
        try (Connection conn = DbUtil.getConnection();
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery(sql)) {
            while (rs.next()) {
                staff = getStaff(rs);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            staff = null;
        }
        return staff;

    }
    private static Staff getStaff(final ResultSet rs) throws SQLException {
        Staff st = new Staff();
        st.setStaffId(rs.getInt("staff_id"));
        st.setName(rs.getString("staff_name"));
        st.setTel(rs.getString("staff_tel"));
        st.setAddress(rs.getString("staff_address"));
        st.setEmail(rs.getString("staff_email"));
        st.setId_card(rs.getString("staff_id_card"));
        st.setPosition(rs.getString("position"));
        return st;
    }

}
