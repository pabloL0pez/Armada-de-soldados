package paquete;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class RangoComparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		return ((Soldado) o1).getRango() - ((Soldado) o2).getRango();
	}
	
}
