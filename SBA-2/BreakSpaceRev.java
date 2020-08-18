package sbA;
import  java.util.*;

public class BreakSpaceRev {
String breakspacerev(String breakspacerev) {
		char[] arr = breakspacerev.toCharArray();
		String rev ="";
		for(int i =arr.length-1; i >= 0; i--){
			arr[i]=arr[i];	 
			rev=rev+arr[i];
	}
			String s=rev;
		StringTokenizer str1=new StringTokenizer(s," ");
		String srev="";
		while (str1.hasMoreTokens())
		{
		srev=str1.nextToken()+System.lineSeparator()+srev;
		}
		System.out.println(srev);
		
			
			return " ";
			}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreakSpaceRev rev = new BreakSpaceRev();
		String rev1 = rev.breakspacerev("This Is Java Programming.");
		System.out.println(rev1);
	}	
}
