public class MojaKlasa {

    public static boolean czyDodatnia(int liczba) {
        return liczba > 0;
    }

    public static void main(String[] args) {
        int testowaLiczba = 0;
        boolean wynik = czyDodatnia(testowaLiczba);

        if (wynik) {
            System.out.println("Liczba jest dodatnia.");
        } else {
            System.out.println("Liczba nie jest dodatnia.");
        }
    }
}
