import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Digite o 1° valor para montar a tabuada: ");
        int tabuada = en.nextInt();
        System.out.println("Até que valor montar a tabuada ?: ");
        int tabuada2 = en.nextInt();

        if (tabuada > tabuada2) {
            int aux = tabuada;
            tabuada = tabuada2;
            tabuada2 = aux;
            System.out.println("O primeiro valor precisa ser menor que segundo ");
            System.out.println("Ja fiz a troca para realizarmos a operações corretamente ");
        }

        for(int i = 1; i <= tabuada2; i++){
            System.out.println(tabuada + " x " + i + " = " + (i * tabuada));
        }
    }
}