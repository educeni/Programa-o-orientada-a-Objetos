/* 15. Exercício 3 — Conversão
Solicitar ao usuário sua idade inicialmente como texto:

String idade;
Converter utilizando:

Integer.parseInt()
Tratar adequadamente uma entrada como:

vinte */

package ex4.controle;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Forneca sua idade em texto: ");
            String nome = sc.nextLine();

            int idade = Integer.parseInt(nome);
            System.out.println("Idade convertida com sucesso: " + idade);
        }
        catch(NumberFormatException e){
            printf("Forneca uma idade valida. ");
        }
        sc.close();
    }
}