/* Maximum Elements */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        s2.push(0);
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        for(int i = 0; i < input; i++){
            int op = s.nextInt();
            if(op == 1){
                int in = s.nextInt();
                s1.push(in);
                if(in >= s2.peek()){
                    s2.add(in);
                }
            }else if(op == 2){
                int value = s1.pop();
                if(value == s2.peek()){
                    s2.pop();
                }
            }else if(op == 3){
                System.out.println(s2.peek());
            }
        }
    }
}
