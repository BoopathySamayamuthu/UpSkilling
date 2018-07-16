/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 21, 2018
 */

package com.jdbc.connection;

import java.sql.*;
//import java.util.Scanner;

public class Sybase {

	public static void main(String[] args) throws SQLException {
		try {
			// searching JDBC Driver
			Class.forName("com.sybase.jdbc4.jdbc.SybDriver");
			System.out.println("Found the JDBC driver! Hurrey !");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Could not find the JDBC driver!");
			System.exit(1);
		}
		
		Connection dconnect = null;
		Statement stmt = null;
		// Database Connection Properties
		String url = "jdbc:sybase:Tds:pgfbkdc:6000";
		String username = "n0217055";
		String Password = "qE#ft0n@";

		//Connecting and creating a Database
		dconnect = DriverManager.getConnection(url, username, Password);
		stmt = dconnect.createStatement();
		
	
		
				String query0 = "select * from syskeys where type =1";
				ResultSet rs = stmt.executeQuery(query0);
				while (rs.next()) {
					int type = rs.getInt("type");
					System.out.println(type);
				}
				
					String query1 = "SELECT  count (depid)FROM syskeys where depid =4";
					
					ResultSet rs1 = stmt.executeQuery(query1);
					//while (rs1.next()) {
						int depid1 = rs1.getInt("depid");
						System.out.println(depid1);
					
				
			//}
		}
}

