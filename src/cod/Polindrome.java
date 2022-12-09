package cod;

public class Polindrome {
public static void main(String args[])
{
	String st="abcca";
/*	StringBuilder bu=new StringBuilder(st);
	bu.reverse();
	String nst=bu.toString();
	if(st.equals(nst))
		System.out.println("true");
	else
		System.out.println("false");
	
	String s1="";
	char c;
	for(int i=st.length()-1;i>=0;i--)
	{
		c=st.charAt(i);
		s1=s1+c;
	}
	System.out.println(s1+"  "+st);*/
	
	int l=st.length();
	
	for(int i=0;i<l/2;i++)
	{
		if(st.charAt(i) != st.charAt(l-i-1))
		{
			System.out.print("not polindrome");
			break;
		}
	}
	
	System.out.println("true");		
}
}
