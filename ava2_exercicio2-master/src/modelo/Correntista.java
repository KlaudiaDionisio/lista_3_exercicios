package modelo;

import banco.impl.JdbcContaRepository;

/**
 *
 * @author ronaldo
 */
public class Correntista {

    private Conta conta;
    private String nome;
    
    JdbcContaRepository cr = new JdbcContaRepository();
    /**
     * Só poderá se sacar se o valor for menor que o saldo.
     * @return o valor sacado
     * @param valor
     * @param conta
     */
    public float sacar(float valor, Conta conta) throws Exception{
        //TODO: implementar método sacar
        if(valor < conta.getSaldo()){
            conta.setSaldo(conta.getSaldo() - valor);
            cr.updateConta(conta);
        }else{
            throw new Exception("Saldo não suficiente!");
        }
        
        return conta.getSaldo();
    }
    
    /**
     * Deposita um valor na conta.
     * @param valor
     * @param conta
     */
    public void depositar(float valor, Conta conta){
        // TODO: implementar método depositar
        conta.setSaldo(conta.getSaldo() + valor);
        cr.updateConta(conta);
    }
    
    /**
     * Retorna o valor do saldo atual da conta.
     * @return 
     * @param conta
     */
    public float consultarSaldo(Conta conta){
        //TODO: implementar método consultar saldo
        Conta c = cr.get(conta.getNumero(), conta.getAgencia());
        return c.getSaldo();
    }
}
