package cod;

public class countchar {
public static void main(String[] args)
{
	String s="my character is simpmle i j kl";
	int i=s.length()-s.replaceAll("m","").length();
	System.out.println(i);
	System.out.println(s);
	
}
}
