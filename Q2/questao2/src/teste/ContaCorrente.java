package teste;

public class ContaCorrente extends Conta{

    public ContaCorrente(Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
        
    }


    public double rendimento(){
        return getSaldo() * 0.05;
    }

}
