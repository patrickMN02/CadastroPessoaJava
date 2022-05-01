
package Pessoas;

public class PessoaFisica extends Pessoa{
    private String rg;
    private String cpf;
    private String tipo;
    
    
    public PessoaFisica(){
    
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
