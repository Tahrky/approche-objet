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
public class Pays
{

	public static Set <Pays> setP = new HashSet <> ();
	public String nomPays;
	public int nbHabitant;
	public double pibHab;
	
	public Pays ()
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
	}
	
	public Pays(String nomPays, int nbHabitant, double pibHab)
	{
		super();
		this.nomPays = nomPays;
		this.nbHabitant = nbHabitant;
		this.pibHab = pibHab;
	}

	public String nomPaysPop (int nb)
	{
		if (nb == nbHabitant)
			return nomPays;
		return null;
	}
	
	public String nomPaysPIB (double nb)
	{
		if (nb == pibHab)
			return nomPays;
		return null;
	}
	
	public String toString ()
	{
		return (nomPays + " - " + nbHabitant + " Habs. - " + pibHab + " $ PIB/Habs.");
	}
	
	public static void afficher (Set <Pays> s)
	{
		System.out.println(" --- DEBUT DE LISTE ---");
		
		for (Pays nb : s)
			System.out.println(nb + ", ");
		
		System.out.println("--- FIN DE LISTE ---");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		int max = 0;
		for (Pays pays : setP)
			if (pays.nbHabitant > max)
				max = pays.nbHabitant;
		
		for (Pays pays : setP)
			if (pays.nomPaysPop (max) != null)
				System.out.println("Plus grand nombre Habs : " + pays.nomPaysPop (max));
		
		double maxD = 0;
		for (Pays pays : setP)
			if (pays.pibHab > maxD)
				maxD = pays.pibHab;
		
		for (Pays pays : setP)
			if (pays.nomPaysPIB (maxD) != null)
				System.out.println("Plus grand nombre PIB : " + pays.nomPaysPIB (maxD));
		
		double min = Double.MAX_VALUE;
		for (Pays pays : setP)
			if (pays.pibHab < min)
				min = pays.pibHab;
		
		Set <Pays> setP2 = new HashSet <> ();
		for (Pays pays : setP)
			if (pays.nomPaysPIB (min) != null)
				setP2.add(new Pays (pays.nomPays.toUpperCase (), pays.nbHabitant, pays.pibHab));
			else
				setP2.add(pays);
		setP = setP2;
		
		afficher (setP);
		
		setP2 = new HashSet <> ();
		for (Pays pays : setP)
			if (pays.nomPaysPIB (min) == null)
				setP2.add(pays);
				
		setP = setP2;
		
		afficher (setP);
	}

}
