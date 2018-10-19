import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FigurasGeometricasController {

	private List<FiguraGeometrica> figuras = new ArrayList<>();

	public void adicionaFigura(FiguraGeometrica figura) {

		figuras.add(figura);
	}

	public double menorFigura() {
		double area = Double.MAX_VALUE;
		for (FiguraGeometrica figura : figuras) {
			if (figura.getArea() < area)
				area = figura.getArea();
		}
		return area;
	}

	public String nomeDaMenorFigura() {
		String nome = null;
		double area = Double.MAX_VALUE;
		for (FiguraGeometrica figura : figuras) {
			if (figura.getArea() < area) {
				area = figura.getArea();
				nome = figura.getNomeFigura();
			}
		}
		return nome;
	}
	
	public void ordena() {
		Collections.sort(figuras);
	}

	@Override
	public String toString() {
		String str = "";
		for (FiguraGeometrica figuraGeometrica : figuras) {
			str += figuraGeometrica.toString() + "\n";
		}
		return "MinhasFigurasGeometricas: \n" + str;
	}

	public static void main(String[] args) {
		FigurasGeometricasController minhasFiguras = new FigurasGeometricasController();
		FiguraGeometrica q1 = new Quadrado(8);
		minhasFiguras.adicionaFigura(q1);
		minhasFiguras.adicionaFigura(new Quadrado(20));
		FiguraGeometrica t1 = new Triangulo(5, 4.33, 5, 5, 5);
		minhasFiguras.adicionaFigura(t1);
		minhasFiguras.adicionaFigura(new Triangulo(10, 4.8, 6, 8, 10));
		minhasFiguras.adicionaFigura(new Circulo(4));
		minhasFiguras.adicionaFigura(new Circulo(1));
		System.out.println(minhasFiguras.nomeDaMenorFigura());
		System.out.println(minhasFiguras);
		minhasFiguras.ordena();
		System.out.println(minhasFiguras);
	}

}
