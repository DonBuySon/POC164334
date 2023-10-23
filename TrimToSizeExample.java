public class TrimToSizeExample {

    public static void trimToSize(StringBuffer sb, int n) {
        int currentLength = sb.length();

        if (currentLength > n) {
            sb.setLength(n);
        }
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("To jest przykładowy napis do przycięcia.");
        int maxLength = 10;

        System.out.println("Przed przycięciem: " + stringBuffer);
        trimToSize(stringBuffer, maxLength);
        System.out.println("Po przycięciu: " + stringBuffer);
    }
}
