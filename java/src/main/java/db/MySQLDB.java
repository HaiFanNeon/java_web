package db;

import com.mysql.cj.jdbc.Driver;
import org.apache.commons.lang3.StringUtils;
import pojo.User;

import java.sql.*;
import java.util.StringJoiner;

public class MySQLDB {
    public void registerDriver() {
        try {
            //注册驱动（new com.mysql.jdbc.Driver()也是可以的）
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        try {
            //注册驱动
            registerDriver();

            //获取数据库连接
            //url统一资源定位
            String url = "jdbc:mysql://1.117.232.232:3306/class";
            String userName = "root";
            String passWord = "";
            Connection connection = DriverManager.getConnection(url, userName, passWord);

            //打印Connection对象的内存地址：com.mysql.cj.jdbc.ConnectionImpl@69d9c55
//            System.out.println("MySql数据库，对java.sql.Connection接口的实现类的完整类名：" + connection);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Statement getStatement() {
        try {
            Connection connection = getConnection();
            Statement statementOne = connection.createStatement();
//            System.out.println("MySql数据库，对java.sql.Statement接口的实现类的完整类名：" + statementOne);
            return statementOne;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void executeSqlInsert(User user) {
        try {
            Connection conn = getConnection();

            String sql = "insert into tellphone(name, gender, tellphone) values(?, ? , ?)";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getGender());
            preparedStatement.setString(3, user.getTellphone());
            int i = preparedStatement.executeUpdate();
            System.out.println(i);
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executeSqlDelete(int id) {
        try {
            Connection conn = getConnection();

            String sql = "delete from tellphone where id = ?";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(id));
            int i = preparedStatement.executeUpdate();
            System.out.println(i);
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void select(int id) {
        try {
            //获取数据库操作对象
            Statement statement = getStatement();

            //将sql语句发送给数据库管理系统，数据库管理系统（DBMS）会编译并执行该sql语句，把查询结果集放到ResultSet结果集对象中
            ResultSet resultSet = statement.executeQuery("select * from tellphone where id = " + String.valueOf(id));

            //处理查询结果集，一个Statement可以得出多个ResultSet
            //resultSet.next()方法作用：if the new current row is valid, return true. if there are no more rows, return false
            //将光标向前移动一行，如果指向当前行有记录，则返回true，若指向当前行无记录，返回false
            while (resultSet.next()) {

                //第三种方式：通过特定类型获取数据，该方式，明确知道字段的类型，可以节省类型转换花费的性能，该方式的程序更加健壮，性能更高，推荐使用
                int ids = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                String tellphone = resultSet.getString("tellphone");
                boolean collection = resultSet.getBoolean("collection");

                StringJoiner sj = new StringJoiner(" ");
//                StringJoiner add = sj.add(name).add(gender).add(tellphone).add(collection == true ? "特别关心" : "非特别关心");
                StringJoiner add = sj.add(String.valueOf(id)).add(gender).add(tellphone).add(collection == true ? "特别关心" : "非特别关心");
                System.out.println(add.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectAll() {
        try {
            //获取数据库操作对象
            Statement statement = getStatement();

            //将sql语句发送给数据库管理系统，数据库管理系统（DBMS）会编译并执行该sql语句，把查询结果集放到ResultSet结果集对象中
            ResultSet resultSet = statement.executeQuery("select * from tellphone");

            //处理查询结果集，一个Statement可以得出多个ResultSet
            //resultSet.next()方法作用：if the new current row is valid, return true. if there are no more rows, return false
            //将光标向前移动一行，如果指向当前行有记录，则返回true，若指向当前行无记录，返回false
            while (resultSet.next()) {

                //第三种方式：通过特定类型获取数据，该方式，明确知道字段的类型，可以节省类型转换花费的性能，该方式的程序更加健壮，性能更高，推荐使用
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                String tellphone = resultSet.getString("tellphone");
                boolean collection = resultSet.getBoolean("collection");

                StringJoiner sj = new StringJoiner(" ");
//                StringJoiner add = sj.add(name).add(gender).add(tellphone).add(collection == true ? "特别关心" : "非特别关心");
                StringJoiner add = sj.add(String.valueOf(id)).add(name).add(gender).add(tellphone).add(collection == true ? "特别关心" : "非特别关心");
                System.out.println(add.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
