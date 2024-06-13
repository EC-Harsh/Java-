import java.util.Scanner;

public class ttt {
    public static void pboard(int a[]){ // static is written so we can call pboard with out object .
        for(int i=0;i<9;i++){
            char x=a[i]==1?'X':'O';
            if(a[i]!=0){
                System.out.printf("|%c ",x);
            }
            else {
                System.err.printf("|  ");
            }
            if((i+1)%3==0){
                System.out.println("\n-------");
            }
        }
    }
    public static char check(int b[]){
        int cx,co;
        for(int i=0;i<3;i++){
            cx=0;co=0;
            for(int j=i;j<=6+i;j+=3){//checking vertical columns
                if(b[j]==1){
                    cx+=1;
                }
                if(b[j]==2){
                    co+=1;
                }
            }
            if(co==3){
                return 'o'; }
            if(cx==3){
                return 'x'; }
            co=0;cx=0;
            for(int j=i*3;j<=(i*3)+2;j++){//checking horizontal rows                                  
                if(b[j]==1){
                    cx+=1;
                }
                if(b[j]==2){
                    co+=1;
                }
            }
            if(co==3){
                return 'o';}
            if(cx==3){
                return 'x';}
            co=0;cx=0;
            if(i==0||i==2){
                for(int j=i;j<=8-i;j+=4-i){//Checking diagonal rows
                  if(b[j]==1){
                    cx+=1;
                }
                if(b[j]==2){
                    co+=1;
                }  
                }
                if(co==3){
                    return 'o';}
                if(cx==3){
                    return 'x';}
            }
            
        }
        return 'n';
    }
    public static void main(String[] args) {
        System.out.println("====================================================================================================================");
        System.out.println("\t\t\t\t\t\tWelcome To the Tic Tac Toe ");
        System.out.println("===========================================================================================Developed By: A ENCRYPTOR");
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Player 1's Name: ");
        String p1 = sc.nextLine();
        System.out.println("Enter Player 2's Name: ");
        String p2=sc.nextLine();
        int board[]=new int[9];
        System.out.println("Player 1:"+p1);
        System.out.println("Player 2:"+p2);
        System.out.println("The Board is: ");
        pboard(board);
        int chance=1;
        char x;
        while(true){
            x=chance==1?'X':'O';
            System.out.println("Player "+chance+"'s" +" Chance:"+x);
            System.out.println("Enter A number between 1-9 {Position according to your choice}: ");
            int ch =sc.nextInt();
            if(board[ch-1]>0){
                System.out.println("Position Already be taken\nEnter Correct Choice!!");
                continue;
            }
            if(ch>=1 && ch<=9){
                board[ch-1]=chance;
                chance=chance==1?2:1;
            }
            else {
                System.out.println("Please Enter Correct Choice !!");
            }
            pboard(board);
            char r=check(board);
            if(r=='x'){
                System.out.println("Player 1:"+p1+"  WINS!!!!!");
                break;
            }
            else if(r=='o'){
                System.out.println("Player 2:"+p2+"WINS!!!!!");
                break;
            }
            int s=0;
            for(int i=0;i<9;i++){
                if(board[i]>0)
                    s++;
            }
            if(s==9){
                System.out.println("THE MATCH IS DRAW !!!!");
            }
           

        }







    }
}
