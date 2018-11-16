package jogador;

import java.time.LocalDate;

/**
 *
 * @author ronaldo
 */
public class Jogador implements Negociavel{

    private int id;
    private float salario;
    private float multa;
    private float valor;
    private String clube;
    //data do fim do contrato
    private LocalDate fimContrato;
    
     public Jogador(){
        this.id = 1;
        this.salario = 5000;
        this.multa = 500;
        this.valor = 9000;
        this.clube = "Teste";
        this.fimContrato = LocalDate.parse("2019-02-03");
    }

    public Jogador(int id, float s, float m, float v, String c, LocalDate fc){
        this.id = id;
        this.salario = s;
        this.multa = m;
        this.valor = v;
        this.clube = c;
        this.fimContrato = fc;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public LocalDate getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(LocalDate fimContrato) {
        this.fimContrato = fimContrato;
    }
    
    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    @Override
    public boolean negociar(float oferta) {
        LocalDate hoje = LocalDate.now(); // pega data de hoje
        if(fimContrato.compareTo(hoje) > 0){ // data dps do hoje
            if(oferta > (valor + multa)){
                return true;
            }else{
                return false;
            }
            
        }else if(fimContrato.compareTo(hoje) < 0){ // data já passou
            if(oferta > valor){
                return true;
            }else{
                return false;
            }
            
        }
        return false;
        
    }
    
    /*
    public static void main(String[] args){
        Jogador j = new Jogador(1, 3000, 500, 6000, "Teste", LocalDate.parse("2019-02-03"));
        System.out.println(j.negociar(1000));
    }
*/
    
}
