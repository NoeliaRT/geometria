/**
 * 
 * @author Noelia Ruiz Torrijos
 * @version 1.2
 */
public class Rectangulo_NRT extends FiguraGeometrica_NRT {
	private double l1;
	private double l2;
	
	/**
	 * Constructor rect�ngulo	 
	 * @param tipoFigura
	 * @param lG medida de un lado
	 * @param lP medida de otro lado
	 */
	public Rectangulo_NRT(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
    
	/**
	 * M�todo que calcula el �rea del rect�ngulo
	 * @return area 
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * M�todo que calcula el per�metro del rect�ngulo
	 * @return per�metro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
