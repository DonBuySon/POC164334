import java.util.ArrayList;

public class MinimumValueArrayList {

    public static double minimumValue(ArrayList<Double> listaLiczb) {
        double min = listaLiczb.get(0);

        for (double liczba : listaLiczb) {
            if (liczba < min) {
                min = liczba;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        ArrayList<Double> listaLiczb = new ArrayList<>();
        listaLiczb.add(5.3);
        listaLiczb.add(2.7);
        listaLiczb.add(8.1);
        listaLiczb.add(1.9);
        listaLiczb.add(4.2);

        double min = minimumValue(listaLiczb);

        System.out.println("Najmniejsza liczba w liście to: " + min);
    }
}
