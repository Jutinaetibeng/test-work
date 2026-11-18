public class NumberOnce{
    public static void main(String[]args){
    int[] numbers = {4, 2, 4, 7, 2, 9, 7};
    for(int count = 0; count < numbers.length; count++){
        boolean found = false;
        for(int counter  = 0; counter < count; counter++){
        
        if (numbers[count] == numbers[counter]){
                found = true;
        }
    }     if (found == false){ 
           System.out.println(numbers[count]);
          }

        } 
    }
        


}


  
