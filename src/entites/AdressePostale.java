package entites;

public class AdressePostale 
{
	private int numero;
	private String typeVoie;
	private int codePostal;
	private String ville;
	
	public AdressePostale (int _numero, String _typeVoie, int _codePostal, String _ville)
	{
		numero = _numero;
		typeVoie = _typeVoie;
		codePostal = _codePostal;
		ville = _ville;
	}
}
