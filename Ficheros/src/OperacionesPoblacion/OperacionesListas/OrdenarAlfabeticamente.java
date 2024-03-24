package OperacionesPoblacion.OperacionesListas;

import java.util.Comparator;

public class OrdenarAlfabeticamente implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {

		return p1.getNombre().compareTo(p2.getNombre());
	}
	

}
