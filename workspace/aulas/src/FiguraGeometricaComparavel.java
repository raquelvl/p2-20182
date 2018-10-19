
public abstract class FiguraGeometricaComparavel implements FiguraGeometrica {

	@Override
	public int compareTo(FiguraGeometrica o) {
		if (getArea() < o.getArea())
			return -1;
		if (getArea() == o.getArea())
			return 0;

		return 1;
	}

	@Override
	abstract public String getNomeFigura();

	@Override
	abstract public double getArea();

	@Override
	abstract public double getPerimetro();

}
