import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String username = scanner.nextLine();
        System.out.printf("Welcome %s to Sandhu Classes\n", username);
    }
}