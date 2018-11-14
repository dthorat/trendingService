package com.wsi.order.trending;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class TestConnection {
	static Connection connection = null;
	public static void main(String[] args) throws SQLException {
		System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;

        }

        System.out.println("Oracle JDBC Driver Registered!");

        

        try {

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@10.2.20.31:1521:xe", "NISUM", "admin");

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
            printTableNames();
        } else {
            System.out.println("Failed to make connection!");
        }
	}
	public static void printTableNames() throws SQLException {
		String query = "SELECT * from YFS_ITEM";
		ResultSet rs = connection.createStatement().executeQuery(query);
		/*while(rs.next()) {
			System.out.println(rs.getString(1));
		}*/
		
		ResultSetMetaData metaData = rs.getMetaData();
	    System.out.println("Number of columns: "+metaData.getColumnCount());
	    System.out.println("Table description...!");
	    for(int i=1;i< metaData.getColumnCount();i++)
	    {
	      System.out.println(metaData.getColumnName(i)+"\t"+metaData.getColumnTypeName(i));
	    }
	}
}
