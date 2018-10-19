
public class Quadrado extends FiguraGeometricaComparavel {
	private int lado;

	public Quadrado(int lado) {
		super();
		this.lado = lado;
	}

	@Override
	public String getNomeFigura() {
		return "quadrado";
	}

	@Override
	public double getArea() {
		return (double) lado * lado;
	}

	@Override
	public double getPerimetro() {
		return 4 * lado;
	}

	public int getLado() {
		return lado;
	}
	
	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", area=" + getArea() + ", perimetro=" + getPerimetro() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lado;
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
		if (!(obj instanceof Quadrado)) {
			return false;
		}
		Quadrado other = (Quadrado) obj;
		if (lado != other.lado) {
			return false;
		}
		return true;
	}
}
