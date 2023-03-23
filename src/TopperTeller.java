import java.util.Scanner;
public class TopperTeller {

    public static void checkTopper(int rollNumber){
        int copyOfRoll = rollNumber;
        int sumOfOddDigits = 0;
        int sumOfEvenDigits = 0;
        while(copyOfRoll>0){
            int digit = copyOfRoll % 10;
            if(digit % 2 == 0){
                sumOfEvenDigits += digit;
            }else{
                sumOfOddDigits += digit;
            }
            copyOfRoll /= 10;
        }
        if(sumOfEvenDigits == sumOfOddDigits)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Roll Number: ");
        int rollNumber = input.nextInt();

        checkTopper(rollNumber);
    }
}