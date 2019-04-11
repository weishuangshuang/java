package sx;

import java.util.Comparator;

public class ACompartar implements Comparator<A> {

	@Override
	public int compare(A o1, A o2) {
		
		return o1.val - o2.val;
	}

}
