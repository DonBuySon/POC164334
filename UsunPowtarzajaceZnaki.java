public class UsunPowtarzajaceZnaki {

    public static String usunPowtarzajaceZnaki(String napis) {
        StringBuilder wynik = new StringBuilder();
        boolean[] znaki = new boolean[256];

        for (int i = 0; i < napis.length(); i++) {
            char znak = napis.charAt(i);


            if (!znaki[znak]) {
                wynik.append(znak);
                znaki[znak] = true;
            }
        }

        return wynik.toString();
    }

    public static void main(String[] args) {
        String napis = "bananowy";
        String wynik = usunPowtarzajaceZnaki(napis);

        System.out.println("Napis po usunięciu powtarzających się znaków: " + wynik);
    }
}
