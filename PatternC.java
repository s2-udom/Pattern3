/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practical3;

/**
 *
 * @author Sam
 */
public class PatternC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //declare variables
        int output = 1;
        int m = 5;
        //create outer for loop to repeat process 6 times
        for (int i = 1; i <= 6; i++){
        // now create loop which loops the same number of times as whatever loop the outer loop is on. if this is the 2nd loop then the inner loop will loop twice etc.
        for (int j = 1; j <= i; j++){
            //create if statement to stop spaces from being added unless loop is on its first iteration
            if (j < 2){
                //create for loop to add spaces
            for (int k = 1; k <= m; k++){
            System.out.print(" ");
            }
            }
            //set up iteration for output
        System.out.print(output);
        output = output - 1;
        }
        //go to next line
        System.out.println(" ");
        //reset output value to i + 1
        output = i + 1;
        //count down from 5 for number of spaces added 5 4 3 2 1 0
        m = m - 1;
        }
    }
    
}
