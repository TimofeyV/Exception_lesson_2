import java.util.Scanner;


public class work_1 {
    public static void main(String[] args) {
        float a = inputFloat();
        System.out.println(a);
    }

    private static float inputFloat(){
        Scanner scanner = new Scanner(System.in);
        float a = 0;
        boolean valid = false;
        while(!valid){
            System.out.println("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                a = scanner.nextFloat();
                valid = true;
            } else {
                System.out.println("Вы ввели не число");
                scanner.next();
            }
        }
        return a;
    }
}
