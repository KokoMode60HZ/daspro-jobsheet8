import java.util.Scanner;

public class Triangle07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int i = sc.nextInt();

       
        while (i >= 1){
           
            int j = 0;
            while (j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
          i--; 
        }
      sc.close();
    }
}
