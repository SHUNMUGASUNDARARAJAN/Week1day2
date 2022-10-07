package week1day2;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr= {1,2,3,4,7,6,8};
    
    Arrays.sort(arr);
    
    System.out.println(Arrays.toString(arr));
    
    for(int i=0;i<arr.length;i++)
    	if(arr[i]!=(i))
    	{
    		System.out.println(i);
    		
    		
    	}
	}

}
