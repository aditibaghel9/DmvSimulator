public class DmvSimulator{

public static void main(String[] args){
   
    DmvSimulator obj = new DmvSimulator();

    final int randomNum = 200;

    System.out.println("Welcome to the Hamden DMV!");

    System.out.println("Here is your number, please wait for your number to be called.");
 
    int randomNumberInRange = (int)(Math.random() * 200);
    System.out.println(randomNumberInRange);

    int i = randomNumberInRange+1;

    while(i != randomNumberInRange){
        
        System.out.println(i);
        if(i>=200){

            i=0;
        }
        i++;
    }
    System.out.println("You don't have your required paperwork");
}
}