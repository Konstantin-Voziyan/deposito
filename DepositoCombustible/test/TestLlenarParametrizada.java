import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class TestLlenarParametrizada {
	private double maximo;
	private double nivel;
	private double llenar;
	private double res;
	
	public TestLlenarParametrizada (double maximo, double nivel, double llenar, double res) {
		this.maximo = maximo;
		this.nivel = nivel;
		this.llenar = llenar;
		this.res = res;
	}
	
	@Parameters
	public static Collection <Object[]> parametros(){
		return Arrays.asList(new Object[][]{
			{60,20,10,30},{60,40,-20,20},{60,50,0,50}
		});
	}
	
	/*Similar al anterior test, comprueba que al utilizar el método de llenar se obtienen resultados correctos. Utiliza valores como parámetros de método.*/
	@Test
	public void testLlenar() {
		DepositoCombustible dep1 = new DepositoCombustible(maximo, nivel);
		dep1.fill(llenar);
		assertEquals(res, dep1.getDepositoNivel(), 0.1);
	}
}