
public class Triangulo_NRT extends FiguraGeometrica_NRT {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo_NRT(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		ladoA = lado1;
		ladoB = lado2;
		ladoC = lado3;
	}

	@Override
	public double perimetro() {
		return ladoA + ladoB + ladoC;
	}

	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-ladoA) * (sp-ladoB) * (sp-ladoC));
	}
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
}
