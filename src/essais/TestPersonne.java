package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne 
{
	public static void main(String[] args) 
	{
		AdressePostale adresse1 = new AdressePostale ();
		adresse1.numero = 5;
		adresse1.typeVoie = "Rue des lilas";
		adresse1.codePostal = 84000;
		adresse1.ville = "Avignon";
		
		Personne personne1 = new Personne ();
		personne1.nom = "Bouloulou";
		personne1.prenom = "Lilian";
		personne1.adressePostale = adresse1;
		
		Personne personne2 = new Personne ();
		personne2.nom = "Bouloulou";
		personne2.prenom = "Anabelle";
		personne2.adressePostale = adresse1;			
	}

}
