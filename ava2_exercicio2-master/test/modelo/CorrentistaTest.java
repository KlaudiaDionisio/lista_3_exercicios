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
public class CorrentistaTest {
    
    public CorrentistaTest() {
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
     * Test of sacar method, of class Correntista.
     */
    @Test
    public void testSacar() throws Exception {
        System.out.println("sacar");
        float valor = 100.0F;
        Conta conta = new Conta();
        conta.setSaldo(300);
        Correntista instance = new Correntista();
        float expResult = 200.0F;
        float result = instance.sacar(valor, conta);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = Exception.class)
    public void testSacar2() throws Exception {
        System.out.println("sacar");
        float valor = 500.0F;
        Conta conta = new Conta();
        conta.setSaldo(300);
        Correntista instance = new Correntista();
        float expResult = 200.0F;
        float result = instance.sacar(valor, conta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of depositar method, of class Correntista.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        float valor = 0.0F;
        Conta conta = new Conta();
        Correntista instance = new Correntista();
        instance.depositar(valor, conta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarSaldo method, of class Correntista.
     */
    @Test
    public void testConsultarSaldo() {
        System.out.println("consultarSaldo");
        Conta conta = new Conta();
        Correntista instance = new Correntista();
        float expResult = 0.0F;
        float result = instance.consultarSaldo(conta);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
