import java.util.ArrayList;

public class CountZerosArrayList {

    public static int countZeros(ArrayList<Integer> listaLiczb) {
        int count = 0;

        for (int liczba : listaLiczb) {
            if (liczba == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(0);
        listaLiczb.add(1);
        listaLiczb.add(2);
        listaLiczb.add(0);
        listaLiczb.add(3);
        listaLiczb.add(0);
        listaLiczb.add(4);

        int iloscZer = countZeros(listaLiczb);

        System.out.println("Liczba zer w liście to: " + iloscZer);
    }
}