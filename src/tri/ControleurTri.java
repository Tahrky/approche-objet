/**
 * 
 */
package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class ControleurTri
{
	public static List <Pays> listP = new ArrayList <> ();
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		listP.add(new Pays("USA", 327167434, 55805.204 ));
		listP.add(new Pays("France", 67795000, 38476.7));
		listP.add(new Pays("Allemagne", 82979100, 47589.972));
		listP.add(new Pays("UK", 65105246, 43770.688));
		listP.add(new Pays("Italie", 60483973, 29866));
		listP.add(new Pays("Japon", 126168156, 39058.5));
		listP.add(new Pays("Chine", 1417913092, 7989.72));
		listP.add(new Pays("Russie", 146880400, 11099.20));
		listP.add(new Pays("Inde", 1296834042, 1626.982));
		
		Pays.afficher (listP);
		
		Collections.sort(listP, new ComparatorPibHabitant ());
		
		Pays.afficher (listP);
		
		Collections.sort(listP, new ComparatorHabitant ());
		
		Pays.afficher (listP);
	}

}
