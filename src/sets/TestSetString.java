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
public class TestSetString
{

	static Set <String> set = new HashSet <> ();
	
	public static void afficheSet ()
	{
		System.out.println(" --- DEBUT DE LISTE ---");
		
		for (String s : set)
			System.out.println(s + ", ");
		
		System.out.println("--- FIN DE LISTE ---");
	}
	
	public static void main (String [] args)
	{
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		afficheSet ();
		
		int nbLettreMax = 0;
		for (String st : set)
			if (st.length() > nbLettreMax)
				nbLettreMax = st.length();	
		
		String plusLongString = null;
		for (String st : set)
			if (st.length() == nbLettreMax)
			{
				System.out.println(st);
				plusLongString = st;
			}
				
		///*
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			if (it.next () == plusLongString)
				it.remove();
		//*/
		
		Set <String> set2 = new HashSet <> ();
		for (String st : set)
			set2.add(st.toUpperCase());
		set = set2;
		
		afficheSet ();
	}

}
