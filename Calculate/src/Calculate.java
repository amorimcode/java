public class Calculate {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if(args[0].equals("somar")) {
        sum(x, y);
        } else if (args[0].equals("subtrair")) {
            minus(x, y);
        } else if (args[0].equals("multiplicar")) {
            multiply(x, y);
        } else if (args[0].equals("dividir")) {
            divide(x, y);
        } else {
            System.out.println("Nenhuma instrução definida");
        }
    }

    static void sum(int x, int y) {
        System.out.print(x + y);
    }

    static void minus(int x, int y) {
        System.out.print(x - y);
    }

    static void multiply(int x, int y) {
        System.out.print(x * y);
    }

    static void divide(int x, int y) {
        System.out.print(x / y);
    }

}
