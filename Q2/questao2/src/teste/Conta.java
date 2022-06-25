package teste;

public abstract class Conta {
   
   
    private Integer numero;
    private String titular;
    private Double saldo;
    
    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }


    public double rendimento(){
        return saldo;
    }
}
