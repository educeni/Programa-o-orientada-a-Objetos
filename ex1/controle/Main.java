package ex1.controle;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int resp;
        try{
            System.out.print("Forneca o primeiro numero");
            int n1 = sc.nextInt();

            System.out.print("Forneca o segundo numero");
            int n2 = sc.nextInt();

            System.out.print("Forneca um dos operadores * / + - : ");
            char operador = sc.next().charAt(0);

            if(operador == '*'){
                resp = n1*n2;
            }
            else if(operador == '/'){
                resp = n1/n2;
            }
            else if(operador == '+'){
                resp = n1+n2;
            }
            else if(operador == '-'){
                resp = n1-n2;
            }
            else{
                throw new IllegalArgumentException("Operação inválida.");
            }
            System.out.printf("O resultado eh: %d", resp);
        }
        catch(InputMismatchException e){
            System.out.print("Entrada invalida. " + e);
        }
        catch(ArithmeticException e){
            System.out.print("Nao eh possivel dividir por zero. " + e);
        }
        catch(IllegalArgumentException e){
            System.out.print("Operação inválida.");
        }
    }
}