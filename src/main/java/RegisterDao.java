import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	private String dburl="jdbc:mysql://localhost:3306/userdb";
	private String dbuname="root";
	private String dbpassword="Chandrumaha@2022";
	private String dbdriver="com.mysql.cj.jdbc.Driver";
	public void loadDriver(String dbDriver)
	{
		try {
			 Class.forName(dbdriver="com.mysql.cj.jdbc.Driver");
			System.out.println("driverloaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection()
	{
		Connection con=null;
		try {
			con=DriverManager.getConnection(dburl, dbuname, dbpassword);
			System.out.println("connection suc");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public String insert(Member1 member)
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Data Not Entered";
		String sql="insert into userdb.std values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, member.getFirstname());
			ps.setString(2, member.getLastname());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getPassword());
			ps.setString(5, member.getConfrimpassword());
			ps.setString(6, member.getDateofbirth());
			ps.setString(7, member.getMobile());
			ps.executeUpdate();
			ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			result="Data Entered Successfully";
		}
		return result;
		
	}
	

}

