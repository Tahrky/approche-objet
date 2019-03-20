/**
 * 
 */
package listes;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class Ville
{
	
	String nomVille;
	int nbHabitant;
	
	
	public Ville(String nomVille, int nbHabitant)
	{
		super();
		this.nomVille = nomVille;
		this.nbHabitant = nbHabitant;
	}

	public String toString ()
	{
		return (nomVille + ", " + nbHabitant + " hab.");
	}
	
	// GETTERS & SETTERS
	
	public String nomVille (int nb)
	{
		if (nb == nbHabitant)
				return nomVille;
		
		return null;
	}

	public String getNomVille()
	{
		return nomVille;
	}

	public void setNomVille(String nomVille)
	{
		this.nomVille = nomVille;
	}

	public int getNbHabitant()
	{
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant)
	{
		this.nbHabitant = nbHabitant;
	}
}
