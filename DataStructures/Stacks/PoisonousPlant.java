/* Poisonous Plant */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        int arr[] = new int[t];
        int k = 0;
        arr[0] = s.nextInt();
        for(int i = 1; i<t; i++){
            arr[i] = s.nextInt();  
        }
        int c = 0;
        int days = 0;
        int i = 1;
        while(true){
            c = 0;
           for(i = 1;i<arr.length;i++){
              while(arr[i] == -1 ){
                   i++;
                   if(i >= arr.length){
                       break;
                   } 
              }
              if(i >= arr.length){
                 break;       
              }
              if(arr[i] > arr[c]){
                 st.push(i);
              }
              c = i;
            }
            if(st.empty()){
                System.out.println(days);
                break;
            }
            while(!st.empty()){
                arr[st.pop()] = -1;
            }
            days++;
        }
    }
}
