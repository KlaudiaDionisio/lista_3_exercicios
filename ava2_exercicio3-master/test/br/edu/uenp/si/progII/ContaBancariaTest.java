package br.edu.uenp.si.progII;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe com os testes de unidade da classe ContaBancaria
 *
 * @version 1.0
 * @author ronaldo
 */
public class ContaBancariaTest {

    public ContaBancariaTest() {
    }

    /**
     * Teste do método sacar, da classe ContaBancaria.
     */
    @Test
    public void testSacar() {
        ContaBancaria cb = new ContaBancaria();
        cb.setNumero(3);
        cb.setAgencia(5);
        cb.setSaldo(100.F);
        float sacar = 20.F;
        float valorEsperado = 20.F;
        float resultado = cb.sacar(sacar);
        assertEquals(valorEsperado, resultado, 0);
        //fail("Este teste falhou! Implemente aqui...");
    }

    @Test
    public void testSacarFalha() {
        ContaBancaria cb = new ContaBancaria();
        cb.setNumero(3);
        cb.setAgencia(5);
        cb.setSaldo(10.F);
        float sacar = 20.F;
        float valorEsperado = -1;
        float resultado = cb.sacar(sacar);
        assertEquals(valorEsperado, resultado, 0);
        //fail("Este teste falhou! Implemente aqui...");
    }

    /**
     * Teste do método depositar, da classe ContaBancaria.
     */
    @Test
    public void testDepositar() {
        ContaBancaria cb = new ContaBancaria();
        cb.setNumero(3);
        cb.setAgencia(5);
        cb.setSaldo(10.F);
        float depositar = 200.F;
        int numero = 3;
        int agencia = 5;
        boolean valorEsperado = true;
        boolean resultado = cb.depositar(numero, agencia, depositar);
        assertEquals(valorEsperado, resultado);
        
        //fail("Este teste falhou! Implemente aqui...");
    }
    
    @Test
    public void testDepositarAgenciaDiferente() {
        ContaBancaria cb = new ContaBancaria();
        cb.setNumero(3);
        cb.setAgencia(5);
        cb.setSaldo(10.F);
        float depositar = 200.F;
        int numero = 3;
        int agencia = 6;
        boolean valorEsperado = false;
        boolean resultado = cb.depositar(numero, agencia, depositar);
        assertEquals(valorEsperado, resultado);
        
        //fail("Este teste falhou! Implemente aqui...");
    }
    
    @Test
    public void testDepositarNumeroDiferente() {
        ContaBancaria cb = new ContaBancaria();
        cb.setNumero(3);
        cb.setAgencia(5);
        cb.setSaldo(10.F);
        float depositar = 200.F;
        int numero = 4;
        int agencia = 5;
        boolean valorEsperado = false;
        boolean resultado = cb.depositar(numero, agencia, depositar);
        assertEquals(valorEsperado, resultado);
        
        //fail("Este teste falhou! Implemente aqui...");
    }

}
