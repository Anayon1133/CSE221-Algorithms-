/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author 17301133
 */
import java.util.Stack;
public class st {
    public static void main(String[]args){
        
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(10);
        
        System.out.println("Pushing 10.....");
        System.out.println("Printing top:");
        System.out.println(stk.peek());
        stk.push(5);
        System.out.println("Pushing 5.......");
        System.out.println("Printing top:");
        System.out.println(stk.peek());
        stk.push(6);
        System.out.println("Pushing 6.......");
        System.out.println("Printing top:");
        System.out.println(stk.peek());
        stk.pop();
        System.out.println("Popping");
        System.out.println("Printing top:");
        System.out.println(stk.peek());
        stk.push(9);
        System.out.println("Pushing 5.......");
        System.out.println("Printing top:");
        System.out.println(stk.peek());
        stk.push(3);
        System.out.println("Pushing 5.......");
        System.out.println("Printing top:");
        System.out.println(stk.peek());
        stk.push(2);
        System.out.println("Pushing 5.......");
        System.out.println("Printing top:");
        System.out.println(stk.peek());
        stk.pop();
        System.out.println("Popping");
        System.out.println("Printing top:");
        System.out.println(stk.peek());
        stk.pop();
        System.out.println("Popping");
        System.out.println("Printing top:");
        System.out.println(stk.peek());
    }
}
