import java.io.IOException;
import java.util.Scanner;

public class testeled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, i, k, tamanho, soma;
        N = input.nextInt();
        String palavra;
        i = 0;
        while(i < N){
            palavra = input.next();
            i++;
            tamanho = palavra.length();
            k = 0;
            soma = 0;
            while(k < tamanho){

                char c = palavra.charAt(k);
                int z = Character.getNumericValue(c);
                if (z == 1) {
                    soma = soma + 2;
                }
                else if ((z == 2) | (z == 3) | (z == 5)) {
                    soma = soma + 5;
                }
                else if (z == 4) {
                    soma = soma + 4;
                }
                else if ((z == 6) | (z == 9) | (z == 0)) {
                    soma = soma + 6;
                }
                else if (z == 7) {
                    soma = soma + 3;
                }
                else if (z == 8) {
                    soma = soma + 7;
                }
                k++;
            }
            System.out.println(soma + " leds");
        }
    }
}

