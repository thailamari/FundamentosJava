package fundamentos;

import static fundamentos.Medidas.entrada;
import static fundamentos.Medidas.tabuada;

public class Calculos {

    public static void main(String[] args) {
        System.out.println("Would you like to calculate the multiplication table? <Y/N>");
        String resposta = entrada.nextLine();
        switch (resposta){
            case "Y":
            case "y":
                tabuada();
                break;
            default:
                System.out.println("you wrote a different text");
        }


    }


}
