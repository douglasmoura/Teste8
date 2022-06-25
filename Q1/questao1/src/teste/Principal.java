package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    

    public static void main(String[] args) throws ParseException {
        
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        Date date = df.parse("11/10/1111");
        Funcionario funcionario = new Funcionario("Douglas","1231231231213",2600.00,date,"1234512345");
        Date date2 = new Date();
        funcionario.setDataAdmissao(date2);
        System.out.println(date2);
        System.out.println(df.format(funcionario.getDataAdmissao()));
        System.out.println("Data de admissão: "+df.format(date));
        funcionario.receberAumento(1600.0);
        System.out.printf("Ganho bruto anual: %.2f.\n",funcionario.calcularGanhoBrutoAnual());
        System.out.printf("Calculo do imposto: %.2f.\n",funcionario.calcularImposto());
        System.out.printf("Ganho liquido mensal: %.2f.\n",funcionario.calcularGanhoLiquidoMensal());
        System.out.printf("Ganho liquido anual: %.2f.\n",funcionario.calcularGanhoLiquidoAnual());
    }

        

    
    
}
