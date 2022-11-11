package program.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		
		return false;
	}
}
