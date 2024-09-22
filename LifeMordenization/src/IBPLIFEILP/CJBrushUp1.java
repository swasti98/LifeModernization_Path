package IBPLIFEILP;

public class CJBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,4,6,8,10};
		System.out.println("array value for index3 is : "+ arr[3]);
		
		int arr1[] = new int[3];
		arr1[0] = 1;
		arr1[1] = 5;
		arr1[2] = 9;
		System.out.println("array value for index2 is : "+ arr1[2]);
		
		//find the largest no in the array
		
		int arr2[]= {13,41,65,89,10,20};
		int max = arr2[0];
		int min = arr2[0];
		
		for(int i =0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
			
			if(arr2[i]>max)
			{
				max = arr2[i];
			}
			else if(arr2[i]<min)
			{
				min = arr2[i];
			}
		}
		
		System.out.println("Max no in the array is : "+max );
		System.out.println("Min no in the array is : "+min );
		
		//Enhanced for Loop
		String Name[]= {"Swasti", "Sourav", "Sambit", "Anshuman"};
		for (String s : Name)
		{
			System.out.println("Name of the friends are : "+ s );
		}
		
		
		
	}

}
