/* Heap operations using Priority Queue Java  */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        PriorityQueue<Integer> p = new PriorityQueue<>();
        int input = s.nextInt();
        for(int i = 0; i < input; i++){
            int k = s.nextInt();
            if(k == 1){
                p.add(s.nextInt());
            }else if(k == 2){
                p.remove(s.nextInt());
            }else if(k == 3){
                System.out.println(p.peek());
            }
            
        }
    }
}
