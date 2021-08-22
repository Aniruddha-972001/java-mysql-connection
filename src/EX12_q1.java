import java.sql.*;

public class EX12_q1 {
    public static void main(String args[]){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ex12", "root", "Aniruddha1");
            Statement statement = connection.createStatement();
            ResultSet r1= statement.executeQuery("select * from invigilation where DESIGNATION='assistant prof grade 1'");
            System.out.println("Q1:");
            while(r1.next()){
                System.out.println(r1.getInt("EMP_ID") + " " + r1.getString("NAME") + " " + r1.getString("DESIGNATION") + " " + r1.getString("SCHOOL") + " " + r1.getInt("NO. OF DUTIES"));
            }

            System.out.println("Q2:");
            ResultSet r2= statement.executeQuery("select * from invigilation where DESIGNATION='assistant prof senior grade' and SCHOOL='SCSE'");
            while(r2.next()){
                System.out.println(r2.getInt("EMP_ID") + " " + r2.getString("NAME") + " " + r2.getString("DESIGNATION") + " " + r2.getString("SCHOOL") + " " + r2.getInt("NO. OF DUTIES"));
            }

            System.out.println("Q3:");
            ResultSet r3= statement.executeQuery(" SELECT * FROM invigilation WHERE NAME LIKE 'A%' and DESIGNATION='assistant prof grade 2'");
            while(r3.next()){
                System.out.println(r3.getInt("EMP_ID") + " " + r3.getString("NAME") + " " + r3.getString("DESIGNATION") + " " + r3.getString("SCHOOL") + " " + r3.getInt("NO. OF DUTIES"));
            }

            System.out.println("Q4:");
            ResultSet r4= statement.executeQuery(" SELECT * FROM invigilation WHERE NAME LIKE 'A%' and DESIGNATION='assistant prof grade 1' and SCHOOL='SCSE'");
            while(r4.next()){
                System.out.println(r4.getInt("EMP_ID") + " " + r4.getString("NAME") + " " + r4.getString("DESIGNATION") + " " + r4.getString("SCHOOL") + " " + r4.getInt("NO. OF DUTIES"));
            }

            System.out.println("Q5:");
            ResultSet r5= statement.executeQuery("  SELECT * FROM invigilation WHERE NAME LIKE '%N' or NAME LIKE '%M' and SCHOOL='SENSE'");
            while (r5.next()){
                System.out.println(r5.getInt("EMP_ID") + " " + r5.getString("NAME") + " " + r5.getString("DESIGNATION") + " " + r5.getString("SCHOOL") + " " + r5.getInt("NO. OF DUTIES"));
            }

            System.out.println("Q6:");
            ResultSet r6= statement.executeQuery(" select * from invigilation where EMP_ID>52000");
            while(r6.next()){
                System.out.println(r6.getInt("EMP_ID") + " " + r6.getString("NAME") + " " + r6.getString("DESIGNATION") + " " + r6.getString("SCHOOL") + " " + r6.getInt("NO. OF DUTIES"));
            }

            System.out.println("Q7:");
            ResultSet r7= statement.executeQuery("select * from invigilation where EMP_ID>52000 and SCHOOL='SELECT'");
            while(r7.next()){
                System.out.println(r7.getInt("EMP_ID") + " " + r7.getString("NAME") + " " + r7.getString("DESIGNATION") + " " + r7.getString("SCHOOL") + " " + r7.getInt("NO. OF DUTIES"));
            }

            System.out.println("Q8:");
            ResultSet r8= statement.executeQuery(" select * from invigilation where EMP_ID>52000 and DESIGNATION='assistant prof' and SCHOOL='SMBS'");
            while(r8.next()){
                System.out.println(r8.getInt("EMP_ID") + " " + r8.getString("NAME") + " " + r8.getString("DESIGNATION") + " " + r8.getString("SCHOOL") + " " + r8.getInt("NO. OF DUTIES"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
