import java.util.Scanner;

public class work_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите строку:");
            String input = scanner.nextLine();

            if (input.isEmpty()){
                throw new Exception("Пустые строки вводить нельзя!!!");
            }

            System.out.println("Строка: " + input);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
