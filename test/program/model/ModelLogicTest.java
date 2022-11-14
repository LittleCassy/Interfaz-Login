/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package program.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import program.controllers.User;

/**
 *
 * @author lazon
 */
public class ModelLogicTest {
    
    public ModelLogicTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of selectAllQuery method, of class ModelLogic.
     */
    @Test
    public void testSelectAllQuery() throws Exception {
        System.out.println("selectAllQuery");
        ModelLogic instance = null;
        instance.selectAllQuery();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUser method, of class ModelLogic.
     */
    @Test
    public void testFindUser() {
        System.out.println("findUser");
        User myUser = null;
        ModelLogic instance = null;
        boolean expResult = false;
        boolean result = instance.findUser(myUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertUser method, of class ModelLogic.
     */
    @Test
    public void testInsertUser() {
        System.out.println("insertUser");
        User myUser = null;
        ModelLogic instance = null;
        instance.insertUser(myUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoginUser method, of class ModelLogic.
     */
    @Test
    public void testLoginUser() {
        System.out.println("LoginUser");
        User myUser = null;
        ModelLogic instance = null;
        boolean expResult = false;
        boolean result = instance.LoginUser(myUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
