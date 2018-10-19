package praCachorro;

public class HotelFacade {
	private Hotel hotel;

	public HotelFacade(int numQuartos, double valorDiaria) {
		hotel = new Hotel(numQuartos, valorDiaria);
	}

	public void checkin(String nome, String raca, int numMeses, int numDias) {
		hotel.checkin(nome, raca, numMeses, numDias);
	}

	public void checkout(String nome, int quarto) {
		hotel.checkout(nome, quarto);

	}

	public String[] listaEstadias(String ordem) {
		return hotel.listaEstadias(ordem);
	}

	public double getLucro() {
		return hotel.getLucro();
	}

}
