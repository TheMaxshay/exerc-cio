package builder1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import modelo.DadosFisicos;
import modelo.DadosPessoais;
import modelo.Documento;
import modelo.Endereco;
import modelo.Paciente;

public class app {
    PacienteBuilder = new PacienteBuilder();
    
    builder.comNome("Jerisclayton Coronero");
    builder.comCPF("111.222.111.555-69");
    builder.nascidoEm("16/12/2019");
    builder.comRG("111111114-0");
    builder.comPeso("90");
    builder.comAltura("1,55");
    
    Paciente paciente = builder.constroi();
    
    System.out.println(paciente);
}
