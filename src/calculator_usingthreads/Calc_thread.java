/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_usingthreads;

/**
 *
 * @author engmo
 */
public class Calc_thread implements Runnable{
int a;
int b;

    public Calc_thread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
        int result = a+b;
        System.out.println(a+" + "+b+" = "+result);
    }
 
    
}
