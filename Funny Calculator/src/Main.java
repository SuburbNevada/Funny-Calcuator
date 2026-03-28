import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        // Sacred file (do not touch)
        File sacred = new File("the_sacred_file.txt");
        if (!sacred.exists()) {
            sacred.createNewFile();
            System.out.println("A sacred file has spawned. Do NOT delete it!");
        }

        while (true) {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter operator (+ - * /): ");
            String op = sc.next();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            // Ragequit
            if (op.equals("/") && b == 0) {
                System.out.println("Actually fuck you for this. Did you really expect me to divide by zero?\nTHE CALCULATOR REFUSES TO CONTINUE!");
                Thread.sleep(1000);
                sacred.delete();
                System.exit(1);
            }

            // Do not touch my sacred file (!)
            if (!sacred.exists()) {
                Thread.sleep(1000);
                for (int i = 1; i <= 100; i++) {
                    new File("HOW DARE YOU DELETE THE SACRED FILE YOU MORON " + i + ".txt").createNewFile();
                }
                Thread.sleep(1000);
                throw new RuntimeException("HOW DARE YOU DELETE THE SACRED FILE YOU MORON");
            }

            //21
            if (op.equals("+") && a == 9 && b == 10) {
                System.out.println("Result: 21");
                continue; // go back to start
            }

            double result = switch(op) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> { System.out.println("Unknown operator"); yield 0; }
            };

            // Haha Funny
            if (result == 69) {
                System.out.println("Result: nice.");
            } else if (result == 67) {
                System.out.println("Result: blud rly thinks 67 is still");
                Thread.sleep(1000);
                throw new RuntimeException("Calculator rage: 67 is not allowed!");
            } else if (result == 1984) {
                System.out.println("Result: literally 1984");
            } else if (result == 1945) {
                System.out.println("Result: funny Austrian painter who did politics fucking died");
            } else if (result == 1939) {
                System.out.println("Result: funny Austrian painter who didnt like to drink juice or something rages");
            } else if (result == 88) {
                System.out.println("Result: funny moustache guy who only had one ball (according to Churchill)");
            } else {
                System.out.println("Result: " + result);
            }
        }
    }
}