import java.util.Scanner;
import java.util.*;
    class  Rockpaperscissorgame{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Best of luck");
            Random random = new Random();

            for(int i=1; i<=3; i++){

                if(i==1){
                    System.out.println("\n1st match...!");
                }
                else if(i==2){
                    System.out.println("2nd match...!");
                }
                else{
                    System.out.println("Last match...!");
                }


                int computerinput = random.nextInt(3);

                System.out.println("Enter 0 for rock, 1 for paper, 2 for scissors");
                int userinput = sc.nextInt();

                if (userinput == computerinput){
                    System.out.println("draw");
                }
                else if(userinput==0 && computerinput==1 || userinput==1 && computerinput==2 || userinput==2 && computerinput==1 ){
                    System.out.println("computer win....! \n Try again");
                }
                else{
                    System.out.println("Congratulation you win...!");
                }

                if(computerinput==0){
                    System.out.println("computer chose rock \n");
                }
                else if(computerinput==1){
                    System.out.println("computer chose paper \n");
                }
                else {
                    System.out.println("computer chose scissors \n");
                }
            }
            System.out.println("Game finished \n Thank you");
        }
    }
