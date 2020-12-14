public class functions {
    public static void main(String[] args) {
        calc(10, 15);
    }

    static void calc(int x, int y) {
        //static void -> declaracao padrao
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println("Fim!");
    }
}
