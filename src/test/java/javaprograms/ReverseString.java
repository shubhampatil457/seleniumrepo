package javaprograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "pranjal";
		 char[] ch = str.toCharArray();
		 
		 int size = ch.length;
		 
		 String reverstring ="";
		 
		 for(int i=size-1;i>=0;i--)

		 {
			 reverstring = reverstring +ch[i];
		 }
		
		 System.out.println(reverstring);
		
	}

}
