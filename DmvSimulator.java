public class DmvSimulator{

public static void main(String[] args){
   
    DmvSimulator obj = new DmvSimulator();

    final int randomNum = 100;

    System.out.println("Welcome to the Hamden DMV!");

    System.out.println("Here is your number, please wait for your number to be called.");
 
    int randomNumberInRange = (int)(Math.random() * 100);
    System.out.println(randomNumberInRange);

    int i = randomNumberInRange+1;

    int chance = (int)(Math.random() * 100);

    while(i != randomNumberInRange){
        
        System.out.println(i); 
        i++;
        if(i>=101){

            i=1;
        }
       

    }

    if (chance == 1) {

        System.out.println("Good news! You have all your paper work, you are all set my friend!");
        
    }

    else{

        System.out.println("Come back when you're not lazy enough to not even bring your documents! Mwahaha!");
    }
    }
   
}
