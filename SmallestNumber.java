import java.util.Arrays;
public class SmallestNumber{
    public static void main(String[]args){
    
    int[] scores = {18,5, 12,3,21,7};
    int smallestnumber = scores[0];
    for(int count = 0; count < scores.length; count++){

         if (smallestnumber > scores[count]){
           smallestnumber = scores[count];

         
    }   
     
    }   

        System.out.println(smallestnumber);
    

    }









}
