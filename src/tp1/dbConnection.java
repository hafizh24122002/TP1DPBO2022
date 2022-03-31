package tp1;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hafizh
 */
public class dbConnection {
    public static Connection con;
    public static Statement stm;
    
    public void connect() {
        try {
            String url  = "jdbc:mysql://localhost/db_perpustakaan";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.err.println("Koneksi gagal " + e.getMessage());
        }
    }
    
    public DefaultTableModel readTableAuthor() {
        DefaultTableModel dataTabel = null;
        try {
            Object[] column = {"nama", "jumlah_buku"};
            connect();
            dataTabel = new DefaultTableModel(null, column);
            String sql = "select nama, jumlah_buku from author";
            ResultSet res = stm.executeQuery(sql);

            // int no = 1;
            while(res.next()) {
                Object[] hasil = new Object[Array.getLength(column)];
                hasil[0] = res.getString("nama");
                hasil[1] = res.getString("jumlah_buku");
                dataTabel.addRow(hasil);
            }
        } catch (Exception e) {
            System.err.println("Read gagal " + e.getMessage());
        }

        return dataTabel;
    }
    
    public DefaultTableModel readTableBuku() {
        DefaultTableModel dataTabel = null;
        try {
            Object[] column = {"penerbit", "author", "desc"};
            connect();
            dataTabel = new DefaultTableModel(null, column);
            String sql = "select penerbit, author, descr from buku";
            ResultSet res = stm.executeQuery(sql);

            // int no = 1;
            while(res.next()) {
                Object[] hasil = new Object[Array.getLength(column)];
                hasil[0] = res.getString("penerbit");
                hasil[1] = res.getString("author");
                hasil[2] = res.getString("descr");
                dataTabel.addRow(hasil);
            }
        } catch (Exception e) {
            System.err.println("Read gagal " + e.getMessage());
        }

        return dataTabel;
    }
    
    public void Query(String input) {
        try {
            connect();
            String sql = input;
            stm.execute(sql);
        } catch (Exception e) {
            System.err.println("Read gagal " + e.getMessage());
        }
    }
}