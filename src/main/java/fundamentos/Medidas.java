// 1- pacotes
package fundamentos;
import java.util.Locale;
import java.util.Scanner;
// 2 - Bibliotecas
// 3 - Classe
public class Medidas {
    //3.1 - Atributos

    static Scanner entrada = new Scanner(System.in);


    //3.2 - Métodos e Funções
    public static void main(String[] args) {

        String opcao = "1";
        int area = 0; //recebe o rresultado dos cálculos de áreas

        while (!opcao.equalsIgnoreCase("S")) {

            System.out.println("Escolha o cálculo Desejado");
            System.out.println("(1) - Area do Quadrado");
            System.out.println("(2) - Area do Retângulo");
            System.out.println("(3) - Area do Triângulo");
            System.out.println("(4) - Area do Círculo");
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(S) - Sair");
            System.out.println(" ");

            opcao = entrada.nextLine(); //leitura da opção
            switch (opcao) {
                case "1":
                    area = calcularAreaDoQuadrado();
                    System.out.println("A área do Quadrado é de " + area + "m²");
                    break;

                case "2":
                    area = calcularAreaDoRetangulo();
                    System.out.println("A área do Retângulo é de " + area + "m²");
                    break;
                case "3":
                    area = calcularAreaDoTriangulo();
                    System.out.println("A área do Triângulo é de " + area + "m²");
                    break;
                case "4":
                    area = calcularAreaDoCirculo();
                    System.out.println("A área do Círculo é de " + area + "m²");
                    break;
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "s":
                case "S":
                    System.out.println("Agradecemos pela preferência! Fui!!");
                default:
                    System.out.println("Opção Inválida: " + opcao);
            }
            if (area > 0) {
                System.out.println("A área é de " + area + "m²");
            }
        }

    }

        public static int calcularAreaDoQuadrado () {
            int lado; // tamanho do lado do quadrado

            System.out.println("Digite o tamanho do lado: ");
            lado = entrada.nextInt(); //leitura do tamanho do lado

            // Desenhar o quadrado
            for (int linha = 1; linha <= lado; linha += 2) {
                for (int coluna = 1; coluna <= lado; coluna++) {
                    System.out.print("#");
                }

                System.out.print("");
            }

            System.out.println(); //pular de linha
            return lado * lado; // ^ = lado ao quadrado // retorna a área do quadrado

        }

        public static void tabuada () {
            System.out.print("Você quer calcular a tabuada de qual numero? ");
            byte numero = entrada.nextByte();

            for (byte i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + numero * i);
            }
        }

        public static void fibonacci () {
            System.out.println("Quantos números você quer na sequência? ");
            byte numero = entrada.nextByte();

            switch (numero) {
                case 0:
                    System.out.println("A sequencia esta vazia");
                    break;
                case 1:
                    System.out.println("Sequencia de Fibonacci: 1");
                    break;
                default:
                    int num1 = 0;
                    int num2 = 1;

                    System.out.print("Sequencia de Fibonacci: 1 ");
                    for (byte i = 2; i <= numero; i++) {
                        int fib = num1 + num2;
                        System.out.print(fib + " ");
                        num1 = num2;
                        num2 = fib;
                    }
            }

        }

        public static void contagemRegressiva () {
            System.out.println("Começar a contagem a partir de qual número? ");
            int numero = entrada.nextInt();

            System.out.print("Diminuindo de quantos em quantos numeros por vez? ");
            int decrescimo = entrada.nextInt();

            for (int i = numero; i >= 1; i -= decrescimo) {
                System.out.println(i);
            }
        }


        public static int calcularAreaDoRetangulo () {
            int largura;
            int altura;

            System.out.println("Digite o tamanho da largura: ");
            largura = entrada.nextInt();
            System.out.println("Digite o tamanho da altura: ");
            altura = entrada.nextInt();
            return (altura * largura) * 2;

        }

        public static int calcularAreaDoTriangulo () {
            int lado;
            int comprimento;

            System.out.println("Digite o tamanho do lado: ");
            lado = entrada.nextInt();
            System.out.println("Digite o tamanho do comprimento: ");
            comprimento = entrada.nextInt();
            return (lado * lado) * comprimento;
        }

        public static int calcularAreaDoCirculo () {
            int comprimento;
            int altura;

            System.out.println("Digite o tamanho do comprimento: ");
            comprimento = entrada.nextInt();
            System.out.println("Digite o tamanho da altura: ");
            altura = entrada.nextInt();
            return comprimento * altura;
        }

    }
