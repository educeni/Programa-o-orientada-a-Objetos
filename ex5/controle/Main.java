/* 16. Exercício 4 — Validação com throw
Criar o método:

public static void cadastrarAluno(String nome, double nota)
A nota deverá estar entre 0 e 10.

Caso contrário:

throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
Testar:

cadastrarAluno("Maria", 8.5);
e:

cadastrarAluno("João", 15); */

package ex5.controle;

import java.util.InputMismatchException;

public class Main{
    private double nota;
    private String nome;

    public static void main(String[] args){
        try {
            cadastrarAluno("Maria", 8.5);
            cadastrarAluno("João", 15); 
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro capturado: " + e.getMessage());
        }
    }

    public static void cadastrarAluno(String nome, double nota){
        if((nota>10) || (nota<0)){
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");

        }
        else {
            System.out.printf("nota: %.1f", nota);
        }
    }
}