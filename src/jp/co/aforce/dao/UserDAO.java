package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.User;


public class UserDAO extends DAO{

	public User search(String id, String pass) throws Exception{

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement("select * from login where user_id = ? and password = ?");
		st.setString(1, id);
		st.setString(2, pass);
		ResultSet rs = st.executeQuery();

		User u = new User();

		while(rs.next()) {
		u.setId(rs.getString("user_id"));
		u.setPass(rs.getString("password"));
		}

		st.close();
		con.close();

		return u;
	}


}
