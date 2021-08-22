import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EX12_q2 {
    public static void main(String args[]){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Aniruddha1");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from hospital.doctor where Experience>10 and Dept='MEDECINE' ");
            System.out.println("Q1:");
            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }

            System.out.println("Q2:");
            ResultSet r6=statement.executeQuery(" Select avg(basic+allowance) from Doctor,Salary where Dept='Ent' and Doctor.Id=Salary.Id");
            r6.next();
            int avg= r6.getInt(1);
            System.out.println(avg);

            System.out.println("Q3:");
            ResultSet r5= statement.executeQuery("Select min(allowance) from Doctor,Salary where Sex='F' and Doctor.Id=Salary.Id");
            r5.next();
            int min= r5.getInt(1);
            System.out.println(min);

            System.out.println("Q4:");
            ResultSet r4= statement.executeQuery("  Select max(consultation) from Doctor,Salary where Sex='M' and Doctor.Id=Salary.Id");
            r4.next();
            int max= r4.getInt(1);
            System.out.println(max);

            System.out.println("Q5:");
            ResultSet r1= statement.executeQuery("  SELECT count(*) from hospital.doctor where SEX = 'F'");
            r1.next();
            int count=r1.getInt(1);
            System.out.println(count);

            System.out.println("Q6:");
            ResultSet r3= statement.executeQuery(" SELECT count(*) from doctor,salary where SEX = 'M' and BASIC<4000");
            r3.next();
            int count1= r3.getInt(1);
            System.out.println(count1);

            System.out.println("Q7:");
            ResultSet r2=statement.executeQuery(" SELECT NAME, DEPT , BASIC from DOCTOR,SALARY Where DEPT = 'ENT' AND DOCTOR.ID = SALARY.ID");
            while(r2.next()){
                System.out.println(r2.getString("NAME") + " " + r2.getString("DEPT") + " " + r2.getInt("BASIC"));
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
