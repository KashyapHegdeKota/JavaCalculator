import java.util.Scanner;

public class App {
    public static int addition(int num1,int num2){
        int sum;
        return sum = num1 + num2;
    }
    public static int subtraction(int num1,int num2){
        int sub;
        return sub = num1-num2;
    }
    public static int multiplication(int num1,int num2){
        int product;
        return product = num1*num2;
    }
    public static int division(int num1, int num2){
        int division;
        return division  = num1/num2;
        }
    
    public static void main(String[] args){
        // Initializing variables.
        boolean x = true;
        int menu;
        int num1;
        int num2;
        
        //Menu with options.
        while(x){
            Scanner scnr = new Scanner(System.in);
            System.out.println("Java Calculator");
            System.out.println("Options:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Quit");
            System.out.println("Enter:");

            //Taking options from the user.
            menu  = scnr.nextInt();

            if(menu==1){
                System.out.println("Enter first number: ");
                num1 = scnr.nextInt();
                System.out.println("Enter second number");
                num2 = scnr.nextInt();
                System.out.println("The sum of "+num1+ " and "+ num2+ " is "+ addition(num1, num2));
            }
            if(menu==2){
                System.out.println("Enter first number: ");
                num1 = scnr.nextInt();
                System.out.println("Enter second number");
                num2 = scnr.nextInt();
                System.out.println("The difference of "+num1+ " and "+ num2+ " is "+ subtraction(num1, num2));
            }
            if(menu==3){
                System.out.println("Enter first number: ");
                num1 = scnr.nextInt();
                System.out.println("Enter second number");
                num2 = scnr.nextInt();
                System.out.println("The product of "+num1+ " and "+ num2+ " is "+ multiplication(num1, num2));
            }
            if(menu==4){
                System.out.println("Enter first number: ");
                num1 = scnr.nextInt();
                System.out.println("Enter second number");
                num2 = scnr.nextInt();
                System.out.println("The division of "+num1+ " by "+ num2+ " is "+ division(num1, num2));
            }
            if(menu==5){
                break;
            }
        }

    }
    
}
