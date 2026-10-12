/* Criar um array:

int[] notas = {8, 7, 9, 10, 6};
Solicitar ao usuário uma posição.

Exemplo:

Digite uma posição: 2

Valor encontrado: 9
Se informar:

Digite uma posição: 10
o programa deverá apresentar uma mensagem amigável em vez de encerrar devido à exceção. */

package ex3.controle;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int notas[] = {8,7,8,10,6};

        try{
            System.out.print("Forneca a posicao: ");
            int pos = sc.nextInt();
            System.out.printf("%d", notas[pos]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Forneca uma posicao valida. " + e);

        }
    }

}