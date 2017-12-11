/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

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
public class FactureServiceTest {
    
    public FactureServiceTest() {
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
     * Test of AjoutFacture method, of class FactureService.
     */
    @Test
    public void testAjoutFacture() {
        System.out.println("AjoutFacture");
        String idFacture = "F01";
        String idCommande = "CMD01";
        String idClient = "C01";
        FactureService instance = new FactureService();
        int result = instance.AjoutFacture(idFacture, idCommande, idClient);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
    }

    /**
     * Test of calculTotalCommande method, of class FactureService.
     */
//    @Test
//    public void testCalculTotalCommande() {
//        System.out.println("calculTotalCommande");
//        String idCommande = "";
//        FactureService instance = new FactureService();
//        double expResult = 0.0;
//        double result = instance.calculTotalCommande(idCommande);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
