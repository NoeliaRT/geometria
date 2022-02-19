import static org.junit.Assert.*;

import org.junit.Test;

public class Circulo_NRTTest {

	@Test
	public void testArea() {
		Circulo_NRT c=new Circulo_NRT(-3,"circulo");
		double res=c.area();
		assertEquals(28.27,0,res);
	}

	@Test
	public void testPerimetro() {
		Circulo_NRT c=new Circulo_NRT(-3,"circulo");
		double res=c.perimetro();
		assertEquals(18.84,0,res);
	}

	
	@Test
	public void testGetTipoFigura() {
		Circulo_NRT c=new Circulo_NRT(-3,"circulo");
		String res=c.getTipoFigura();
		assertEquals("circulo",res);
	}

}
