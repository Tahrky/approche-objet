package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne 
{
	public static void main(String[] args) 
	{
		AdressePostale adresse1 = new AdressePostale (5, "Rue des lilas", 84000, "Avignon");
		
		Personne personne1 = new Personne ("Bouloulou", "Lilian", adresse1);
		
		Personne personne2 = new Personne ("Bouloulou", "Anabelle", adresse1);			
	}

}
