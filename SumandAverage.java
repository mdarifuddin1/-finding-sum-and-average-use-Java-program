
package code;

import java.util.Scanner;


public class SumandAverage {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int [] num = new int[5];
        int sum=0,i;
        System.out.print("plase enter a 5 Number");
        
        for(i =0; i<5; i++){
            
           num[i]=input.nextInt();
        }
        
       for(i=0; i<5; i++){
           
           sum = sum+num[i];
       }
       
        System.out.println("The sum is :"+sum);
        System.out.println("The Average "+sum/5);
               
    }
    
}
