package IBPLIFEILP;

import java.util.ArrayList;

public class JavaCode1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//Count the no of names starting with alphabet A in the List & print the names:.
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Subhankar");
		names.add("Sarthak");
		names.add("Amlan");
		names.add("Mohit");
		names.add("Aman");
		names.add("Bibek");
		int count = 0;
		for(int i =0; i<names.size();i++)
		{
			String alphabet = names.get(i);
		
			
			if(alphabet.startsWith("A"))
			{
				count++;
				System.out.println(alphabet);
			}
		}
		System.out.println(count);
	}

}
