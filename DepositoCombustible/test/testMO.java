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
	 * - Obtener el nivel de dep�sito.
	 */
	public void testGetDepositoNivelMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		double depActual = mideposito.getDepositoNivel();
		assertEquals(depositoNivel, depActual,0);
		mideposito.getDepositoNivel();
		System.out.println("- Obtener el nivel de dep�sito");
		System.out.println("Nivel deposito: " + depositoNivel + " el nivel guardado: " + depActual);
		System.out.println("");
	}

	@Test
	/*
	 * - Obtener el valor m�ximo del dep�sito.
	 */
	public void testGetDepositoMaxMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		double depActualMax = mideposito.getDepositoMax();
		assertEquals(depositoMax, depActualMax,0);
		System.out.println("- Obtener el valor m�ximo del dep�sito.");
		System.out.println("Deposito m�ximo: " + depositoMax + " el nivel m�ximo guardado: " + depActualMax);
		System.out.println("");
	}

	@Test
	/*
	 * - Obtener si el dep�sito est� vacio.
	 */
	public void testEstaVacioMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		assertTrue(mideposito.estaVacio());
		System.out.println("- Obtener si el dep�sito est� vacio.");
		System.out.println("Esta vacio: " + mideposito.estaVacio());
		System.out.println("");
		}
		

	@Test
	/*
	 * - Obtener si el dep�sito est� lleno por la mitad.
	 */
	public void testEstaLlenoMitadMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		mideposito.getDepositoNivel();
		boolean Masmitad=mideposito.getDepositoNivel() >= mideposito.getDepositoMax()/2;
		assertTrue(Masmitad);
		System.out.println("- Obtener si el dep�sito est� lleno por la mitad.");
		System.out.println("El deposito est� a mitad de su capacidad, o m�s.");
		System.out.println("");
	}
	
	@Test
	/*
	 * - Obtener si el dep�sito est� lleno.
	 */
	public void testEstaLlenoMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		assertTrue(mideposito.estaLleno());
		System.out.println("- Obtener si el dep�sito est� lleno.");
		System.out.println("Esta Lleno: " + mideposito.estaLleno());
		System.out.println("");
	}

	@Test
	/*
	 * - Prueba llenar utilizando valores como par�metros de m�todo.
	 */
	public void testFillMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		double llenadoDeposito = 25;
		mideposito.fill(llenadoDeposito);
		System.out.println("- Prueba llenar utilizando valores como par�metros de m�todo.");
		System.out.println("Se ha llenado un total de: " + llenadoDeposito + " y ahora tiene " + mideposito.getDepositoNivel());
		System.out.println("");
	}

	@Test
	/*
	 * - Prueba consumir utilizando valores como par�metros de m�todo.
	 */
	public void testConsumirMO() {
		DepositoCombustible mideposito = new DepositoCombustible(depositoMax,depositoNivel);
		double consumoDeposito = 20;
		mideposito.consumir(consumoDeposito);
		System.out.println("- Prueba consumir utilizando valores como par�metros de m�todo.");
		System.out.println("Se ha consumido un total de: " + consumoDeposito + " y ahora tiene " + mideposito.getDepositoNivel());
		System.out.println("");
	}
}
