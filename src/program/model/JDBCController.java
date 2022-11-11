package program.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Casandra McJack
 */

public class JDBCController  {

  static final String DB_URL = "jdbc:mysql://localhost/items";
  static final String USER = "root";
  static final String PASS = "";
  
  public JDBCController(){
	    
	    try {
	    	Connection conn;
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}
