package com.autofix.dev.database;

import com.autofix.dev.cfg.BaseConfiguration;
import java.sql.*;

class DBConnection {

    private static Connection connection = null;
    private static BaseConfiguration config;
    private Statement statementObj = null;

    static {
        try {
            config = BaseConfiguration.getInstance();
            Class.forName(config.getDBDriver());
            System.out.println("Driver Loaded");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public final Connection getConnection() {

        try {
            connection = DriverManager.getConnection(config.getDBConnectionURL(), config.getDBUserName(), config.getDBPassword());
            statementObj = connection.createStatement();
            System.out.println("Connection Established");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public final ResultSet executeSelectQuery(final String sql) {
        ResultSet rs = null;
        try {
            rs = statementObj.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    	public final int executeDMLQuery(final String sql) {
		int num = 0;
                ResultSet rs ;
		try {
			num = statementObj.executeUpdate(sql,
					Statement.RETURN_GENERATED_KEYS);
                        rs = statementObj.getGeneratedKeys();
                                        //num = rs.getInt("updateId");
                        if (rs.next()){
                            num=rs.getInt(1);
                        }
                        System.out.print(num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(num);
		return num;
	}

	public final void closeConnection(final Connection conn){
		try {
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
