package jp.co.aforce.dao;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	static DataSource dss;

	public Connection getConnection() throws Exception {
		if(dss == null) {
			InitialContext ic = new InitialContext();
			dss = (DataSource)ic.lookup("java:/comp/env/jdbc/login");
		}
		return dss.getConnection();
	}

}
