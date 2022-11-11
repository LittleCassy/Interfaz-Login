package program.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Casandra McJack
 */

public class JDBCModel  {

  public ModelLogic myLogic;
	
  static final String DB_URL = "jdbc:mysql://localhost/users";
  static final String USER = "root";
  static final String PASS = "";
  
  public JDBCModel(){
	    
	    try {
	    	Connection conn;
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			myLogic = new ModelLogic(conn);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }

  public ModelLogic getMyLogic() {
	  return myLogic;
  }
  
  
}
