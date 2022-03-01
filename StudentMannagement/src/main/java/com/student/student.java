package com.student;

import java.util.Scanner;

import com.student.dao.StudentUserDBOPeration;
import com.student.entities.StudentUser;

public class student {

	public static void main(String[] args) {
		{
	    	System.out.println("=======================================================================================");
	        System.out.println("                         Welcome to Student Management System                          ");
	        System.out.println("=======================================================================================");
	    boolean status=true;
	    	do {
	    	try
	    	{
	        Scanner scan=new Scanner( System.in);
	        System.out.println("\t Press 1 -> Student Management System");
	        int userType=scan.nextInt();
	        StudentUserDBOPeration ob=new StudentUserDBOPeration();
	        if(userType==1)
	        {
	        	System.out.println("\t Enter Login Id:");
	        	long LoginId=scan.nextLong();
	        	System.out.println("\t Enter Password:");
	        	String password=scan.next();
	        	boolean validUser=ob.login(LoginId, password);
	        	if(validUser)
	        	{
	        		System.out.println("Login Successfully!!");
	        		System.out.println("\t 1.New Registration\r\n"
	    	       			+ "2.Delete Student Information\r\n"
	    	       			+ "3.Check Student Information\r\n"
	    	       			+ "4.Password Change\r\n"
	    	       			+ "5.Logout");
	        		int operation=scan.nextInt();
	    	       	if(operation==1)
	    	       	{
	    	       		System.out.println("========================================================");
	    	            System.out.println("                    New Registration                    ");
	    	            System.out.println("========================================================");
	    	       		System.out.println(" Enter Student Id for the user:");
	    	        	long stuId=scan.nextLong();
	    	        	System.out.println(" Enter Student name:");
	    	        	String stuName=scan.next();
	    	        	System.out.println(" Enter Student address:");
	    	        	String stuAddress=scan.next();
	    	        	System.out.println(" Enter Email address:");
	    	        	String stuEmail=scan.next();
	    	        	System.out.println(" Enter Phone number:");
	    	        	long stuPhone=scan.nextLong();
	    	        	
	    	        	StudentUser u=new StudentUser(int stuId, String stuName, String stuAddress, String stuEmail, Long stuPhone);
	    	       		if(ob.newReistration(u))
	    	       		{
	    	       			System.out.println("Account created!!");
	    	       		}
	    	       		else
	    	       		{
	    	       			System.out.println("Problem in account creation!! ");
	    	       		}	
	    	       	}
	}

	        }
	    	}
