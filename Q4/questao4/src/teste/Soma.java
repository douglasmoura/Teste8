package teste;

public class Soma implements Operacoes {

    @Override
    public Double calcular(Integer a, Integer b) {
        
        return (double)(a + b);
    }
    
}
