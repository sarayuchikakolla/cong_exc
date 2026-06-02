import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class p33 {

    static final String url = "jdbc:mysql://localhost:3306/bankdb";
    static final String user = "root";
    static final String password = "root";

    public static void transferMoney(int fromAcc, int toAcc, double amount) {

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            con.setAutoCommit(false);

            String debitQuery =
                    "UPDATE accounts SET balance = balance - ? WHERE acc_no = ?";

            PreparedStatement debitStmt =
                    con.prepareStatement(debitQuery);

            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, fromAcc);

            debitStmt.executeUpdate();

            String creditQuery =
                    "UPDATE accounts SET balance = balance + ? WHERE acc_no = ?";

            PreparedStatement creditStmt =
                    con.prepareStatement(creditQuery);

            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, toAcc);

            creditStmt.executeUpdate();

            con.commit();

            System.out.println("Transaction Successful");

            con.close();

        } catch (Exception e) {

            System.out.println("Transaction Failed");

            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        transferMoney(101, 102, 5000);
    }
}