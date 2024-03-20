package ProcesarXml;
import java.io.File;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ProcesarXml {

   public static void main(String[] args) {

      try {
    	 File file = new File("c:/ficheros/input.xml");
    	 System.out.println(file.exists());
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    
      
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}