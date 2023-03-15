import java.util.Scanner;

public class advpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n; j++){
                if(j<=i){
                    System.out.print("*");
                }
                else if (j>=(2*n-a)) {
                    System.out.print("*");
                } 
               
                else{
                    System.out.print(" ");
                }
               
            }
            a = a + 1;
            System.out.println();
        }
        
        for(int i=n; i>=1; i--){
            for(int j=1; j<=2*n; j++){
                if(j<=i){
                    System.out.print("*");
                }
                else if (j<=(2*n-i)) {
                    System.out.print(" ");
                } 
               
                else{
                    System.out.print("*");
                }
               
            }
            
            System.out.println();
        }
    }
}
