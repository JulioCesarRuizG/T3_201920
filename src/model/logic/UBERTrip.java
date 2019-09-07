package model.logic;


public class UBERTrip implements Comparable<UBERTrip>{

	private int inicioID;
	private int destinoID;
	private int hora;
	private double tiempoPromedioEnSegundos;
	private double desviacionEstandar;
	private double tiempoPromedioGEnSegundos;
	private double desviacionEstandarG;

	public UBERTrip(int pInicioID, int pDestinoID, int pHora, double pTiempoPromedioEnSegundos, double pDesviacionEstandar, double pTiempoPromedioGEnSegundos, double pDesviacionEstandarG)
	{
		inicioID = pInicioID;
		destinoID = pDestinoID;
		hora = pHora;
		tiempoPromedioEnSegundos = pTiempoPromedioEnSegundos;
		desviacionEstandar = pDesviacionEstandar;
		tiempoPromedioGEnSegundos = pTiempoPromedioGEnSegundos;
		desviacionEstandarG = pDesviacionEstandarG;
	}
	public int darInicioID()
	{
		return inicioID;
	}
	public int darDestinoID()
	{
		return destinoID;
	}
	public int darHora()
	{
		return hora;
	}
	public double darTiempoPromedioEnSegundos()
	{
		return tiempoPromedioEnSegundos;
	}
	public double darDesviacionEstandar()
	{
		return desviacionEstandar;
	}
	public double darTiempoPromedioGEnSegundos()
	{
		return tiempoPromedioGEnSegundos;
	}
	public double darDesviacionEstandarG()
	{
		return desviacionEstandarG;
	}
	@Override
	public int compareTo(UBERTrip viaje) {
		if(this.tiempoPromedioEnSegundos > viaje.tiempoPromedioEnSegundos)
		{
			return 1;
		}
		else if(this.tiempoPromedioEnSegundos < viaje.tiempoPromedioEnSegundos)
		{
			return -1;
		}
		else
		{
			if(this.desviacionEstandar > viaje.desviacionEstandar)
			{
				return 1;
			}
			else if(this.desviacionEstandar < viaje.desviacionEstandar)
			{
				return -1;
			}
			else return 0;
		}
	}

}
