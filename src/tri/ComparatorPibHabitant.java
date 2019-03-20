/**
 * 
 */
package tri;

import java.util.Comparator;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class ComparatorPibHabitant implements Comparator<Pays>
{

	@Override
	public int compare(Pays o1, Pays o2)
	{
		if (o2.getPibHab () < o1.getPibHab ())
			return 1;
		else if (o2.getPibHab () > o1.getPibHab ())
			return -1;
		return 0;
	}

}
