import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class DepositoCombustibleTest {
	
	private DepositoCombustible dep1, dep2, dep3;
	private double res_double;
	private boolean res_boolean;
	
	@Before
	public void inicioPruebas() {
		dep1 = new DepositoCombustible (60, 45);
		dep2 = new DepositoCombustible (60, 0);
		dep3 = new DepositoCombustible (60, 30);
	}
	
	@After
	public void finPruebas() {
		dep1 = null;
	}

	
	//Que compruebe que funciona el método para obtener el nivel actual de depósito.
	@Test
	public void testGetDepositoNivel() {
		res_double = dep1.getDepositoNivel();
		assertEquals(45, res_double, 0.1);
	}

	//Prueba que compruebe que, utilizando el método correspondiente, se obtiene el valor límite de máxima capacidad del depósito.
	@Test
	public void testGetDepositoMax() {
		res_double = dep1.getDepositoMax();
		assertEquals(60, res_double, 0.1);
	}

	//Prueba para comprobar que funciona el método para saber si el depósito está vacío.
	@Test
	public void testEstaVacio() {
		res_boolean = dep2.estaVacio();
		assertEquals(true, res_boolean);
	}

	
	//Prueba para saber si el depósito está lleno a la mitad de su capacidad.
	@Test
	public void testEstaLlenoMitad() {
		res_double = dep3.getDepositoNivel() * 2;
		assertEquals(dep3.getDepositoMax(), res_double, 0.1);
	}

}
