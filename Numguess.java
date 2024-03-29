import java.util.*;
public class Main{
    public static void main(String args[]){
        int UserNum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        
    int ranNum=(int)(Math.random()*100);
       
       do{
           
           System.out.println("Guess the Number:");
            UserNum=in.nextInt();
           
           if(UserNum==ranNum){
               System.out.println("RIGHT GUESS");
               break;
           }
           else if(UserNum>ranNum){
               System.out.println("SMALLER NUMBER PLEASE");
           }
           else{
               System.out.println("LARGER NUMBER PLEASE");
           }
       }
       while(UserNum>0);
      
    }
}
           