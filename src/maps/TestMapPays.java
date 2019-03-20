/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import listes.Ville;
import sets.Pays;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class TestMapPays
{
	static Map <String, Pays> map = new HashMap <> ();
	
	public static void afficher ()
	{
		Iterator <String> iteratorKey = map.keySet().iterator();
		Iterator <Pays> iteratorPays = map.values().iterator();
		while (iteratorKey.hasNext())
		{
			System.out.println("Clé : " + iteratorKey.next () + " - Pays : " + iteratorPays.next ());
		}
		System.out.println("------------------------");
	}
	
	
	public static void main (String [] args)
	{
		// Initialisation pour la liste des pays en static à l'intérieur de la classe
		Pays p = new Pays ();
		
		for (Pays s : Pays.setP)
			map.put (s.nomPays, s);
		
		afficher ();
		
		int min = Integer.MAX_VALUE;
		Iterator <Pays> iteratorPays2 = map.values().iterator();
		while (iteratorPays2.hasNext())
		{
			Pays paysTemp = iteratorPays2.next ();
			if (paysTemp.nbHabitant > min)
			{
				paysTemp.nbHabitant = min;
				p = paysTemp;
			}
		}
		
		map.remove(p.nomPays);
		
		afficher ();
	}
}
