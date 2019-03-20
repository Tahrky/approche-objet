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
public class ControleurListe
{

	static List <Ville> listeVille = new ArrayList <Ville> ();
	
	public static void afficheListe ()
	{
		System.out.println(" --- DEBUT DE LISTE ---");
		
		for (Ville nb : listeVille)
			System.out.println(nb + "");
		
		System.out.println("--- FIN DE LISTE ---");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		listeVille.add(new Ville ("Nice",343_000));
		listeVille.add(new Ville ("Carcassonne",44_800));
		listeVille.add(new Ville ("Narbonne", 53_400));
		listeVille.add(new Ville ("Lyon",484_000));
		listeVille.add(new Ville ("Foix",9_700));
		listeVille.add(new Ville ("Pau",77_200));
		listeVille.add(new Ville ("Marseille",850_700));
		listeVille.add(new Ville ("Tarbes",40_600));
		
		int max = 0;
		for (Ville ville : listeVille)
			if (ville.nbHabitant > max)
				max = ville.nbHabitant;
		
		for (Ville ville : listeVille)
			if (ville.nomVille (max) != null)
				System.out.println(ville.nomVille (max));
		
		int min = Integer.MAX_VALUE;
		for (Ville ville : listeVille)
			if (ville.nbHabitant < min)
				min = ville.nbHabitant;
		
		Iterator <Ville> iteratorVille = listeVille.iterator();
		while (iteratorVille.hasNext())
		{
			if (iteratorVille.next().nbHabitant == min)
				iteratorVille.remove ();
		}
		
		for (Ville ville : listeVille)
			if (ville.nbHabitant > 100_000)
				ville.nomVille = ville.nomVille.toUpperCase();
		
		afficheListe ();
	}

}
