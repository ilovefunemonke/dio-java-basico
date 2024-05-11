import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int nota = scanner.nextInt();
        
        //condicional composta
        if (nota >= 7) {
            System.out.println("Aprovado");
            System.out.println("Parabens!!");
        }
        else
            System.out.println("Reprovado");

        scanner.close();
    }
    
}
