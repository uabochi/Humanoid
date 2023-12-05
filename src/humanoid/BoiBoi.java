package humanoid;

import java.util.Scanner;

public class BoiBoi {
    static Humanoid charity = new Humanoid();
    
    public static void main(String[] args) throws InterruptedException {
        charity.powerOn();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                charity.startInteraction();
                break;
            case 2:
                charity.runErrand();
                break;
            case 3:
                charity.cuddle();
                break;
            default:
                charity.powerOn();
                break;
        }
    }
    
}
