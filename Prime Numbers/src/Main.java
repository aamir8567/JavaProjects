import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;

// https://byjus.com/maths/how-to-find-prime-numbers/
// https://www.codecademy.com/resources/blog/advanced-java-code-challenges/

public class Main {
    private Integer UserInput;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter desired string: ");
        Integer userNum = sc.nextInt();

        Main calc = new Main();
        calc.calculation(userNum);
    }//End of Main
    public void calculation(int userInput){
        Integer lastDigit = userInput % 10;
        Main iterate = new Main();

//converting numbers positive
        if(userInput < 0) {
            userInput *= -1;
        }

        //count total number of digit
        int temp = userInput;
        int totalDigits = 0;
        int sum = 0;
        while (temp != 0) {
            totalDigits++;
            temp /= 10;
        }//end while statement

        // iterate through each digit of the number
        for (int i = totalDigits - 1; i >= 0; i--) {
            int digit = (userInput / (int) Math.pow(10, i)) % 10;
            sum += digit;
        }//end For Loop

        if ( (sum % 3) != 0 ){
            System.out.println("Prime by modulus");
        }
        if(lastDigit == 0 || lastDigit == 2 || lastDigit == 4 || lastDigit == 6 || lastDigit == 8 ){
            System.out.println("Not Prime");
        }; //end of if statement

    }//End of calculation

}//End of Main