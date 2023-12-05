package humanoid;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Humanoid{
    int chargeLevel;
    boolean powerState;
    String language;
    boolean inMotion;
    int speechVolume;
    ArmType arm;
    

    public Humanoid() {
        this.chargeLevel = 53;
        this.powerState = false;
        this.language = "US_en";
        this.inMotion = false;
        this.speechVolume = 40;
    }
    
    void powerOn(){
        System.out.println("Power On!\nHow may i be of help today\n1. Start Interaction\n2. Run Errand\n3. Cuddle");
    }
    Scanner scanner = new Scanner(System.in);
    
    void startInteraction() throws InterruptedException{
        System.out.println("(Input exit to stop)\nWhat do you want to talk about!");
        String input = scanner.nextLine();
        while(! input.contains("exit")){
            System.out.println("Okay");
            input = scanner.nextLine();
        }
        if(input.contains("exit")){
            BoiBoi.main(new String[0]);
        }
    }
    
    void runErrand() throws InterruptedException{
        this.arm = ArmType.STIFF;
        System.out.println(arm + " ARM TYPE ACTIVATED!\n(Input 'stop' to exit)\nWhat can i do for you!");
        String input = scanner.nextLine();
        while(! input.contains("stop") ){
            System.out.println("I'm on it...");
            TimeUnit.SECONDS.sleep((new Random()).nextInt(10));
            System.out.println("Done. What else can i do for you");
            input = scanner.nextLine();
        if(input.contains("stop")){
            BoiBoi.main(new String[0]);
        }
        }
    }
    
    void cuddle() throws InterruptedException{
        System.out.println("Type 'no' to stop cuddling\n"+ arm + " ARM TYPE ACTIVATED!\nYou must be feeling lonely, let's get on with it!");
        String input = "";
        while(! input.contains("no")){
            this.arm = ArmType.SOFT;
            TimeUnit.SECONDS.sleep((new Random()).nextInt(10));
            System.out.println("Should i continue?");
            input = scanner.nextLine();
        if(input.contains("no")){
            BoiBoi.main(new String[0]);
        }
        }
            
    }
}