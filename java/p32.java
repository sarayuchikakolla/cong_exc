import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class p32 {

    static final String url = "jdbc:mysql://localhost:3306/studentdb";
    static final String user = "root";
    static final String password = "root";

    public void insertStudent(int id, String name) {

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO students VALUES(?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);

            ps.executeUpdate();

            System.out.println("Record Inserted");

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public void updateStudent(int id, String name) {

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            String query = "UPDATE students SET name=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Record Updated");

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        p32 obj = new p32();

        obj.insertStudent(1, "Saryu");

        obj.updateStudent(1, "Madhu");
    }
}