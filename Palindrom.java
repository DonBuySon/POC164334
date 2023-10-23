public class Palindrom {

    public static boolean czyPalindrom(String napis) {
        napis = napis.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int dlugosc = napis.length();

        for (int i = 0; i < dlugosc / 2; i++) {
            if (napis.charAt(i) != napis.charAt(dlugosc - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String napis1 = "kajak";
        String napis2 = "Hello, World!";

        System.out.println("Czy \"" + napis1 + "\" to palindrom? " + czyPalindrom(napis1));
        System.out.println("Czy \"" + napis2 + "\" to palindrom? " + czyPalindrom(napis2));
    }
}
