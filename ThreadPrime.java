import java.util.Scanner;
class PrimeChecker extends Thread {
    
	private int number;
    public PrimeChecker(int number) {
        this.number = number;
    }
    
    public void run() {
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

public class ThreadPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        PrimeChecker primeChecker = new PrimeChecker(number);
        primeChecker.start();
    }
}

