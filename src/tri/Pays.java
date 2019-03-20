package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class Pays
{

	public static List <Pays> listP = new ArrayList <> ();
	private String nomPays;
	private int nbHabitant;
	private double pibHab;
	
	public String getNomPays()
	{
		return nomPays;
	}

	public void setNomPays(String nomPays)
	{
		this.nomPays = nomPays;
	}

	public int getNbHabitant()
	{
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant)
	{
		this.nbHabitant = nbHabitant;
	}

	public double getPibHab()
	{
		return pibHab;
	}

	public void setPibHab(double pibHab)
	{
		this.pibHab = pibHab;
	}

	public Pays ()
	{}
	
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
	
	public static void afficher (List <Pays> s)
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
		listP.add(new Pays("USA", 327167434, 55805.204 ));
		listP.add(new Pays("France", 67795000, 38476.7));
		listP.add(new Pays("Allemagne", 82979100, 47589.972));
		listP.add(new Pays("UK", 65105246, 43770.688));
		listP.add(new Pays("Italie", 60483973, 29866));
		listP.add(new Pays("Japon", 126168156, 39058.5));
		listP.add(new Pays("Chine", 1417913092, 7989.72));
		listP.add(new Pays("Russie", 146880400, 11099.20));
		listP.add(new Pays("Inde", 1296834042, 1626.982));
		
		afficher (listP);
		
		Collections.sort(listP, new ComparatorPibHabitant ());
		
		afficher (listP);
		
		Collections.sort(listP, new ComparatorHabitant ());
		
		afficher (listP);
		
	}
}
