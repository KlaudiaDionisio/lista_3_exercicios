package banco.impl;

import banco.Conexao;
import banco.ContaRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Conta;

/**
 *
 * @author ronaldo
 */
public class JdbcContaRepository implements ContaRepository {

    private final Connection conexao;
    
    private final String INSERT = "INSERT INTO "
            + "conta(numero, agencia, saldo)"
            + " VALUES(?,?,?);";
    private final String UPDATE = "UPDATE conta SET "
            + "saldo = ? WHERE numero = ?"
            + " AND agencia = ?";
    private final String GET = "SELECT * FROM conta"
            + " WHERE numero = ? AND agencia = ?";
    private final String LIST = "SELECT * FROM conta "
            + "WHERE agencia = ?";
    private final String REMOVE = "DELETE FROM conta WHERE numero = ? AND agencia = ?"; // query para função removeConta
    
    public JdbcContaRepository(){
        this.conexao = Conexao.getConexao();
    }
    
    @Override
    public void addConta(Conta conta) {
        try{
        PreparedStatement ps = conexao.prepareStatement(INSERT);
        ps.setInt(1, conta.getNumero());
        ps.setInt(2, conta.getAgencia());
        ps.setFloat(3, conta.getSaldo());
        ps.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void removeConta(Conta conta) {
        try{
            PreparedStatement ps = conexao.prepareStatement(REMOVE);
            ps.setInt(1, conta.getNumero());
            ps.setInt(2, conta.getAgencia());
            ps.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

    @Override
    public void updateConta(Conta conta) {
        try{
            PreparedStatement ps = conexao.prepareStatement(UPDATE);
            ps.setFloat(1, conta.getSaldo());
            ps.setInt(2, conta.getNumero());
            ps.setInt(3, conta.getAgencia());
            ps.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public Conta get(int numero, int agencia) {
        try{
            PreparedStatement ps = conexao.prepareStatement(GET);
            ps.setInt(1, numero);
            ps.setInt(2, agencia);
            ResultSet rs = ps.executeQuery();
            Conta conta = new Conta();
            if(rs.next()){
                conta.setNumero(rs.getInt("numero"));
                conta.setAgencia(rs.getInt("agencia"));
            }
            return conta;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return null;
    }

    @Override
    public List listar(int agencia) {
        ArrayList<Conta> lista = new ArrayList<>();
        try{
            PreparedStatement ps = conexao.prepareStatement(LIST);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Conta temp = new Conta();
                temp.setNumero(agencia);
            }
            return lista;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return lista;
    }

}
