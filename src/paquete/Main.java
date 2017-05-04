package paquete;

import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import paquete.Soldado.Region;
import paquete.Soldado.Tipo;

public class Main {

	public static void mostrarLista(Tipo tipo, List<Soldado> lista) {
		System.out.println("Tipo: " + tipo + "\n");
		for(int i = 0 ; i < lista.size() ; i++) {
			lista.get(i).mostrar();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Armada armada = new Armada();
		Set<Soldado> representantes = new HashSet<Soldado>();
		Map<Tipo, List<Soldado>> mapa = new HashMap<Tipo, List<Soldado>>();
		
		Soldado soldado1 = new Soldado(Tipo.ARQUERO,Region.ARGOS,8,12.3);
		Soldado soldado2 = new Soldado(Tipo.CABALLERO,Region.CORINTO,4,14.3);
		Soldado soldado3 = new Soldado(Tipo.HONDERO,Region.DELFOS,12,10.1);
		Soldado soldado4 = new Soldado(Tipo.HONDERO,Region.DELFOS,13,15.7);
		Soldado soldado5 = new Soldado(Tipo.HONDERO,Region.ARGOS,5,10.1);
		Soldado soldado6 = new Soldado(Tipo.LANZAJABALINAS,Region.TEBAS,2,16.3);
		Soldado soldado7 = new Soldado(Tipo.ARQUERO,Region.ESPARTA,9,13.3);
		Soldado soldado8 = new Soldado(Tipo.HOPLITA,Region.DELFOS,15,10.9);
		Soldado soldado9 = new Soldado(Tipo.CABALLERO,Region.CORINTO,1,18.7);
		Soldado soldado10 = new Soldado(Tipo.HOPLITA,Region.ESPARTA,11,13.1);
	
		armada.agregar(soldado1);
		armada.agregar(soldado2);
		armada.agregar(soldado3);
		armada.agregar(soldado4);
		armada.agregar(soldado5);
		armada.agregar(soldado6);
		armada.agregar(soldado7);
		armada.agregar(soldado8);
		armada.agregar(soldado9);
		armada.agregar(soldado10);
		
		mapa = armada.agrupar();
		mapa.forEach((key, value) -> mostrarLista(key,value));
			
		}
		
		/*
		representantes = armada.representantes();
		System.out.println("REPRESENTANTES: \n");
		for(Soldado sol : representantes) {
			sol.mostrar();
			System.out.println();
		}
		*/
		
	
}
