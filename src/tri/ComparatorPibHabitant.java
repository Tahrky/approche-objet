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

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Pays o1, Pays o2)
	{
		if (o2.pibHab < o1.pibHab)
			return 1;
		else if (o2.pibHab > o1.pibHab)
			return -1;
		return 0;
	}

}
