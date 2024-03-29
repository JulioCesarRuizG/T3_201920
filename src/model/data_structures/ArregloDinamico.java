package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico<T extends Comparable <T>> implements IArregloDinamico<T> {
	/**
	 * Capacidad maxima del arreglo
	 */
	private int tamanoMax;
	/**
	 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
	 */
	private int tamanoAct;
	/**
	 * Arreglo de elementos de tamaNo maximo
	 */
	private T[] elementos;

	/**
	 * Construir un arreglo con la capacidad maxima inicial.
	 * @param max Capacidad maxima inicial
	 */
	public ArregloDinamico( int max )
	{
		elementos = (T[]) new Comparable[max];
		tamanoMax = max;
		tamanoAct = 0;
	}

	public void agregar( T dato )
	{
		if ( tamanoAct == tamanoMax )
		{  // caso de arreglo lleno (aumentar tamaNo)
			tamanoMax = 2 * tamanoMax;
			T[ ] copia = elementos;
			elementos = (T[]) new Comparable[tamanoMax];
			for ( int i = 0; i < tamanoAct; i++)
			{
				elementos[i] = copia[i];
			} 
			System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
		}	
		elementos[tamanoAct] = dato;
		tamanoAct++;
	}

	public int darCapacidad() {
		return tamanoMax;
	}

	public int darTamano() {
		return tamanoAct;
	}

	public T darElemento(int i) {
		return elementos[i];
	}

	public T[] darElementos()
	{
		return elementos;
	}
	public void sobreEscribir(T dato, int i)
	{
		elementos[i] = dato;
	}
	public T buscar(T dato) {
		for(int i=0 ; i<elementos.length ; i++)
		{
			if(elementos[i].compareTo(dato) == 0)
			{
				return elementos[i];
			}
		}
		return null;
	}

	public T eliminar(T dato) {
		for(int i=0 ; i<elementos.length ; i++)
		{
			if(elementos[i].compareTo(dato) == 0)
			{
				int mayor = 0;
				T eliminar = elementos[i];
				for(int j=i ; j<elementos.length-1 ; j++)
				{
					elementos[j] = elementos[j+1]; 
					mayor = j+1;
				}
				elementos[mayor] = null;
				tamanoAct--;
				return eliminar;
			}
		}
		return null;
	}
	
}
