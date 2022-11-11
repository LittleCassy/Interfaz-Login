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
    	
    	User myUser = new User(username, email, password, Birthday);
    	
        if(!myController.getMyLogic().findUser(myUser)) {
        	myController.getMyLogic().insertUser(myUser);
        	return true;
        }else {
        	return false;
        }
    }
    
    public static boolean LoginUser(String email, String password) {
    	
    	User myUser = new User(null, email, password, null);
    	
        if(myController.getMyLogic().LoginUser(myUser)) {
        	return true;
        }else {
        	return false;
        }
    }
}
