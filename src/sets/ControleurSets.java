/**
 * 
 */
package sets;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class ControleurSets
{
	public static Set <Pays> setP = new HashSet <> ();
	
	public static void main(String[] args)
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
		
		int max = 0;
		for (Pays pays : setP)
			if (pays.getNbHabitant() > max)
				max = pays.getNbHabitant();
		
		for (Pays pays : setP)
			if (pays.nomPaysPop (max) != null)
				System.out.println("Plus grand nombre Habs : " + pays.nomPaysPop (max));
		
		double maxD = 0;
		for (Pays pays : setP)
			if (pays.getPibHab () > maxD)
				maxD = pays.getPibHab ();
		
		for (Pays pays : setP)
			if (pays.nomPaysPIB (maxD) != null)
				System.out.println("Plus grand nombre PIB : " + pays.nomPaysPIB (maxD));
		
		double min = Double.MAX_VALUE;
		for (Pays pays : setP)
			if (pays.getPibHab () < min)
				min = pays.getPibHab ();
		
		Set <Pays> setP2 = new HashSet <> ();
		for (Pays pays : setP)
			if (pays.nomPaysPIB (min) != null)
				setP2.add(new Pays (pays.getNomPays ().toUpperCase (), pays.getNbHabitant(), pays.getPibHab ()));
			else
				setP2.add(pays);
		setP = setP2;
		
		Pays.afficher (setP);
		
		setP2 = new HashSet <> ();
		for (Pays pays : setP)
			if (pays.nomPaysPIB (min) == null)
				setP2.add(pays);
				
		setP = setP2;
		
		Pays.afficher (setP);
	}
}
