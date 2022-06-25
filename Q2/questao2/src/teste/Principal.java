package teste;

public class Principal {
    
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(1,"Douglas",10000.0);
        ContaPoupanca cp = new ContaPoupanca(2,"Cielio", 10000.0);

        System.out.printf("Rendimento conta corrente: %.2f.\n" , cc.rendimento());
        System.out.printf("Rendimento conta poupança: %.2f.\n" , cp.rendimento());

    }

}
