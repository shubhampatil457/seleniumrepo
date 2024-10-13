package javaprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

	int a[]= {1,6,5,7,1,7,8,6,9,7,1};
	
     Set<Integer> set = new HashSet<Integer>();
     
    for(int i=0;i<a.length;i++)
    {
    	set.add(a[i]);
    	
    }
//    Integer[] b = set.toArray(new Integer[set.size()]);
//   System.out.println(Arrays.toString(b));
    
    for(int no:set)
    {
    	System.out.print(no+" ");
    }
	}

}
