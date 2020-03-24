package modelo;

public class DadosFisicos {
    private String tipoSanguineo;
    private double peso;
    private double altura;
    
    public DadosFisicos(String tipoSanguineo, double peso, double altura){
        this.tipoSanguineo = tipoSanguineo;
        this.peso = peso;
        this.altura = altura;
    }
    public DadosFisicos(){
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
public String toString(){
    return "DadosFisicos {"+"peso = "+ peso + ", Altura = " + altura + "}";
}  
       
}
