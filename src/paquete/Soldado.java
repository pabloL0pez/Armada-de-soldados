package paquete;

public class Soldado {

	public enum Tipo {
		HOPLITA, HONDERO, LANZAJABALINAS, CABALLERO, ARQUERO;
	}
	
	public enum Region {
		CORINTO, TEBAS, ESPARTA, DELFOS, ARGOS;
	}

	private Tipo tipo;
	private Region region;
	private int rango;
	private double velocidad;

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public Soldado(Tipo tipo, Region region, int rango, double velocidad) {
		this.tipo = tipo;
		this.region = region;
		this.rango = rango;
		this.velocidad = velocidad;
	}

	@Override
	protected Soldado clone() throws CloneNotSupportedException {
		return new Soldado(this.tipo, this.region, this.rango, this.velocidad);
	}
	
	public void mostrar() {
		System.out.println("Tipo: "+this.tipo+"\nRegion: "+this.region+"\nRango: "+this.rango+"\nVelocidad: "+this.velocidad);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.region.ordinal();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soldado other = (Soldado) obj;
		if (region != other.region)
			return false;
		return true;
	}
}
