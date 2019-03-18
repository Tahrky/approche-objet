package entites;

public class AdressePostale 
{
	private int numero;
	private String typeVoie;
	private int codePostal;
	private String ville;
	
	public AdressePostale (int numero, String typeVoie, int codePostal, String ville)
	{
		this.numero = numero;
		this.typeVoie = typeVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
