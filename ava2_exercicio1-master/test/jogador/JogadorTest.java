/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogador;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author klaud
 */
public class JogadorTest {
    
    public JogadorTest() {
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
     * Test of getId method, of class Jogador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Jogador instance = new Jogador();
        int expResult = 0;
        int result = instance.getId();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Jogador.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Jogador instance = new Jogador();;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSalario method, of class Jogador.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Jogador instance = new Jogador();
        float expResult = 0.0F;
        float result = instance.getSalario();
        assertNotEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSalario method, of class Jogador.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        float salario = 0.0F;
        Jogador instance = new Jogador();;
        instance.setSalario(salario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Jogador.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Jogador instance = new Jogador();;
        float expResult = 0.0F;
        float result = instance.getValor();
        assertNotEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Jogador.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        float valor = 0.0F;
        Jogador instance = new Jogador();;
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getClube method, of class Jogador.
     */
    @Test
    public void testGetClube() {
        System.out.println("getClube");
        Jogador instance = new Jogador();
        String expResult = "";
        String result = instance.getClube();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setClube method, of class Jogador.
     */
    @Test
    public void testSetClube() {
        System.out.println("setClube");
        String clube = "";
        Jogador instance = new Jogador();;
        instance.setClube(clube);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFimContrato method, of class Jogador.
     */
    @Test
    public void testGetFimContrato() {
        System.out.println("getFimContrato");
        Jogador instance = new Jogador();
        LocalDate expResult = LocalDate.now();
        LocalDate result = instance.getFimContrato();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFimContrato method, of class Jogador.
     */
    @Test
    public void testSetFimContrato() {
        System.out.println("setFimContrato");
        LocalDate fimContrato = LocalDate.now();
        Jogador instance = new Jogador();
        instance.setFimContrato(fimContrato);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMulta method, of class Jogador.
     */
    @Test
    public void testGetMulta() {
        System.out.println("getMulta");
        Jogador instance = new Jogador();;
        float expResult = 0.0F;
        float result = instance.getMulta();
        assertNotEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMulta method, of class Jogador.
     */
    @Test
    public void testSetMulta() {
        System.out.println("setMulta");
        float multa = 0.0F;
        Jogador instance = new Jogador();;
        instance.setMulta(multa);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of negociar method, of class Jogador.
     */
    @Test
    public void testNegociar() {
        System.out.println("negociar");
        float oferta = 0.0F;
        Jogador instance = new Jogador();;
        boolean expResult = false;
        boolean result = instance.negociar(oferta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
