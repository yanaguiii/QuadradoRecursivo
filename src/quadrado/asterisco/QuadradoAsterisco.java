package quadrado.asterisco;

import java.util.Scanner;

public class QuadradoAsterisco {

    public static void main(String[] args) {
        System.out.println("Digite o tamanho do quadrado");
        Scanner scan = new Scanner(System.in);
        int tamanho = scan.nextInt();
        desenhar(tamanho-1,tamanho,tamanho-1);
        
    }

    public static void desenhar(int tamanho,int reset, int contador) {
        if (contador <0) {

        } else {
            System.out.print("*");
            if(tamanho==0){
                System.out.println();
                tamanho = reset;
                contador=contador-1;
            }
            desenhar(tamanho-1,reset, contador);
        }

    }
}
