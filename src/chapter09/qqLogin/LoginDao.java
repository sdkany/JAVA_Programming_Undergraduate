package chapter09.qqLogin;
import java.sql.*;
public class LoginDao {
	PreparedStatement prestmt = null;
	Connection conn = null;
	ResultSet rs = null;
	// 查询用户
	public Boolean findUser(String qqnumber, String pwd) 
											throws SQLException {
		try {
			// 1.加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root";
			// 2.获取数据库连接
			conn = DriverManager.getConnection(url, username, password);
			// 3.定义需要执行的SQL
			String sql = "select * from tb_qquser " 
						+ "where qqnumber = ? " 
						+ "and password = ?";
			// 4.创建PreparedStatement对象
			prestmt = conn.prepareStatement(sql);
			prestmt.setString(1, qqnumber);
			prestmt.setString(2, pwd);
			// 5.执行SQL并将获取的数据信息存放在ResultSet中
			rs = prestmt.executeQuery();
			// 如果查询的结果集中有超过一条的记录，则登录成功
			if (rs.next()) { return true; }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.释放资源
			if (rs != null) { rs.close(); }
			if (prestmt != null) { prestmt.close();	}
			if (conn != null) {	conn.close(); }
		}
		return false;
	}
}
