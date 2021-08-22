
import java.sql.*;

public class fat_ques {
    public static void main(String args[]) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ex12", "root", "Aniruddha1");
            Statement statement = connection.createStatement();
            ResultSet r1=statement.executeQuery("CREATE TABLE `prakhar`.`employee` ( +" +
                    "`ename` VARCHAR(45) NOT NULL,+" +
                    "`eno` INT NOT NULL,+" +
                    "PRIMARY KEY (`reg no`)););"+
                    "`salary` INT NOT NULL,+" );
            ResultSet r2= statement.executeQuery("INSERT INTO `prakhar`.`employee` (`ename`, `eno`, `salary`) VALUES ('prakhar', '1021', '40000');" +
                    "INSERT INTO `prakhar`.`employee` (`ename`, `eno`, `salary`) VALUES ('akshath', '1022', '50000');" +
                    "INSERT INTO `prakhar`.`employee` (`ename`, `eno`, `salary`) VALUES ('mayur', '1023', '60000');");
            ResultSet r3= statement.executeQuery(" UPDATE employee SET salary= salary + (salary * 10 / 100)");
            while(r3.next()){
                System.out.println(r3.getString("ename") + " " + r3.getInt("eno") + " " + r3.getInt("salary"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
