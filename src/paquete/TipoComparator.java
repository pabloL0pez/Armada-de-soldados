package paquete;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class TipoComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(((Soldado) o1).getTipo().ordinal() == ((Soldado) o2).getTipo().ordinal()) {
			return ((Soldado) o2).getRango() - ((Soldado) o1).getRango();
		}
		return ((Soldado) o1).getTipo().ordinal() - ((Soldado) o2).getTipo().ordinal();
	}
	
}
