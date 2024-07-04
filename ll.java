import java.util.Scanner;

class Node{
     int data;
   
    Node nl;

}
public class ll {
    static Node clist(int n){
        Scanner sc = new Scanner(System.in);
        Node head =new Node();
        Node ptr = head;
        int i =1;
        while(n!=0){
            if(i==1){
                head.nl=null;
            }
            else{
                ptr.nl= new Node();
                ptr=ptr.nl;
                
            }
            n--;
            System.out.print("Enter Value for Node "+ i++ +" : ");
            ptr.data = sc.nextInt();    
        }
        ptr.nl=null;
        
        return head;
    }
    static void printl(Node ptr){
        while(ptr!=null){
            System.out.print(ptr.data+"-> ");
            ptr=ptr.nl;
        }
        System.out.println("Null");
        
    }
    public static void main(String[] args) {
        Node l=clist(5);
        printl(l);
    }
}
