import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s =  new Scanner(System.in);
        PriorityQueue<Integer> p = new PriorityQueue<>();
        int input = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[input];
        for (int i = 0; i < input; i++) {
            p.add(s.nextInt());
        }
        int op = 0, i = 0;
        boolean flag = true;
        while(p.peek() < k && p.size() >= 2){
            int sweetness = (1 * p.poll()) + (2 * p.poll());
            p.add(sweetness);
            op++;
        }
        if(p.size() == 1 && p.peek() < k){
            op = -1;    
        }
        System.out.println(op);
    }
}