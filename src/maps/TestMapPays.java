/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sets.Pays;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class TestMapPays
{
	static Set <Pays> setP = new HashSet <> ();
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
		
		setP.add(new Pays("USA", 327167434, 55805.204 ));
		setP.add(new Pays("France", 67795000, 38476.7));
		setP.add(new Pays("Allemagne", 82979100, 47589.972));
		setP.add(new Pays("UK", 65105246, 43770.688));
		setP.add(new Pays("Italie", 60483973, 29866));
		setP.add(new Pays("Japon", 126168156, 39058.5));
		setP.add(new Pays("Chine", 1417913092, 7989.72));
		setP.add(new Pays("Russie", 146880400, 11099.20));
		setP.add(new Pays("Inde", 1296834042, 1626.982));
		
		for (Pays s : setP)
			map.put (s.getNomPays (), s);
		
		afficher ();
		
		int min = Integer.MAX_VALUE;
		Pays p = new Pays ();
		Iterator <Pays> iteratorPays2 = map.values().iterator();
		while (iteratorPays2.hasNext())
		{
			Pays paysTemp = iteratorPays2.next ();
			if (min > paysTemp.getNbHabitant () )
			{
				min = paysTemp.getNbHabitant ();
				p = paysTemp;
			}
		}

		map.remove(p.getNomPays ());
		
		afficher ();
	}
}
