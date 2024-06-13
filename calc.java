import java.util.Scanner;

public class calc {
    static double add(double n1 ,double n2){
        return n1+n2;
    }
    static double sub(double n1 ,double n2){
        return n1-n2;
    }

    static double mul(double n1 ,double n2){
        return n1*n2;
    }

    static double div(double n1 ,double n2){
        return n1/n2;
    }


    
    public static void main(String[] args) {
        System.out.println("Welcome To The calculator: ");
        System.out.println("Enter The  Number:");
        Scanner sc =new Scanner(System.in);
        Double num1 = sc.nextDouble();
        
        while(true){
            System.out.println("Output: "+ num1);
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Clear\n6.Exit");
            System.out.println("Enter Your Choice: ");
        int ch =sc.nextInt();
        if(ch==6){
            System.out.println("DONE :)\n");
            break;
        }
        if(ch==5){
            num1=0.0;
            continue;
        }
            
        System.out.println("Enter The  Number:");
        Double num2 = sc.nextDouble();
        
        switch (ch) {
            
            case 1-> {
                num1=add(num1,num2);
            }
            case 2-> {
                num1=sub(num1,num2);
            }
            case 3-> {
                num1=mul(num1,num2);
            }
            case 4-> {
                num1=div(num1,num2);
            }
           
            case 6-> {break;}
            default-> System.out.println("Enter Correct choice: ");
        }
    

        }
    }
}
