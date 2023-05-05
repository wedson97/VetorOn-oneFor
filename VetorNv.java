
package myproject.vetornv;

import java.util.Scanner;

public class VetorNv {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Digite quantos numeros tera no vetor");
        int[] entrada = new int[c.nextInt()];
        for(int i = 0;i<entrada.length;i++){
            System.out.print("Numero: ");
            entrada[i]=c.nextInt();
        }
        System.out.print("Digite o valor desejado:");
        int valor = c.nextInt();
        TwoSum soma = new TwoSum(entrada, valor);
        soma.calcular();
    }
}
