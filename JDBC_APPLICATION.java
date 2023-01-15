package com.kartik.jdbc;
import java.sql.*;
import java.util.*;
import java.io.*;

public class JDBC_APPLICATION 
{
	static Connection conn=null;
	public static Connection getjdbcconnection()
	{
		try
		{
		   FileInputStream fis=new FileInputStream("D:\\JAVA_APPLICATION\\ADVANCEJAVA\\kartik\\jdbc\\app.properties");
		   Properties pr=new Properties();
		   pr.load(fis);
		   String url=pr.getProperty("url");
		   String username=pr.getProperty("user");
		   String pass=pr.getProperty("password");
		   conn=DriverManager.getConnection(url,username,pass);
		   System.out.println("Connection established");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				//conn.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static void main(String[] args) throws SQLException 
	{
		
		System.out.println("Welcome to JDBC CRUD application");
		System.out.println("Enter 1 For Insert ");
		System.out.println("2 for getting Details ");
		System.out.println("Enter 3 For Update ");
		System.out.println("Enter 4 for Delete ");
			
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1)
		{
			Insert in=new Insert();
			in.insertData();
		}
		else if(num==2)
		{
			FetchRecords ft=new FetchRecords();
			ft.getRecordsfromDB();
		}
		else if(num==3)
		{
			Update up=new Update();
			up.Update();
		}
		else if(num==4)
		{
			DeleteDetails d=new DeleteDetails();
			d.delete();
		}
			
		else
		{
			System.out.println("Exit the application");
			System.exit(0);
		}
			
          
	}

}
