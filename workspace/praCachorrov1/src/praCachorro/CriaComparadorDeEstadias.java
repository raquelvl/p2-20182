package praCachorro;

import java.util.Comparator;

public class CriaComparadorDeEstadias {
	
	public static Comparator<Estadia> getComparator(String ordem) {
		if(ordem.equals("idade"))
			return new ComparaPelaIdadeDoHospede();
		if(ordem.equals("nome"))
			return new ComparaPorNomeDoHospede();
		return new ComparaPorNumeroDeDias();
	}

}
