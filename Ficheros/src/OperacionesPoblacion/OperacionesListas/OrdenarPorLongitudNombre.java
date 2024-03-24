package OperacionesPoblacion.OperacionesListas;

import java.util.Comparator;

public class OrdenarPorLongitudNombre implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		return Integer.compare(p1.getNombre().length(),p2.getNombre().length());
	}

}
