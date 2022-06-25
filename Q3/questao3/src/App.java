import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));

        System.out.println(list.size()); 

        String palavra = removerAcentos("Abba");

        int contadorLetras = 0;

        String[] digits = palavra.toLowerCase().split("");
     

        for (String string : digits) {
            System.out.println(string); 
        }

        for (int i = 0; i < digits.length; i++) {
            
            for (int j = 1; j <= digits.length; j++) {
                
                if (digits[i].equals(list.get(j-1))) {
                    contadorLetras += j;
                }
            }
        }

        System.out.println(contadorLetras);
        
    }


     //remover caracter especial
     public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
