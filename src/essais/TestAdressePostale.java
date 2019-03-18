package essais;

import entites.AdressePostale;

public class TestAdressePostale 
{
	public static void main(String[] args) 
	{
		AdressePostale adresse1 = new AdressePostale ();
		adresse1.numero = 5;
		adresse1.typeVoie = "Rue des lilas";
		adresse1.codePostal = 84000;
		adresse1.ville = "Avignon";
		
		AdressePostale adresse2 = new AdressePostale ();
		adresse2.numero = 18;
		adresse2.typeVoie = "Rue des petites paquerettes";
		adresse2.codePostal = 34000;
		adresse2.ville = "Montpellier";
	}

}
