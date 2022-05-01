
package Pessoas;


public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String tipo;
    
    
    public PessoaJuridica(){
    
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
