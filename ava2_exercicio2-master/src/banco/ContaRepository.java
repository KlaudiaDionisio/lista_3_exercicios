package banco;

import java.util.List;
import modelo.Conta;

/**
 *
 * @author ronaldo
 */
public interface ContaRepository {
    
    void addConta(Conta conta);
    void removeConta(Conta conta);
    void updateConta(Conta conta);
    
    //retorna um objeto do tipo conta
    Conta get(int numero, int agencia);
    //lista todas as contas de uma agência
    List listar(int agencia);
}
