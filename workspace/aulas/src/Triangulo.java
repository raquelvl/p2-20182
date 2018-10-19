/**
 *
 * @author Robson Fernando Gomes, Raquel Lopes
 */
public class Triangulo extends FiguraGeometricaComparavel {

	private int base;
	private double altura;
	private int ladoA;
	private int ladoB;
	private int ladoC;

	public Triangulo(int base, double altura, int ladoA, int ladoB, int ladoC) {
		super();
		this.base = base;
		this.altura = altura;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}

	@Override
	public String getNomeFigura() {
		return "Triangulo";
	}

	@Override
	public double getArea() {
		double area = 0;
		area = (base * altura) / 2.0;
		return area;
	}

	@Override
	public double getPerimetro() {
		int perimetro = 0;
		perimetro = ladoA + ladoB + ladoC;

		return perimetro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ladoA;
		result = prime * result + ladoB;
		result = prime * result + ladoC;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Triangulo)) {
			return false;
		}
		Triangulo other = (Triangulo) obj;
		if (ladoA != other.ladoA) {
			return false;
		}
		if (ladoB != other.ladoB) {
			return false;
		}
		if (ladoC != other.ladoC) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Triangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", area=" + getArea()
				+ ", perimetro=" + getPerimetro() + "]";
	}

	
}