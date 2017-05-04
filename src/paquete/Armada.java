package paquete;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import paquete.Soldado.Tipo;

public class Armada {

	private List<Soldado> soldados;
	
	public Armada() {
		soldados = new LinkedList<Soldado>();
	}
	
	public void agregar(Soldado sol) {
		soldados.add(sol);
	}
	
	@SuppressWarnings("unchecked")
	public List<Soldado> formacionUno() {
		Collections.sort(this.soldados, new RangoComparator());
		return this.soldados;
	}
	
	@SuppressWarnings("unchecked")
	public List<Soldado> formacionDos() {
		Collections.sort(this.soldados, new VelocidadComparator());
		return this.soldados;
	}

	@SuppressWarnings("unchecked")
	public List<Soldado> formacionTres() {
		Collections.sort(this.soldados, new TipoComparator());
		return this.soldados;
	}
	
	public Map<Tipo, List<Soldado>> agrupar() {
		
		Map<Tipo, List<Soldado>> mapa = new HashMap<Tipo, List<Soldado>>();
		
		List<Soldado> listaHoplitas = new LinkedList<Soldado>();
		List<Soldado> listaHondero = new LinkedList<Soldado>();
		List<Soldado> listaLanzajabalinas = new LinkedList<Soldado>();
		List<Soldado> listaCaballero = new LinkedList<Soldado>();
		List<Soldado> listaArquero = new LinkedList<Soldado>();
		
		for(int i = 0 ; i < soldados.size() ; i++) {
			switch(this.soldados.get(i).getTipo()) {
			case HOPLITA: listaHoplitas.add(this.soldados.get(i));break;
			case HONDERO: listaHondero.add(this.soldados.get(i));break;
			case LANZAJABALINAS: listaLanzajabalinas.add(this.soldados.get(i));break;
			case CABALLERO: listaCaballero.add(this.soldados.get(i));break;
			case ARQUERO: listaArquero.add(this.soldados.get(i));break;
			}
		}
		
		mapa.put(Tipo.HOPLITA, listaHoplitas);
		mapa.put(Tipo.HONDERO, listaHondero);
		mapa.put(Tipo.LANZAJABALINAS, listaLanzajabalinas);
		mapa.put(Tipo.CABALLERO, listaCaballero);
		mapa.put(Tipo.ARQUERO, listaArquero);
		
		return mapa;
		
	}
	
	public Set<Soldado> representantes() {
		Set<Soldado> representantes = new HashSet<Soldado>();
		for(int i = 0 ; i < this.soldados.size() ; i++) {
			representantes.add(this.soldados.get(i));
		}
		return representantes;
	}

	public void mostrar() {
		for(int i = 0 ; i < this.soldados.size() ; i++) {
			System.out.println("Soldado "+(i+1)+"\nTipo: "+this.soldados.get(i).getTipo());
			System.out.println("Region: "+this.soldados.get(i).getRegion()+"\nRango: "+this.soldados.get(i).getRango());
			System.out.println("Velocidad: "+this.soldados.get(i).getVelocidad()+"\n");
		}
	}
}
