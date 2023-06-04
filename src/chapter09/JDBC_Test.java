package chapter09;

import java.sql.*;

/**
 * @author SDKany
 * @ClassName JDBC_Test
 * @Date 2023/5/27 10:47
 * @Version V1.0
 * @Description
 */
public class JDBC_Test {
    public static void main(String[] args) {
        Statement statement = null;
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
            String url = "jdbc:mysql://localhost:3306/java_jdbc?characterEncoding=utf8&useSSL=false";
            String username = "root";
            String passwd = "root";
            conn = DriverManager.getConnection(url, username, passwd);
//            {
//                statement = conn.createStatement();
//                String sql = "select * from student ";
//                rs = statement.executeQuery(sql);
//            }

            {
                String sql = "select * from student where student.id >= ? ";
                preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setInt(1, 3);
                rs = preparedStatement.executeQuery();
            }

            System.out.println("id    \t|\tname   \t|\tsex   \t|\tphone   \t|\tage");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                String phone = rs.getString("phone_number");
                int age = rs.getInt("age");
                System.out.println(id + "   \t|\t" + name + "   \t|\t" + sex + "   \t|\t" + phone + "\t|\t" + age);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
