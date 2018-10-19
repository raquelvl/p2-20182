package praCachorro;

import java.util.Comparator;

public class ComparaPorNumeroDeDias implements Comparator<Estadia> {

	@Override
	public int compare(Estadia o1, Estadia o2) {
		return o2.getNumDias() - o1.getNumDias();
	}

}
