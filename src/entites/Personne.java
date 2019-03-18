package entites;

import entites.AdressePostale;

public class Personne 
{
	private String nom;
	private String prenom;
	private AdressePostale adressePostale;
	
	public Personne ()
	{}
	
	public Personne (String _nom, String _prenom)
	{
		nom = _nom;
		prenom = _prenom;
	}
	
	public Personne (String _nom, String _prenom, AdressePostale _adressePostale)
	{
		nom = _nom;
		prenom = _prenom;
		adressePostale = _adressePostale;
	}
	
	public void setNom (String _nom)
	{
		nom = _nom;
	}
	
	public String getNom ()
	{
		return nom;
	}
	
	public void setPrenom (String _prenom)
	{
		prenom = _prenom;
	}
	
	public String getPrenom ()
	{
		return prenom;
	}
	
	public void setAdressePostale (AdressePostale _adressePostale)
	{
		adressePostale = _adressePostale;
	}
	
	public AdressePostale getAdressePostale ()
	{
		return adressePostale;
	}
	
}
