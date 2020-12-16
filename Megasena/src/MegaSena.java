import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        Random generate = new Random();

//        int i = 0;
//        while(i < 6) {
//            int number = generate.nextInt(60);
//            System.out.println(number);
//            i++;
//        }

        for (int i = 0; i < 6; i++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}
