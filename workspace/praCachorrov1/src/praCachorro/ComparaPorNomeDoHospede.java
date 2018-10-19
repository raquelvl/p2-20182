package praCachorro;

import java.util.Comparator;

public class ComparaPorNomeDoHospede implements Comparator<Estadia> {

	@Override
	public int compare(Estadia o1, Estadia o2) {
		return o1.getCachorro().getNome().compareTo(o2.getCachorro().getNome());
	}

}
