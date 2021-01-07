package com.cdsi.backend.inve.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class classModel {
	     
		public static void main(String args[]) {
		     
	        // This is how to get today's date in Java
	        Date today = new Date();
	     
	        //If you print Date, you will get un formatted output
	        System.out.println("Today is : " + today);
	     
	        //formatting date in Java using SimpleDateFormat
	        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	        String date = DATE_FORMAT.format(today);
	        System.out.println("Today in dd-MM-yyyy format : " + date);
	     
	    }
	
}