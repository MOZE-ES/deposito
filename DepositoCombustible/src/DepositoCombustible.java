/**
 * DepositoCombustible es una clase que representa el dep�sito de gasolina de un coche
 * Un objeto DepositoCombustible agrupa la informaci�n necesaria para describir el estado del dep�sito:
 * <ul>
 *   <li> depMax   capacidad del dep�sito
 *   <li> depNivel	nivel de gasolina del dep�sito
 * </ul>
 * 
 * class invariante 		0.0 <= depNivel <= depMax
 * 
 * @author IES Seveero Ochoa Team
 * @version 1.0
 *
 */
public class DepositoCombustible {

    private double depMax;
    private double depNivel;

   /**
	* DepositoCombustible es el constructor de la clase. 
	* 
	* <hr>
	* <br> precondici�n  depMax > 0.0 and 0.0 <= depNivel <= getTankMax()  
	* <br> postcondici�n depMax > 0.0 and 0.0 <= depNivel <= getTankMax() 
	* <hr>
	* 
	* @param tankMax  es la cantidad de combustible (medida en litros) que cabe en el dep�sito
	* @param tankLevel es la cantidad de combustible (medida en litros) que contiene el dep�sito inicialmente
	* 
	*/ 
	DepositoCombustible(double tankMax, double tankLevel) {
       this.depMax   = tankMax;
       this.depNivel = tankLevel;
    }

   /**
    * getDepositoNivel es un m�todo para obtener informaci�n
    * 
    * @return	la cantidad de combustible en el dep�sito
    */
    public double getDepositoNivel(){
       return depNivel;
    }

   /**
    * getDepositoMax es un m�todo para obtener informaci�n
    * 
    * @return	la capacidad (en litros) del dep�sito
	*/
	public double getDepositoMax(){
       return depMax;
    }

   /**
	* estaVacio da informaci�n del estado 
	* 
	* @return 	<code>true</code> si el dep�sito est� vacio 
    *          <code>false</code> en otro caso.
	*/
    public boolean estaVacio(){
      return depNivel == 0;
    }

    /**
	 * estaLleno informaci�n del estado 
	 * 
	 * @return 	<code>true</code> si el dep�sito est� lleno 
     *          <code>false</code> en otro caso.
	 */
    public boolean estaLleno(){
	  return depNivel == depMax;
    }

   /**
	* llenar es un m�todo que efectúa cambios a�adiendo combustible al dep�sito
	* 
	* <hr>
	* <br> precondicion 	0.0 < amount <= getDepositoMax() - getDepositoNivel() 
	* <br> postcondicion 	no vacio
	* <br> postcondicion  	depNivel > depNivel_inicial 
	* <hr>
	* 
	* @param amount 	Cantidad de combustible que a�ade
	* 
	*/
    public void fill(double amount){
       depNivel = depNivel + amount;
    }

   /**
	* consumir es un m�todo que efectua cambios reduciendo el combustible del dep�sito
	* 
    * @param amount cantidad de fuel consumida
    * 
    */
	public void consumir(double amount){
       depNivel = depNivel - amount;
    }
}
