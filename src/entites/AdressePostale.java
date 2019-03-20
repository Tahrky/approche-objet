package entites;

public class AdressePostale 
{
	@SuppressWarnings("unused")
	private int numero;
	@SuppressWarnings("unused")
	private String typeVoie;
	@SuppressWarnings("unused")
	private int codePostal;
	@SuppressWarnings("unused")
	private String ville;
	
	public AdressePostale (int numero, String typeVoie, int codePostal, String ville)
	{
		this.numero = numero;
		this.typeVoie = typeVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
