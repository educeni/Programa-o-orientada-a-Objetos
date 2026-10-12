package exdesafio.controle;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            
            if (nome == null){
                throw new IllegalArgumentException("O nome não pode ser vazio.");
            }

            System.out.print("Digite a idade do aluno: ");
            int idade = sc.nextInt();
            
            if (idade < 0) {
                throw new IllegalArgumentException("A idade não pode ser negativa.");
            }

            System.out.print("Digite a nota do aluno (0 a 10): ");
            double nota = sc.nextDouble();
            
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
            }

            System.out.println("Aluno Cadastrado com Sucesso!");
        } 
        catch (InputMismatchException e) {
            System.out.println("\nErro: Entrada inválida. Certifique-se de digitar valores numéricos corretos para idade e nota.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("\nErro de validação: " + e.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}