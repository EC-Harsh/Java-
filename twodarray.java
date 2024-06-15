import java.util.Scanner;

public class twodarray {
    static int [] rev(int arr[]){
        int n = arr.length;
        for(int i=0,j=n-1;i<j;i++,j--){
            int t =arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        return arr;
    }
    static int [] krev(int arr[],int k){
        int n = arr.length;
       k%=n;
        for(int i=0,j=(n-k-1);i<j;i++,j--){
            int t =arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        
        for(int i=n-k,j=n-1;i<j;i++,j--){
            int t =arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        return rev(arr); 
    }
    static int[][] rotate90(int a[][],int r, int c){
        a=transpose(a, r, c);
        
         for(int i =0;i<r;i++){
            a[i]=rev(a[i]);
         }   
        return a ;
    }
    static int[][] transpose(int a[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        return a;
    }
    static int[][] pascal(int n){
        int p[][]=new int[n][];
        for(int i=0;i<n;i++){
            p[i]=new int[i+1];
           
            p[i][0]=p[i][i]=1;
            for(int j=1; j < i ; j++){
                p[i][j]=p[i-1][j]+p[i-1][j-1];    
                
            }
        }
        return p ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number of rows: ");
        // int row = sc.nextInt();
        // System.out.println("Enter Number of coloumns: ");
        // int col = sc.nextInt();
        // int [][]arr=new int[row][col];
        // System.out.printf("Enter %d elements: \n",row*col);
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // arr=rotate90(arr, row, col);
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        System.out.println("Enter Number of rows in pascal triangle You Want");
        int rowp=sc.nextInt();
        int a[][] = pascal(rowp);
        for(int i=0;i<rowp;i++){
            int co = a[i].length;
            for(int j=0;j<co;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
