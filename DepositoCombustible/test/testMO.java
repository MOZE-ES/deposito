import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.After;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class testMO {
	private double depositoMax;
	private double depositoNivel;
	
	public testMO(double max, double niv)
	{
		this.depositoMax = max;
		this.depositoNivel = niv;
	}
	
	@Parameters
	public static Collection<Object[]> consumos(){
		return Arrays.asList( new Object[][] {{50,50},{120,30},{60,0}} );
	}
	
	@Test
	public void testDepositoCombustibleMO() {
		assertNotNull(depositoMax);
		assertNotNull(depositoNivel);
		
	}

	@Test
	/*
	 * - Obtener el nivel de depósito.
	 */
	public void testGetDepositoNivelMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		double depActual = mideposito.getDepositoNivel();
		assertEquals(depositoNivel, depActual,0);
		mideposito.getDepositoNivel();
		System.out.println("- Obtener el nivel de depósito");
		System.out.println("Nivel deposito: " + depositoNivel + " el nivel guardado: " + depActual);
		System.out.println("");
	}

	@Test
	/*
	 * - Obtener el valor máximo del depósito.
	 */
	public void testGetDepositoMaxMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		double depActualMax = mideposito.getDepositoMax();
		assertEquals(depositoMax, depActualMax,0);
		System.out.println("- Obtener el valor máximo del depósito.");
		System.out.println("Deposito máximo: " + depositoMax + " el nivel máximo guardado: " + depActualMax);
		System.out.println("");
	}

	@Test
	/*
	 * - Obtener si el depósito está vacio.
	 */
	public void testEstaVacioMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		assertTrue(mideposito.estaVacio());
		System.out.println("- Obtener si el depósito está vacio.");
		System.out.println("Esta vacio: " + mideposito.estaVacio());
		System.out.println("");
		}
		

	@Test
	/*
	 * - Obtener si el depósito está lleno por la mitad.
	 */
	public void testEstaLlenoMitadMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		mideposito.getDepositoNivel();
		boolean Masmitad=mideposito.getDepositoNivel() >= mideposito.getDepositoMax()/2;
		assertTrue(Masmitad);
		System.out.println("- Obtener si el depósito está lleno por la mitad.");
		System.out.println("El deposito está a mitad de su capacidad, o más.");
		System.out.println("");
	}
	
	@Test
	/*
	 * - Obtener si el depósito está lleno.
	 */
	public void testEstaLlenoMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		assertTrue(mideposito.estaLleno());
		System.out.println("- Obtener si el depósito está lleno.");
		System.out.println("Esta Lleno: " + mideposito.estaLleno());
		System.out.println("");
	}

	@Test
	/*
	 * - Prueba llenar utilizando valores como parámetros de método.
	 */
	public void testFillMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		double llenadoDeposito = 25;
		mideposito.fill(llenadoDeposito);
		System.out.println("- Prueba llenar utilizando valores como parámetros de método.");
		System.out.println("Se ha llenado un total de: " + llenadoDeposito + " y ahora tiene " + mideposito.getDepositoNivel());
		System.out.println("");
	}

	@Test
	/*
	 * - Prueba consumir utilizando valores como parámetros de método.
	 */
	public void testConsumirMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		double consumoDeposito = 20;
		mideposito.consumir(consumoDeposito);
		System.out.println("- Prueba consumir utilizando valores como parámetros de método.");
		System.out.println("Se ha consumido un total de: " + consumoDeposito + " y ahora tiene " + mideposito.getDepositoNivel());
		System.out.println("");
	}
}
