package program.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ModelLogic {
	
	public void selectAllQuery() {
		JDBCController dbC = new JDBCController();
		
		String selectSql = "SELECT * FROM mytable";
	    PreparedStatement sentencia = null;
	    ResultSet result;
	}
}
