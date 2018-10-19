package aulas;

import java.util.Scanner;

public class DiarioDeBordo {

	public static void main(String[] args) {
		Anotacao a1 = new Anotacao();
		Anotacao a2 = new Anotacao("31/08/2018", "texto da anotacao");

		a1.setData("31/08/2018");
		a1.setTexto("texto da anotacao");
		
		System.out.println(a1.equals(new Scanner(System.in)));
		System.out.println(a1.equals(a2));
		Anotacao a3 = a2;
		a2.setTexto("Novo texto!");
		System.out.println(a3.getTexto());
		System.out.println(a3.equals(a2));
		System.out.println(a1.pesquisaPalavra("texto"));
	}

}
