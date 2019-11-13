public class MergeStrings {
    public static void main(String[] args) {
        String a = System.console().readLine();
        // String a = "1";

        String b = System.console().readLine();
        // String b = "23";

        System.out.println(a + b);
        System.out.println("Dlugosc napisu: " + (a + b).length());
    }
}