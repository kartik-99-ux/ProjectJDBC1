package com.kartik.jdbc;
import java.sql.*;
import java.util.*;
import java.io.*;

public class Update
{
   public void Update() throws SQLException
   {
	   Connection c=JDBC_APPLICATION.getjdbcconnection();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Provide the below Information");
//	   String newcourse=sc.nextLine();
	   System.out.println("Enter Your id?");
	   int id=sc.nextInt();
	   sc.nextLine();
	   System.out.println("Enter new name...");
	   String newname=sc.nextLine();
//	   sc.nextLine();
	   System.out.println("Enter new age...");
	   int newage=sc.nextInt();
	   sc.nextLine();
	   System.out.println("Enter new cousre");
	   String ncousre=sc.nextLine();
	   String qry="Update Students Set sname=?,age=?,course=? where sid=?";
	   PreparedStatement st=c.prepareStatement(qry);
	   st.setString(1,newname);
	   st.setInt(2,newage);
	   st.setString(3,ncousre);
	   st.setInt(4,id);
	   //st.setString(2,newcourse);
	   st.executeUpdate();
	   System.out.println("Details Updated Succesfully");
	   
   }
}
