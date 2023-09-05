import java.util.Random;
import java.util.Scanner; 

public class Main {
        public static void main(String args[])   
    {      Scanner ip = new Scanner(System.in);
           System.out.println("Hey Welcome to Number Guessing game------>>\npress 1 to enter\n");
           int i =ip.nextInt();
           
           if(i==1){
           
           for(int j=1;j<4;j++){
                Random random = new Random();   
                int x = random.nextInt(100);   
                System.out.println("Round "+j+"\n" );
                if(num_gus(Attempts(j),x)){
                System.out.println(" You passed Round "+j+" proceed to next round\n" );}
                else{
                    System.out.println("you can't move to next round Try later");
                    break;
                }
                
                 
             }
           }
           else{
               System.out.println("exit");
           }
                
            
    }
    static int Attempts(int a){
        if(a==1){
            return 12;
        }
        else if(a==2){
            return 8;
        }
        else if(a==3){
            return 4;
        }
        return 0;
    }
        
    static boolean num_gus(int n,int random){
        Scanner ip = new Scanner(System.in);
        int i=0;
        int score=100;
        while(i<n){
            System.out.println("Guess the number in between 1 to 100 \n");
            int user = ip.nextInt();
            if(user==random){
                System.out.println("Congratulations!! You Guessed it Correctly in "+ (i+1) + " attempt \n");
                System.out.println("Your Score is :"+(score+((n-i)*(n-i))));
                return true;
            }
            else if(n==i+1){
                System.out.println("You Failed to guess");
                return false;
            
            }
            else if(user>random && user<100){
            System.out.println("you number is greater than  generated number\n");
                score=score-5;
            }
            
            else if(user<random){
            System.out.println("you number is lesser than  generated number\n");
            score=score-5;
                
            }
            else{
                 System.out.println("Please enter the number in between 1 to 100 ");
                 score=score-10;
            }
    
            i=i+1;
            
        }return true;
    }
}
