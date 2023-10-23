import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OdwrotnaKolejnoscArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> listaLiczb = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj liczbę #" + (i + 1) + ": ");
            int liczba = scanner.nextInt();
            listaLiczb.add(liczba);
        }

        Collections.reverse(listaLiczb);

        System.out.println("Liczby w odwrotnym porządku:");

        for (int liczba : listaLiczb) {
            System.out.println(liczba);
        }
    }
}
