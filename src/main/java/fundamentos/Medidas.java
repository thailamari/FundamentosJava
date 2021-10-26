// 1- pacotes
package fundamentos;
import java.util.Arrays;
import java.util.Scanner;
// 2 - Bibliotecas
// 3 - Classe
public class Medidas {
    //3.1 - Atributos

    static Scanner entrada;


    //3.2 - Métodos e Funções
    public static void main(String[] args){

        String opcao;
        int area = 0; //recebe o rresultado dos cálculos de áreas

        entrada = new Scanner(System.in);   //instanciar o objeto de leitura do console

        System.out.println("Escolha o cálculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retângulo");
        System.out.println("(3) - Area do Triângulo");
        System.out.println("(4) - Area do Círculo");

        opcao = entrada.nextLine(); //leitura da opção
        switch (opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                System.out.println("A área é de " + area + "m²");
                break;

            case "2":
                // ToDo: calcular área do retangulo
            default:
                System.out.println("Opção Inválida: " + opcao);
        }

    }

    public static int calcularAreaDoQuadrado(){
        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); //leitura do tamanho do lado
        return lado * lado; // ^ = lado ao quadrado // retorna a área do quadrado


    }
}
