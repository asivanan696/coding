package base;

import java.util.HashSet;

public class FirstrepHash {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  { 
		        String str = "geeksforgeeks"; 
		        char[] arr = str.toCharArray(); 
		        
		        HashSet<Character> h=new HashSet<>();
		        
		        for(int i=0;i<=arr.length-1;i++) {
		        	
		        	//char c = ;
		        	
		        	
		        	if(h.contains(arr[i])) {
		        		System.out.println(arr[i]);
		        		break;
		        	}		else 
		        			h.add(arr[i]);
		        	
		        	
		        }
		        
		  }   
		        
		    } 
	}


