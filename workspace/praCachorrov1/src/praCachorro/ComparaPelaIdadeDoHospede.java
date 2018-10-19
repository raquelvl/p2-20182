package praCachorro;

import java.util.Comparator;

public class ComparaPelaIdadeDoHospede implements Comparator<Estadia>{

	@Override
	public int compare(Estadia o1, Estadia o2) {
		return o1.getCachorro().getNumMeses() - o2.getCachorro().getNumMeses();
	}

}
