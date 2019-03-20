/**
 * 
 */
package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class TestSetDouble
{
	
	static Set <Double> set = new HashSet <> ();
	
	public static void afficheSet ()
	{
		System.out.println(" --- DEBUT DE LISTE ---");
		
		for (Double s : set)
			System.out.println(s + ", ");
		
		System.out.println("--- FIN DE LISTE ---");
	}
	
	public static void main (String [] args)
	{
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		afficheSet ();
		
		double max = -Double.MAX_VALUE;
		double min = Double.MAX_VALUE;
		
		for (Double s : set)
		{
			if (max < s)
				max = s;
			if (min > s)
				min = s;
		}
			
		System.out.println("Valeur maximum : " + max);
		
		///*
		Iterator<Double> it = set.iterator();
		while (it.hasNext())
			if (it.next () == min)
				it.remove();
		//*/
		
		Set <Double> set2 = new HashSet <> ();
		for (Double setIndiv : set)
			if (setIndiv > 0.0d)
				set2.add(setIndiv);
			else
				set2.add(-setIndiv);
		set = set2;
				
		afficheSet ();
	}
}
