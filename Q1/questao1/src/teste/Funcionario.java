package teste;

import java.util.Date;

public class Funcionario {

    private String nome;
    private String matricula;
    private Double salario;
    private Date dataAdmissao;
    private String CPF;

    public Funcionario(String nome, String matricula, Double salario, Date dataAdmissao, String cPF) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        CPF = cPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public  void receberAumento(Double valor){

      System.out.printf("Salário com aumento: %.2f.\n",getSalario() + valor) ;
    }

    public Double calcularGanhoBrutoAnual(){

        return getSalario() * 12 ;
    }

    public Double calcularImposto(){
        
        double pagarImposto = 0.0;

        if(getSalario()  > 2500){

            pagarImposto = getSalario() * 0.175;

            return pagarImposto;
        }
      
        return pagarImposto;
    }

    public Double calcularGanhoLiquidoMensal(){

        double salarioINNS = getSalario();

        salarioINNS = salarioINNS * 0.89;

        if(salarioINNS  > 2500){
            return salarioINNS  * 0.825;
        }
        return salarioINNS ;
    }

    public Double calcularGanhoLiquidoAnual(){
        return calcularGanhoLiquidoMensal() * 12 ;
    }
}
