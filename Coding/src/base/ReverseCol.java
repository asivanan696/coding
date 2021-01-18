package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Testing of the ";
				char[] chara = s.toCharArray();
				List<Character> a=new ArrayList<>();
				for(char h:chara) 
					a.add(h);
					Collections.reverse(a);
					 ListIterator itr = a.listIterator();
					
					while(itr.hasNext())
						System.out.print(itr.next());
				
		

	}

}
