/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class TestListInt
{

	private static List <Integer> listInt = new ArrayList <Integer> ();
	// Autre notations possibles
	// private static List <Integer> listInt = Arrays.asList (new Integer [] {-1, 5, 7, 3, -2, 4, 8, 5};
	
	public static void afficheListe ()
	{
		System.out.println(" --- DEBUT DE LISTE ---");
		
		for (int nb : listInt)
			System.out.println(nb + ", ");
		
		System.out.println("--- FIN DE LISTE ---");
	}
	
	public static void main (String [] args)
	{
		listInt.add(-1);
		listInt.add(5);
		listInt.add(7);
		listInt.add(3);
		listInt.add(-2);
		listInt.add(4);
		listInt.add(8);
		listInt.add(5);
		
		afficheListe ();
		
		int max = -100;
		int min = 100;
		for (int nb : listInt)
		{
			if (nb > max)
				max = nb;
			
			if (nb < min)
				min = nb;
		}
		
		Iterator <Integer> it = listInt.iterator();
		while (it.hasNext())
			if (it.next () == min)
				it.remove();
		
		///*
		for (int i = 0; i < listInt.size (); i++)
			if (listInt.get(i) < 0)
				listInt.set(i, listInt.get(i)*-1); 
		//*/
				
		
		afficheListe ();
		
	}

}
