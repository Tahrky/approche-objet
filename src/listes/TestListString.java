/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class TestListString
{
	private static List <String> listString = new ArrayList <String> (); 
	
	public static void afficheListe ()
	{
		System.out.println(" --- DEBUT DE LISTE ---");
		
		for (String nb : listString)
			System.out.println(nb + ", ");
		
		System.out.println("--- FIN DE LISTE ---");
	}
	
	public static void main (String [] args)
	{
		listString.add("Nice");
		listString.add("Carcasonne");
		listString.add("Narbonne");
		listString.add("Lyon");
		listString.add("Foix");
		listString.add("Pau");
		listString.add("Marseille");
		listString.add("Tarbes");
		
		afficheListe ();
		
		int nbLettreMax = 0;
		for (String st : listString)
			if (st.length() > nbLettreMax)
				nbLettreMax = st.length();	
		
		for (int i = 0; i < listString.size (); i++)
			listString.set (i, listString.get(i).toUpperCase());
		
		Iterator <String> iteratorString = listString.iterator();
		while (iteratorString.hasNext())
		{
			String temp = iteratorString.next();
			if (temp.charAt(0) == 'N')
				iteratorString.remove();
		}
		
		afficheListe ();
				
	}

}
