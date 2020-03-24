
package modelo;

public class Documento {
    private String cpf;
    private String rg;

    public Documento(String cpf, String rg) {
        this.cpf = cpf;
        this.rg = rg;
    }

    public Documento() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
@Override
public String toString(){
    return "Documentos {"+"CPF = "+ cpf + ", RG = " + rg + "}";
} 
}
