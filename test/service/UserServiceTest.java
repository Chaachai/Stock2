/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yougata
 */
public class UserServiceTest {
    
    public UserServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of seConnecter method, of class UserService.
     */
//    @Test
//    public void testSeConnecter() {
//        System.out.println("seConnecter");
//        User user = null;
//        UserService instance = new UserService();
//        int expResult = 0;
//        int result = instance.seConnecter(user);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of AddUser method, of class UserService.
     */
    @Test
    public void testAddUser() {
        System.out.println("AddUser");
        String id = "Oualili";
        String password = "younesse";
        UserService instance = new UserService();
        int expResult = 0;
        int result = instance.AddUser(id, password);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
