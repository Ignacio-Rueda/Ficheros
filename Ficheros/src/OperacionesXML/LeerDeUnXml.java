package OperacionesXML;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeerDeUnXml {
	
	
	
	public static void main(String args[]) {
		//Vamos a recorrer la estructura del xml y mostrar los valores.
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document documento = builder.parse("c:/"+File.separator+"ficheros"+File.separator+"ficherosXml"+File.separator+"recetas.xml");
			
			//NodeList listaCoches = documento.getElementsByTagName("coche");
			NodeList listaCoches = documento.getDocumentElement().getChildNodes();
			
			for(int i=0;i<listaCoches.getLength();i++) {
				Node nodo = listaCoches.item(i);//Cogemos el nodo
				//Hay muchos tipos de nodos, por eso tenemos que controlar que sea de tipo elemento
				if(nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element)nodo;
					NodeList hijos = e.getChildNodes();//Cogemos sus hijos
					for(int j=0;j<hijos.getLength();j++) {
						Node hijo = hijos.item(j);
						if(hijo.getNodeType() == Node.ELEMENT_NODE) {
							Element eHijo = (Element)hijo;
							System.out.println("Propiedad "+hijo.getNodeName().toUpperCase()+" valor "+hijo.getTextContent());
						}
					}
					System.out.println();
				}
			}
			
		}catch(ParserConfigurationException |SAXException |IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
