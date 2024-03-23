package OperacionesXML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class EscribirEnUnXml {

	public static void main(String[] args) {
		//Creamos un fichero xml con Java.
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();
			
			
			Document documento = implementation.createDocument(null, "concesionario", null);//namespace,elemento raíz,doctype
			documento.setXmlVersion("1.0");
			
			Element coches = documento.createElement("coches");//Creamos una etiqueta xml
			//Creamos el Primer coche
			Element coche = documento.createElement("coche");
			
			Element matricula = documento.createElement("matricula");
			Text textoMatricula = documento.createTextNode("1234AAAA");
			matricula.appendChild(textoMatricula);
			coche.appendChild(matricula);
			
			
			Element marca = documento.createElement("marca");
			Text textMarca = documento.createTextNode("RENAULT");
			marca.appendChild(textMarca);
			coche.appendChild(marca);
			
			Element precio = documento.createElement("precio");
			Text textPrecio = documento.createTextNode("17400");
			precio.appendChild(textPrecio);
			coche.appendChild(precio);
			
			coches.appendChild(coche);//Añadimos el coche a coches.
			
			//Creamos el Segundo coche
			Element coche2 = documento.createElement("coche");
			
			Element matricula2 = documento.createElement("matricula");
			Text texMatricula2 = documento.createTextNode("1234BBBB");
			matricula2.appendChild(texMatricula2);
			coche2.appendChild(matricula2);
			
			Element marca2 = documento.createElement("marca");
			Text textMarca2 = documento.createTextNode("HONDA");
			marca2.appendChild(textMarca2);
			coche2.appendChild(marca2);
			
			Element precio2 = documento.createElement("precio");
			Text textPrecio2 = documento.createTextNode("25000");
			precio2.appendChild(textPrecio2);
			coche2.appendChild(precio2);
			
			coches.appendChild(coche2);
			
			
			//Creamos el Tercer coche
			Element coche3 = documento.createElement("coche");
			
			Element matricula3 = documento.createElement("matricula");
			Text textMatricula3 = documento.createTextNode("1234CCCC");
			matricula3.appendChild(textMatricula3);
			coche3.appendChild(matricula3);
			
			Element marca3 = documento.createElement("marca");
			Text textMarca3 = documento.createTextNode("SEAT");
			marca3.appendChild(textMarca3);
			coche3.appendChild(marca3);
			
			Element precio3 = documento.createElement("precio");
			Text textPrecio3 = documento.createTextNode("25000");
			precio3.appendChild(textPrecio3);
			coche3.appendChild(precio3);
			
			coches.appendChild(coche3);
			
			
			
			documento.getDocumentElement().appendChild(coches);//Ya lo tenemos metido todo en xml.
			
			Source source = new DOMSource(documento);
			Result result = new StreamResult(new File("c:/"+File.separator+"ficheros"+File.separator+"ficherosXml"+File.separator+"concesionario.xml"));
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);
		
			
		}catch(ParserConfigurationException |TransformerException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
