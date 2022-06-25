package teste;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
        //TODO Auto-generated constructor stub
    }
    
    public double rendimento(){
        return getSaldo() * 0.07;
    }
}
