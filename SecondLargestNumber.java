public  class SecondLargestNumber{
    public static void main(String[]args){
    int[] numbers = {12, 45, 7, 32, 19, 28};
    int largestnumber = 0;
    int secondlargestnumber = 0;
    for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > largestnumber) {
                secondlargestnumber = largestnumber;
                largestnumber = numbers[index];
            } else if (numbers[index] > secondlargestnumber) {
                secondlargestnumber = numbers[index];
            }
        }

        System.out.println("secondlargestnumber: " + secondlargestnumber);
    }
}
 
