import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean validInput = false;

        System.out.println(" Crook: Good day to you sir, can I interest you in a game of chance? \n");

        do {

        System.out.println(" Crook: Please.. say yes if you are and no if your not. \n");
        String yayOrNay = sc.nextLine();

        if (yayOrNay.equalsIgnoreCase("yes")) {
            System.out.println(" \n Crook: Excellent! lets begin! \n");
            validInput = true;
            break;
        } else if (yayOrNay.equalsIgnoreCase("no")) {
            System.out.println(" Crook: I say good day to you then sir! i'll be seeing you! \n");
            System.exit(0);
        } else {
            System.out.println(" Crook: I dont understand what you mean, please say that again.");
        }
            
        } while (!false);

        System.out.println(" \n Crook: What is your name. Friennnd.. \n");
        String name = sc.nextLine();


        System.out.println(" \n Crook: Well! " + name + ". \n"
         + "\n Crook: shall we play? \n");

        System.out.println(" Crook: press any button to continue");

        sc.nextLine(); 

        System.out.println("\n Crook: The rules of the game are simple. \n");
        System.out.println(" Crook: Both of us will draw three numbers from the box of chance. \n");
        System.out.println(" Crook: We will then both add our total together and whoever gets the highest number! \n");
        System.out.println(" Crook: WINS! \n");
        System.out.println(" Crook: " + name + " You can go first! \n");

        int yourTotal = 0;
        int compTotal = 0;

        int yourCard[] = {randomCard(), randomCard(), randomCard()};
        int compCard[] = {randomCard(), randomCard(), randomCard()};

        System.out.println("\nCrook: Your numbers are as follows: ");
        for (int x = 0; x < yourCard.length; x++) {
            System.out.println(yourCard[x]);
            yourTotal += getValue(yourCard[x]);

        }
        
        System.out.println("\nCrook: And mine are: ");
        for (int y = 0; y < compCard.length; y++) {
            System.out.println(compCard[y]);
            compTotal += getValue(compCard[y]);

        }

        System.out.println("\nCrook: Total for " + name + ": " + yourTotal);
        System.out.println("Crook: Total for Crook: " + compTotal);

        System.out.println( " Crook: Lets see whos Won! ");

        if (yourTotal > compTotal) {
            System.out.println(" Crook: You win \n");
        } else if (compTotal > yourTotal) {
            System.out.println(" Crook: You loose! \n");   
        } else {
            System.out.println(" Crook: We both loose, or win, however you wanna look at it. ");
        
        }}

        public static int getValue(int card) {
            return card;
        }
        

      public static int randomCard() {
        int randomNum = (int) (Math.random() * 90 + 1);
        return randomNum;

        }

    }

