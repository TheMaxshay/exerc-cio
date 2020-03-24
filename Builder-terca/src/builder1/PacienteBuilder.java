package builder1;

public class PacienteBuilder {
    private DadosFisicos dadosFisicos = new DadosFisicos();
    private DadosPessoais dadosPessoais = new DadosPessoais();
    private Documento documento = new Documento();
    private Endereco endereco = new Endereco();
    private paciente paciente = new paciente();
    
    public void comNome (String nome){
    dadosPessoais.setNome(nome);
    }
    
    public void nascidoEm(String data){ 
        try{
            Date dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            dadosPessoais.setDatanascimento(dataNasc);
        } catch(parseException ex){
            Logger.getLogger(pacienteBuilder.class.getname()).log(level.SEVERE, null, ex);
        }
        return this;
    }
public void doSexo(char sexo){
    dadosPessoais.setSexo(sexo);
    return this;
}

public void comCPF(String cpf){
    documento.setCpf(cpf);
    return this;
}

public PacienteBuilder com RG(String rg){
    docuemnto.setRg(rg);
    return this;
}
public PacienteBuilder comPeso(String peso){ 
    dadosFisicos.setPeso(Double.parseDouble(peso));
    return this;
}

public PacienteBuilder comAltura(String altura){ 
    dadosFisicos.setAltura(Double.parseDouble(altura));
    return this;
}
    
public paciente constroi(){
    paciente.setDadosPessoais (dadosPessoais);
    paciente.setDocuemtno (documento);
    
    return paciente;
}
}
