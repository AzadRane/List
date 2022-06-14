/* contributed by harish*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        LinkedList<Integer> l = new LinkedList<Integer>();
        
        for(int i=0;i<n;i++)
        {
            int val = sc.nextInt();
            l.add(val);
        }
        
        int q = sc.nextInt();
        
        for(int i=0;i<q;i++)
        {
            String ch = sc.next();
            
            if(ch.equals("Insert"))    /* why direct string is not working*/
            {
                int pos = sc.nextInt();
                int val = sc.nextInt();
                
                l.add(pos,val);
            }
            else
            {
                int pos = sc.nextInt();
                l.remove(pos);
            }
            
            
        }
        for(int j:l)
        {
        System.out.print(j+" ");
        }
    
                
        
    }
}
