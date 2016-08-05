/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autofix.dev.cfg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;

/**
 * The Class BaseConfiguration.
 * This Class loads the basic configuration from properties file.
 *
 * @author shivaji.bhosale
 */
public final class BaseConfiguration {
	/** The variables to store db information. */
	private String dbDriver, dbUrl, dbUname, dbPass;
	private static BaseConfiguration tdsConfiguration;

	/**
	 * Private constructor to make Configuration singleton.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private BaseConfiguration() throws IOException {
		Properties dbProperties = new Properties();
		InputStream dbPropFile = null;
		try {
			dbPropFile = getClass().getClassLoader().getResourceAsStream("Connection.properties");
                        dbProperties.load(dbPropFile);
 			// Load the all details of database from propertie file
			dbDriver = dbProperties.getProperty("DRIVER_CLASS");
                        /**** Localhost Mode*/
                        dbUrl = dbProperties.getProperty("DB_URL");
                        dbUname = dbProperties.getProperty("DB_USERNAME");
			dbPass = dbProperties.getProperty("DB_PASSWORD");
                } catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
		} catch (NullPointerException e) {
			throw new NullPointerException();
		} finally {
			dbPropFile.close();
		}
	}

	/**
	 * Gets the single instance of BaseConfiguration.
	 *
	 * @return instance of BaseConfiguration.
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static synchronized BaseConfiguration getInstance()
			throws Exception {

		if (tdsConfiguration == null) {
				try {
					tdsConfiguration = new BaseConfiguration();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					throw e;
				}
			}
		return tdsConfiguration;
	}

	/**
	 * Returns the connection URL.
	 *
	 * @return the DB connection url
	 */
	public String getDBConnectionURL() {
		return dbUrl;
	}

	/**
	 * Returns name of the database.
	 *
	 * @return the DB driver
	 */
	public String getDBDriver() {
		return dbDriver;
	}

	/**
	 * Returns User name of db.
	 *
	 * @return the DB user name
	 */
	public String getDBUserName() {
		return dbUname;
	}

	/**
	 * Returns password of the db.
	 *
	 * @return the DB password
	 */
	public String getDBPassword() {
		return dbPass;
	}
}
