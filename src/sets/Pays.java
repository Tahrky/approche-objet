/**
 * 
 */
package sets;

import java.util.Set;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class Pays
{

	private String nomPays;
	private int nbHabitant;
	private double pibHab;
	
	public Pays () {}
	
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

	// GETTERS & SETTERS
	
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
}
