/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_usingthreads;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author engmo
 */
public class Calculator_usingThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instant start = Instant.now();
        // TODO code application logic here
        System.out.println("Enter Four Numbers");
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[4];
        for (int i=0; i<4;i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("Your numbers are"+Arrays.toString(numbers));
       Calc_thread opeartion_one = new Calc_thread(numbers[0], numbers[1]);
       Calc_thread operation_two = new Calc_thread(numbers[2], numbers[3]);
       System.out.println("Start Executing using Threads");
       Thread thread_one = new Thread(opeartion_one);
       Thread thread_two = new Thread(operation_two);
       thread_one.start();
       thread_two.start();
       System.out.println("Done in : "+Duration.between(start, Instant.now()).toMillis());
    }
    
}
