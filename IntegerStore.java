import java.util.Arrays;
public class IntegerStore{
    public static void main(String[]args){
    int[] numbers = {18, 5, 12, 3, 21, 7};
    int smallestNumber = numbers[0];
    for(int count = 0; count < numbers.length; count++){
        if (numbers[count] < smallestNumber){
            smallestNumber = numbers[count];
            

}

    }
        System.out.println("smallestNumber:  " + smallestNumber);
    

}




}
