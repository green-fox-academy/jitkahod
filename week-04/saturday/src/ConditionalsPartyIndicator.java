import java.util.Scanner;
public class ConditionalsPartyIndicator {
public static void main(String[] args){

    int input1;
    int input2;

   Scanner sca = new Scanner (System.in);
   System.out.println("Please add number of girls:");
   input1 = sca.nextInt();

   System.out.println("Please add number of boys:");
   input2 = sca.nextInt();

if ((input1 == input2) && ((input1+input2)>= 20))
    System.out.println("The pary is excelent!");
else if (((input1+input2) >= 20)&&(input1> 0))
    System.out.println("Quite cool party!");
else if (((input1+input2) < 20) && (input1> 0))
    System.out.println("Average party...");
else if (input1 == 0)
    System.out.println("Sausage party...");
}

}
// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people