package teste;

public class Subtracao implements Operacoes {
    
    @Override
    public Double calcular(Integer a, Integer b) {
        
        return (double)(a - b);
    }
}
