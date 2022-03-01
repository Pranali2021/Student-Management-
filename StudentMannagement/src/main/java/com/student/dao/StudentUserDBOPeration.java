package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.student.dao.DBconnection;

public class StudentUserDBOPeration {

	public static void main(String[] args) {

		DBconnection ob=new DBconnection();
		Connection conn=ob.connection();
		public boolean login(long LoginId,String password) throws SQLException
		{
			
			Connection conn;
			PreparedStatement stmt=conn.prepareStatement("select * from studentUser where  LoginId=? and userPassword=? ");
			stmt.setLong(1, LoginId);
			stmt.setString(2,password);
			
			ResultSet result=stmt.executeQuery();
			if(result.next()) //true or false
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public void logout() throws SQLException
		{
			Connection conn;
			conn.close();
	}

}
	
