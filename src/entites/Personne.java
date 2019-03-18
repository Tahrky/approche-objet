package entites;

import entites.AdressePostale;

public class Personne 
{
	private String nom;
	private String prenom;
	private AdressePostale adressePostale;
	
	public Personne ()
	{}
	
	public Personne (String nom, String prenom)
	{
		setNom (nom);
		this.prenom = prenom;
	}
	
	public Personne (String nom, String prenom, AdressePostale adressePostale)
	{
		this(nom, prenom);
		this.adressePostale = adressePostale;
	}
	
	public void setNom (String nom)
	{
		this.nom = nom.toUpperCase();
	}
	
	public String getNom ()
	{
		return nom;
	}
	
	public void setPrenom (String prenom)
	{
		this.prenom = prenom;
	}
	
	public String getPrenom ()
	{
		return prenom;
	}
	
	public void setAdressePostale (AdressePostale adressePostale)
	{
		this.adressePostale = adressePostale;
	}
	
	public AdressePostale getAdressePostale ()
	{
		return adressePostale;
	}
	
}


