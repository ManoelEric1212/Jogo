/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gta;

import javafx.scene.layout.Pane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manoel Eric
 */
public class GtaTest {
    
    public GtaTest() {
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
     * Test of Tela method, of class Gta.
     */
    @Test
    public void testTela() {
        System.out.println("Tela");
        Pane root = null;
        double width = 0.0;
        double height = 0.0;
        Gta instance = null;
        instance.Tela(root, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModoDeJogo method, of class Gta.
     */
    @Test
    public void testSetModoDeJogo() {
        System.out.println("setModoDeJogo");
        int menu = 0;
        Gta instance = null;
        instance.setModoDeJogo(menu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModoDeJogo method, of class Gta.
     */
    @Test
    public void testGetModoDeJogo() {
        System.out.println("getModoDeJogo");
        Gta instance = null;
        int expResult = 0;
        int result = instance.getModoDeJogo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of navegarMenu method, of class Gta.
     */
    @Test
    public void testNavegarMenu() {
        System.out.println("navegarMenu");
        int lugar = 0;
        Gta instance = null;
        instance.navegarMenu(lugar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
