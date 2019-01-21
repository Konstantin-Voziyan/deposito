import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class TestConsumirParametrizada {
	private double maximo;
	private double nivel;
	private double consumo;
	private double res;
	
	public TestConsumirParametrizada (double maximo, double nivel, double consumo, double res) {
		this.maximo = maximo;
		this.nivel = nivel;
		this.consumo = consumo;
		this.res = res;
	}
	
	@Parameters
	public static Collection <Object[]> parametros(){
		return Arrays.asList(new Object[][]{
			{60,20,10,10},{60,40,-20,60},{60,60,60,0}
		});
	}
	
	/*Prueba parametrizada para comprobar que al consumir cantidades de combustible (grandes, pequeñas, negativas... ) 
	del depósito, el contenido restante es el esperado. Utiliza valores como parámetros de método.*/
	@Test
	public void testConsumir() {
		DepositoCombustible dep1 = new DepositoCombustible(maximo, nivel);
		dep1.consumir(consumo);
		assertEquals(res, dep1.getDepositoNivel(), 0.1);
	}
}
