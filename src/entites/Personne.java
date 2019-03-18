package entites;

import entites.AdressePostale;

public class Personne 
{
	private String nom;
	private String prenom;
	private AdressePostale adressePostale;
	
	public Personne (String _nom, String _prenom, AdressePostale _adressePostale)
	{
		nom = _nom;
		prenom = _prenom;
		adressePostale = _adressePostale;
	}
}
