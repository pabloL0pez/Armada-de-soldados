package paquete;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class VelocidadComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return (int) (((Soldado) o1).getVelocidad() - ((Soldado) o2).getVelocidad());
	}
	
}
