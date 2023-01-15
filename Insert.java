package com.kartik.jdbc;
import java.sql.*;
import java.util.*;

public class Insert
{

	public void insertData() throws SQLException
	{
		
		
		Connection c=JDBC_APPLICATION.getjdbcconnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sid");
		int id=sc.nextInt();
		System.out.println("Enter sname");
		String name=sc.next();
		System.out.println("Enter sAge");
		int age=sc.nextInt();
		System.out.println("Enter Coursename");
		String course=sc.next();
		String qry="insert into Students(sid,sname,age,course) values(?,?,?,?)";
		PreparedStatement st=c.prepareStatement(qry);
		st.setInt(1, id);
		st.setString(2,name);
		st.setInt(3,age);
		st.setString(4, course);
		st.executeUpdate();
		System.out.println("DATA INSERTED SUCCESFULLY");
		
	}
}
