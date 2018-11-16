package com.wsi.order.trending;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class to test database connection
 * 
 * @author Zubair Alam
 */
public class TestConnection {

	static Connection connection = null;

	private static final Logger logger = LogManager.getLogger(TestConnection.class);

	public static void main(String[] args) throws SQLException {
		logger.info("-------- Oracle JDBC Connection Testing ------");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {
			logger.info("Where is your Oracle JDBC Driver?");
			logger.error(e);
			return;
		}

		logger.info("Oracle JDBC Driver Registered!");
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@10.2.20.31:1521:xe", "NISUM", "admin");
			if (connection != null) {
				logger.info("You made it, take control your database now!");
				printTableNames();
			} else {
				logger.info("Failed to make connection!");
			}

		} catch (SQLException e) {

			logger.info("Connection Failed! Check output console");
			logger.error(e);
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}

	private static void printTableNames() throws SQLException {
		String query = "SELECT * from YFS_ITEM";
		ResultSet rs = null;
		Statement smt = null;
		try {
			smt = connection.createStatement(); 
			rs = smt.executeQuery(query);
			/*
			 * while(rs.next()) { logger.info(rs.getString(1)); }
			 */
			ResultSetMetaData metaData = rs.getMetaData();
			logger.info("Number of columns: " + metaData.getColumnCount());
			logger.info("Table description...!");
			for (int i = 1; i < metaData.getColumnCount(); i++) {
				logger.info(metaData.getColumnName(i) + "\t" + metaData.getColumnTypeName(i));
			}
		} catch (Exception e) {
			logger.error(e);
		} finally {
			connection.close();
			if(rs != null) {
				rs.close();
			}
			if(smt != null) {
				smt.close();
			}
		}
	}
}
