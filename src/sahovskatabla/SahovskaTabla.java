package sahovskatabla;

import java.util.Scanner;

public class SahovskaTabla {

    public static void main(String[] args) {
        System.out.println("Enter the number of fields:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    System.out.print("1");
                } else if(i < j) {
                    System.out.print("g");
                } else {
                    System.out.print("d");
                }
            }
            System.out.println();
        }
    }
    
}
