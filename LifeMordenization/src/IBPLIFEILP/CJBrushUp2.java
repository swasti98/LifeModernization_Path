package IBPLIFEILP;

import java.util.ArrayList;

public class CJBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Swasti");
		a.add("21/08/1997");
		a.add("DXC Technology");
		a.add("11603678");
		a.add("SDET");
		a.add("JavaSelenium");
		System.out.println(a.remove(3));
		System.out.println(a.get(2));
		System.out.println("*******************");
		for(int i =0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("*******************");
		//foreach Loop or enhanced forloop
		for(String Size : a)
		{
			System.out.println(Size);
			System.out.println(a.contains("Selenium"));
			System.out.println(a.contains("JavaSelenium"));
		}
		
		
	}

}
