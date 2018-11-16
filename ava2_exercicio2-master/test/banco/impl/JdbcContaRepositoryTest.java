/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.impl;

import java.util.List;
import modelo.Conta;
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
public class JdbcContaRepositoryTest {
    
    public JdbcContaRepositoryTest() {
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
     * Test of addConta method, of class JdbcContaRepository.
     */
    @Test
    public void testAddConta() {
        System.out.println("addConta");
        Conta conta = new Conta();
        JdbcContaRepository instance = new JdbcContaRepository();
        instance.addConta(conta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeConta method, of class JdbcContaRepository.
     */
    @Test
    public void testRemoveConta() {
        System.out.println("removeConta");
        Conta conta = new Conta();
        JdbcContaRepository instance = new JdbcContaRepository();
        instance.removeConta(conta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateConta method, of class JdbcContaRepository.
     */
    @Test
    public void testUpdateConta() {
        System.out.println("updateConta");
        Conta conta = new Conta();;
        JdbcContaRepository instance = new JdbcContaRepository();
        instance.updateConta(conta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class JdbcContaRepository.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int numero = 0;
        int agencia = 0;
        JdbcContaRepository instance = new JdbcContaRepository();
        Conta expResult = null;
        Conta result = instance.get(numero, agencia);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class JdbcContaRepository.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        int agencia = 0;
        JdbcContaRepository instance = new JdbcContaRepository();
        List expResult = null;
        List result = instance.listar(agencia);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
