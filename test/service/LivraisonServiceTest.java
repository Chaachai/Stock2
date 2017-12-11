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
public class LivraisonServiceTest {
    
    public LivraisonServiceTest() {
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
     * Test of AjoutLivraison method, of class LivraisonService.
     */
    @Test
    public void testAjoutLivraison() {
        System.out.println("AjoutLivraison");
        String idCommande = "CMD01";
        String adrlivraison = "107 Hay Yassmina 1 Ait Melloul";
        String idClient = "C01";
        LivraisonService instance = new LivraisonService();
        int result = instance.AjoutLivraison(idCommande, adrlivraison, idClient);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(result);
    }
    
}
