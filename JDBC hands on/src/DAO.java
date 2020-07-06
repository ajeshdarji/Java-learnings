import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class DAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentDAO dao=new studentDAO();
		student s1=dao.getStudent(6,"manu");
		//System.out.println(s1.username);

	}

}
class studentDAO
{
	public student getStudent(int userid, String username)
	{
		try {
			student s = new student();
			s.userid= userid;
			s.username=username;
			String sql="INSERT INTO student VALUES(?,?)";
			 Class.forName("com.mysql.jdbc.Driver");
		     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
		     //java.sql.Statement st=con.createStatement();
		     PreparedStatement st=con.prepareStatement(sql);
		    // ResultSet rs=st.executeQuery(sql);
		     //rs.next();
		     //String name=rs.getString(1);
		     //s.username=name;
		     st.setInt(1, s.userid);
		     st.setString(2,s.username);
		     st.executeUpdate();
			//return s;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return null;
	}
}
class student{
	int userid;
	String username;
}
