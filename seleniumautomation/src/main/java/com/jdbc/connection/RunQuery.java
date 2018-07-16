/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jun 25, 2018
 */

package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RunQuery {
	//Class.forName("com.sybase.jdbc4.jdbc.SybDriver");
	//System.out.println("Found the JDBC driver! Hurrey !");
	static Statement stmt = null;
	static Connection dconnect = null;
	static String url = "jdbc:sybase:Tds:pgfbkdc:6000";
	static String username = "n0217055";
	static String Password = "qE#ft0n@";
	
	
	public static void dquery(String queryName) {

		switch (queryName) {

		case "query0":
			//System.out.println("User wants to visit Crete");
			String query0 = "select * from syskeys where type =1";
			ResultSet rs = null;
//			Statement stmt = null;
//			Connection dconnect = null;
			try {
				rs = stmt.executeQuery(query0);
				while (rs.next()) {
					int type = rs.getInt("type");
					System.out.println(type);
					break;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block

			}

			break;

		case "query1":

			String query1 = "SELECT  count (depid)FROM syskeys where depid =4";
			ResultSet rs1 = null;
			
			try {
				while (rs1.next()) {
					int depid1 = rs1.getInt("depid");
					System.out.println(depid1);
					break;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				
			}
		default:

			System.out.println("Unknown Query");

			break;

		}

	}
	
	
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		
		
			// searching JDBC Driver
//			Class.forName("com.sybase.jdbc4.jdbc.SybDriver");
//			System.out.println("Found the JDBC driver! Hurrey !");
//			Statement stmt = null;
//			Connection dconnect = null;
//			String url = "jdbc:sybase:Tds:pgfbkdc:6000";
//			String username = "n0217055";
//			String Password = "qE#ft0n@";
			dconnect = DriverManager.getConnection(url, username, Password);
			stmt = dconnect.createStatement();
			dquery("query0");
			dquery("query1");
			
		
		

	}

	
	

	

	

}