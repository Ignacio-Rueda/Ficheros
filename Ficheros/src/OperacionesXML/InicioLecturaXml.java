package OperacionesXML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class InicioLecturaXml {

	public static void main(String[] args) {
		/**
		 * Para cargar un documento XML tenemos que hacer uso de un procesador de
		 * documentos XML (conocidos generalmente como parsers) y de un constructor de
		 * documentos DOM
		 * 
		 * DOM (Document Object Model - Modelo de Objetos para Documento) Permite
		 * transformar un documento XML en un modelo de objetos, accesible c�modamente
		 * desde el lenguaje de programaci�n. DOM almacena cada
		 * elemento,atributo,texto,comentario,etc del documento XML en una estructura
		 * tipo �rbol compuesta por nodos f�cilmente accesibles,sin perder la jerarqu�a
		 * del documento.
		 */
		File fichero = new File("c:/ficheros/NUEVO_FICHERO.xml");
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document documento = db.parse(fichero);
			documento.getDocumentElement();

			// Obtener el nodo raiz
			Element raiz = documento.getDocumentElement();
			System.out.println("Elemento RAIZ: " + raiz.getNodeName());

			System.out.println("............................");
			// Buscar un elemento en toda la jerarqu�a del documento
			/**
			 * Para realizar esta operaci�n se puede usar el m�todo "getElementByTagName()"
			 * Disponible en la clase Document como en la clase Element. Dicha operaci�n
			 * busca un elemento por el nombre de la etiqueta y retrona una lista de nodos
			 * (NodeList) que cumplen con la condici�n.Si se usa la clase Element, solo
			 * buscar� entre las subetiquetas (subelementos) y no en todo el documento.
			 */
			// Obtener todos los estudiantes
			NodeList listaNodos = documento.getElementsByTagName("student");
			// Longitud de la lista
			System.out.println(listaNodos.getLength());
			// El m�todo item(), permite acceder a cada uno de los elementos encontrados.
			/**
			 * Es necesario hacer una coversi�n de tipos despu�s de invocar al m�todo
			 * item(), porque la clase NodeList, almacena un listado de nodos (Node),sin
			 * diferenciar el tipo.
			 */

			// Obtener la lista de hijos de un elemento y procesarla.
			NodeList listaNodos_2 = documento.getDocumentElement().getChildNodes();

			for (int i = 0; i < listaNodos_2.getLength(); i++) {
				Node nodo = listaNodos_2.item(i);
				switch (nodo.getNodeType()) {
				case Node.ELEMENT_NODE:
					Element elemento = (Element) nodo;
					System.out.println("Etiqueta:" + elemento.getTagName());
					System.out.println(elemento.getAttribute("id"));
					System.out.println(elemento.getElementsByTagName("Name").item(0).getTextContent());
					System.out.println(elemento.getElementsByTagName("id").item(0).getTextContent());
					System.out.println(elemento.getElementsByTagName("location").item(0).getTextContent());
					break;
				case Node.TEXT_NODE:
					Text texto = (Text) nodo;
					System.out.println("Texto:" + texto.getWholeText());
					break;
				}//Final switch
			}//Final for
			
			//A�adir un nuevo elemento hijo a otro elemento
			Element nuevoElemento = documento.createElement("student");
			
			documento.getDocumentElement().appendChild(nuevoElemento);

		} catch (Exception ex) {
			System.out.println("Error! No se ha podido cargar el documento XML");
		}
	}

}
