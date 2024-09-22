package IBPLIFEILP;

public class CJBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Swasti Ranjan Senapati";
		String Splitstring[] = s.split("Ranjan");
		System.out.println(Splitstring[0] );
		System.out.println(Splitstring[1] );
		Splitstring[1].trim();
		//Reverse the String
		String p = "DXC Technology";
		for(int i = p.length()-1; i>=0; i--)
		{
			System.out.println(p.charAt(i));

	    }

   }
}
