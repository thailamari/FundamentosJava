package fundamentos;

public class Contadores extends Medidas implements ContadoresMedidas {

    public static void main(String[] args) {

        System.out.println("Would you like to realize the countdown?");
        String resposta = entrada.nextLine();
        switch (resposta){
            case "y":
            case "Y":
                ContadoresMedidas.contagemRegressica();
                break;
            default:
                System.out.println("You wrote a different text");
        }

    }

}
