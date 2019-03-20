/**
 * 
 */
package tri;

import java.util.Comparator;

/**
 *
 * @author BIRABEN-BIANCHI Hugo
 */
public class ComparatorHabitant implements Comparator<Pays>
{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Pays arg0, Pays arg1)
	{
		if (arg1.nbHabitant < arg0.nbHabitant)
			return 1;
		else if (arg1.nbHabitant > arg0.nbHabitant)
			return -1;
		return 0;
	}

}
