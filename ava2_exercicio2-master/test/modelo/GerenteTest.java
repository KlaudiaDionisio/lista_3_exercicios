/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class GerenteTest {
    
    public GerenteTest() {
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
     * Test of salvarConta method, of class Gerente.
     */
    @Test
    public void testSalvarConta() {
        System.out.println("salvarConta");
        Conta conta = new Conta();
        Gerente instance = new Gerente();
        instance.salvarConta(conta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editarConta method, of class Gerente.
     */
    @Test
    public void testEditarConta() {
        System.out.println("editarConta");
        Conta conta = new Conta();
        Gerente instance = new Gerente();
        instance.editarConta(conta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deletarConta method, of class Gerente.
     */
    @Test
    public void testDeletarConta() {
        System.out.println("deletarConta");
        int numero = 1;
        int agencia = 1;
        Gerente instance = new Gerente();
        instance.deletarConta(numero, agencia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
