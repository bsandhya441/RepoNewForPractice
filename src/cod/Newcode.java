package cod;

import java.util.HashMap;
import java.util.Map;

public class Newcode
{
	public static void main(String[] args)
	{
		String s="my name is sandhya my name name is is is sandhya rani rani";
		String[] ar=s.split(" ");
		System.out.println(ar.length);
		System.out.println("repeatetive words are:");
		Map<String,Integer> m=new HashMap<String,Integer>();
		int c=1;
		for(int i=0;i<ar.length;i++)
		{
			if(!m.containsKey(ar[i]))
				m.put(ar[i],c); 
			
			else
				m.put(ar[i], m.get(ar[i])+1);
		}
		System.out.println(m);
	}
}