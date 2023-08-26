import java.util.Random;


public class rollthedie {
       public static void main(String[]args){

        Random random = new Random();
          int count =5;  
          int rey = 5; 
           while(count!=0){
        int die = random.nextInt(6)+1;
            
             rey = 5 - die ; 
              System.out.println("you are " + rey + " spaces behind with "+ count+ " chances left "); 
               count--;
       } 
       if(rey ==0){ 
             System.out.println("congrats you won the game"); 
        } 
       else if(rey<0){  
               int bey = 5+rey;
             System.out.println("you were "+ bey + "ahead of the target" );
          } 
          else { 
                 System.out.println("your were" + rey +"behind the target");
             }
} 
}
write read me 
