

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TempoDeVinganca {
	public static void main(String[] args) {
		LocalDate alemanha7x1 = LocalDate.of(2014, Month.JULY, 8);
		LocalDate coreaDoSul2x0 = LocalDate.of(2018, Month.JUNE, 27);

		Period periodo = Period.between(alemanha7x1, coreaDoSul2x0);

		System.out.println("A Alemanha foi eliminada na primeira fase da Copa do Mundo 2018 em jogo contra a Coréia do Sul!");
		System.out.printf("%s anos, %s meses e %s dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());
	}
}
