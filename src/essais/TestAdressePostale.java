package essais;

import entites.AdressePostale;

public class TestAdressePostale 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		AdressePostale adresse1 = new AdressePostale (5, "Rue des lilas", 84000, "Avignon");
		
		AdressePostale adresse2 = new AdressePostale (18, "Rue des petites paquerettes", 34000, "Montpellier");
	}

}
