package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        List<Integer> listA = new ArrayList<Integer>(Arrays.asList(20,198,11549,99999));
        List<Integer> listB = new ArrayList<Integer>(Arrays.asList(10,99,9284,9));

        for (int i = 0; i < listA.size(); i++) {

            for (int j = 0; j < listB.size(); j++) {

                if (i == j) { 
                    System.out.println("Soma: "+listA.get(i)+" + "+listB.get(j)+" = "+soma.calcular(listA.get(i),listB.get(j)));  
                    System.out.println("Subtração: "+listA.get(i)+" - "+listB.get(j)+" = "+subtracao.calcular(listA.get(i),listB.get(j)));
                    System.out.println("Multiplicação: "+listA.get(i)+" * "+listB.get(j)+" = "+multiplicacao.calcular(listA.get(i),listB.get(j)));
                    System.out.println("Divisão: "+listA.get(i)+" / "+listB.get(j)+" = "+divisao.calcular(listA.get(i),listB.get(j))+"\n");
                }
            }
        }
    }
}
