package chapter09;
import java.sql.*;
public class Example01 {
	public static void main(String[] args) throws SQLException  {
		Connection conn =null;
		Statement stmt =null;
		ResultSet rs =null;
		try {
			// 1. 加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2.通过DriverManager获取数据库连接
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root";
			conn = DriverManager.getConnection(url,username, password);
			// 3.通过Connection对象获取Statement对象
			stmt = conn.createStatement();
			// 4.使用Statement执行SQL语句
			String sql = "select * from tb_user";
			rs = stmt.executeQuery(sql);
			// 5. 操作ResultSet结果集
			System.out.println("id	|	name  	|	sex  "
							    + "   |	email		|	birthday ");
			while (rs.next()) {
				int id = rs.getInt("id");    // 通过列名获取指定字段的值
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String email = rs.getString("email");
				Date birthday = rs.getDate("birthday");
				System.out.println(id + "	|	" + name + "	|	"
					   	+ sex + "	|	" + email + "	|	" + birthday);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6.关闭连接，释放资源
			if(rs !=null){ rs.close(); }
			if(stmt !=null){ stmt.close(); }
			if(conn !=null){ conn.close(); }
		}
	}
}

