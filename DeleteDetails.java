package com.kartik.jdbc;
import java.sql.*;
import java.util.Scanner;

public class DeleteDetails 
{
  public void delete() throws SQLException
  {
	  Connection c=JDBC_APPLICATION.getjdbcconnection();
	  String qry="delete from Students where sid=?";
	  PreparedStatement st=c.prepareStatement(qry);
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Id to be deleted ");
	  int id=sc.nextInt();
	  System.out.println("enter the cousre as well");
	  String s=sc.nextLine();
//	  st.setString(4,s);
	  st.setInt(1,id);
//	  st.setString(4,s);
	  st.executeUpdate();
	  System.out.println("deleted Succesfully");
	  
  }
}
