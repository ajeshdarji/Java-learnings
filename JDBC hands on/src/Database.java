import java.sql.*;
import java.util.Scanner;

public class Database {

	public static void main(String[] args) throws Exception{
		Scanner s= new Scanner(System.in);
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="";
		System.out.println("Enter User Name");
		String username=s.next();
		System.out.println("Enter User Id");
		int userid=s.nextInt();
		String sql="INSERT INTO student VALUES(?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, user, password);
        //Statement st=con.createStatement();
        PreparedStatement st=con.prepareStatement(sql);
       // ResultSet rs=st.executeQuery(sql);
        st.setInt(1, userid);
        st.setString(2, username);
        int count=st.executeUpdate();
        System.out.println(""+count);
        //while(rs.next())
        //{
        //String name=rs.getInt(1)+":"+rs.getString(2);
        //ystem.out.println(" "+name);
        //}
        st.close();
        con.close();
	}

}
