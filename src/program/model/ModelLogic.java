package program.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import program.controllers.ProfileManager;
import program.controllers.User;

public class ModelLogic {
	
	private Connection conn;
	
	public ModelLogic(Connection conn) {
		this.conn = conn;
	}
	
	public void selectAllQuery() throws SQLException {
		
		String selectSql = "SELECT * FROM mytable";
	    PreparedStatement sentencia = null;
	    ResultSet result;
	    sentencia = conn.prepareStatement(selectSql);
	    result = sentencia.executeQuery();
	    
	    while(result.next()) {
	    	System.out.println(result.getString("username"));
	    }
	}
	
	public boolean findUser(User myUser) {
		try {
			String selectSql = "SELECT * FROM mytable WHERE email = ?";
			PreparedStatement sentencia = null;
			ResultSet result;
			sentencia = conn.prepareStatement(selectSql);
			sentencia.setString(1, myUser.getEmail());
			result = sentencia.executeQuery();
			
			if(result.next()) {
				return true;
			}else {
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public void insertUser(User myUser) {
		try {
			String selectSql = "INSERT INTO mytable (username, email, password, birthday) VALUES (?,?,?,?)";
			PreparedStatement sentencia = null;
			ResultSet result;
			sentencia = conn.prepareStatement(selectSql);
			sentencia.setString(1, myUser.getUsername());
			sentencia.setString(2, myUser.getEmail());
			sentencia.setString(3, myUser.getPassword());
			sentencia.setString(4, myUser.getBirthday());
			sentencia.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public boolean LoginUser(User myUser) {
		if(findUser(myUser)) {
			try {
				String selectSql = "SELECT * FROM mytable WHERE email = ? AND password = ?";
				PreparedStatement sentencia = null;
				ResultSet result;
				sentencia = conn.prepareStatement(selectSql);
				sentencia.setString(1, myUser.getEmail());
				sentencia.setString(2, myUser.getPassword());
				result = sentencia.executeQuery();
				
				if(result.next()) {
					ProfileManager.setUsername(result.getString(2));
					ProfileManager.setEmail(result.getString(3));
					return true;
				}else {
					return false;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}else {
			return false;
		}
	}
}
