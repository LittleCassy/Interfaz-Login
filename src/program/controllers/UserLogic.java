package program.controllers;

import java.sql.SQLException;

import program.model.JDBCModel;
import program.model.ModelLogic;

/**
 *
 * @author Cassy McJack
 */
public class UserLogic {
    
	private static JDBCModel myController = null;
	
    public static void Init() {
    	
    	if(myController==null) {
    		try {
    			myController = new JDBCModel();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}else {
    		System.err.println("Oh oh");
    	}
    	
    }
	
    public static boolean RegisterUser(String username, String email, String password, String Birthday){
    	
        
        return false;
    }
}
