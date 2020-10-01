import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {
    public static void main(String[] args) {
        try {
            /*OBTENEMOS EL DOCUMENTO Y PARSEAMOS EL XML PARA USARLO DESDE MEMORIA*/
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("ordenadores.xml"));
            Node root = doc.getDocumentElement();
            NodeList nl = doc.getElementsByTagName("ordenador");

            /*REALIZO UN FOR PARA AÑADIR LOS COMENTARIOS*/
            for (int i = 0; i < nl.getLength(); i++) {
                root.getParentNode();
                Element ordenador = (Element) doc.getElementsByTagName("ordenador").item(i);
                comentario = doc.createComment("COMENTARIO AÑADIDO DESDE DOM");
                root.insertBefore(comentario, ordenador);
            }

            /*GENERO LA ETIQUETA HIJA*/
            Element ordenador = doc.createElement("ordenador");
            ordenador.setAttribute("mac", "654788");
            Element ram = doc.createElement("ram");
            ram.setTextContent("16");
            Element micro = doc.createElement("micro");
            micro.setTextContent("i3 2500");
            Element grafica = doc.createElement("grafica");
            grafica.setTextContent("GTX 840M");

            ordenador.appendChild(mac);
            ordenador.appendChild(ram);
            ordenador.appendChild(micro);
            ordenador.appendChild(grafica);
            root.appendChild(ordenador);

            /*CREAMOS EL SEGUNDO NODO QUE SUSTITUYE AL PRIMERO*/
            Element ordenador2 = doc.createElement("ordenador");
            ordenador2.setAttribute("mac", "784697");
            Element ram2 = doc.createElement("ram");
            ram2.setTextContent("12");
            Element micro2 = doc.createElement("micro");
            micro2.setTextContent("Ryzen 7 2700x");
            Element grafica2 = doc.createElement("grafica");
            grafica2.setTextContent("GTX 980");

            ordenador.appendChild(mac);
            ordenador.appendChild(ram);
            ordenador.appendChild(micro);
            ordenador.appendChild(grafica);
            root.appendChild(ordenador);

            Element ordenadorPrimero = (Element) doc.getElementsByTagName("ordenador").item(0);
            root.replaceChild(ordenador2, ordenadorPrimero);

            /*CREAMOS EL TRANSFORMER*/
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/sxlt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            /*PARA FINALIZAR LO PASAMOS TODO EL NUEVO XML Y LO TRANSFORMAMOS*/
            DOMSource origenDOM = new DOMSource(root);
            File NewOrdenadores = new File("NewOrdenadores.xml");
            StreamResult destino = new StreamResult(NewOrdenadores);
            transformer.transform(origenDOM, destino);

        } catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
