package com.kartik.jdbc;
import java.util.*;
import java.sql.*;
import java.io.*;
public class FetchRecords 
{
	public void getRecordsfromDB() throws SQLException
	{
		Connection c=JDBC_APPLICATION .getjdbcconnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Who are you Searching for tell me the id ?");
		int n=sc.nextInt();
		String qry="select * from Students where sid=?";
		PreparedStatement st=c.prepareStatement(qry);
		st.setInt(1,n);
		ResultSet res=st.executeQuery();
		while(res.next())
		{
			int id=res.getInt(1);
			String name=res.getString(2);
			int age=res.getInt(3);
			String crs=res.getString(4);
			System.out.println("Here is Your Details >>>>>>>>");
			System.out.println(id+" "+name+" "+age+" "+crs);
		}
		
	}
}
