package com.register.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class registerdao
{
	String sql="insert into login(uname,pass) values(?,?)";
	public Boolean check(String uname, String pass){
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			int rs=st.executeUpdate();
			 if (rs > 0) 
			  {
	              return true;
			   }
		  }
		 catch (Exception e) {
			 e.printStackTrace();
		}
		return false;
	}
		 public Boolean ch(String uname){
			 try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
				String sql1="Select * from login where uname= ?";
				PreparedStatement st=con.prepareStatement(sql1);
				st.setString(1, uname);;
				ResultSet rs=st.executeQuery();
				if(rs.next())
				{
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;

		}
}

