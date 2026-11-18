import java.util.Arrays;
public class CountNumber{
    public static void main(String[]args){
    int[] numbers = {4, -3, 7, -8, 0, 12, -2, 5};
    int positiveNumber = 0;
    
    int negativeNumber = 0;

    for(int count= 0; count < numbers.length; count++){
        if (numbers[count] > 0){ 
             positiveNumber++;
           }
        else if (numbers[count] < 0){ 
                negativeNumber++;
            }
    }            System.out.println("positiveNumber: " + positiveNumber);       
                 System.out.println("negativeNumber: " + negativeNumber);







}





}
