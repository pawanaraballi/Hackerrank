/* Largest Rectangle 
Largest Rectangular Area in a Histogram
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack();
        int in = s.nextInt();
        int[] input = new int[in];
        for(int i =0; i< in; i++){
            input[i] = s.nextInt();  
        }
        int i = 0;
        int maxarea = 0;
        int tp, currentarea;
        while(i < in){
            if(stack.isEmpty() || input[stack.peek()] <= input[i]){
                stack.push(i++);
            }else{
                tp = stack.peek();
                stack.pop();
                currentarea = input[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                if(maxarea < currentarea){
                    maxarea = currentarea;
                }
            }
        }
        while (stack.isEmpty() == false){
            tp = stack.peek();
            stack.pop();
            currentarea = input[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            if(maxarea < currentarea){
                maxarea = currentarea;
            }
        }
        System.out.println(maxarea);
    }
}