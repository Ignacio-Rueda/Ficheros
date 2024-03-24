package OperacionesPoblacion.OperacionesListas;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
	
		return Integer.compare(p1.getEdadActual(), p2.getEdadActual());
	}

}
