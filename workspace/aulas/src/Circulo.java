
public class Circulo extends FiguraGeometricaComparavel {

	private int raio;
	private String cor = "lilas";

	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

	@Override
	public String getNomeFigura() {
		return "circulo";
	}

	@Override
	public double getArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public double getPerimetro() {
		return 2 * Math.PI * raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", getArea()=" + getArea() + ", getPerimetro()=" + getPerimetro() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + raio;
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
		if (!(obj instanceof Circulo)) {
			return false;
		}
		Circulo other = (Circulo) obj;
		if (raio != other.raio) {
			return false;
		}
		return true;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getRaio() {
		return raio;
	}

//	@Override
//	public int compareTo(FiguraGeometrica o) {
//		if (getArea() < o.getArea())
//			return -1;
//		if (getArea() == o.getArea())
//			return 0;
//
//		return 1;
//	}

}
