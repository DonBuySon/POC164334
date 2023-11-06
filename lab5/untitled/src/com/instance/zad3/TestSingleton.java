package pl.instance.zad3;
// wzorzec projektowy naprostszy singleton prywatne pole statyczne prywatny konstruktor statyczna metoda implementuje to że obiekt jest...
// warto zapamiętać
public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2 == singleton);

    }
}
