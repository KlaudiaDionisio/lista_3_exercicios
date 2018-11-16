package modelo;

import banco.impl.JdbcContaRepository;

/**
 *
 * @author ronaldo
 */
public class Gerente {

    private String login;
    private String senha;
    
    JdbcContaRepository cr = new JdbcContaRepository();
    /**
     * Salva os dados de uma conta no banco.
     * @param conta 
     */
    public void salvarConta(Conta conta){
        //TODO: salvar conta
        cr.addConta(conta);
    }
    
    /**
     * 
     * @param conta 
     */
    public void editarConta(Conta conta){
        //TODO: editar (update) uma conta existente
        cr.updateConta(conta);
    }
    
    /**
     * 
     * @param numero
     * @param agencia 
     */
    public void deletarConta(int numero, int agencia){
        //TODO: deletar conta
        Conta conta = new Conta();
        conta.setNumero(numero);
        conta.setAgencia(agencia);
        cr.removeConta(conta);
    }
}
