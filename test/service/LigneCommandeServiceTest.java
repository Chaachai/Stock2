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
public class LigneCommandeServiceTest {
    
    public LigneCommandeServiceTest() {
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
     * Test of initDB method, of class LigneCommandeService.
     */
    @Test
    public void testInitDB() {
        System.out.println("initDB");
        LigneCommandeService instance = new LigneCommandeService();
        instance.initDB();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of AjoutLigneCommande method, of class LigneCommandeService.
     */
//    @Test
//    public void testAjoutLigneCommande() {
//        System.out.println("AjoutLigneCommande");
//        String idCommande = "CMD01";
//        String idProduit = "P02";
//        double qté = 50.0;
//        double tva = 0.2;
//        LigneCommandeService instance = new LigneCommandeService();
//        int result = instance.AjoutLigneCommande(idCommande, idProduit, qté, tva);
//        System.out.println(result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
    
}
