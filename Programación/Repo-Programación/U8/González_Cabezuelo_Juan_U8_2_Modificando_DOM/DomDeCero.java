import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.*;

public class DomDeCero {
    public static void main(String[] args) {
        /*AQUÍ TENDREMOS LA LISTA DE TODOS LOS ORDENADORES*/
        ArrayList<ordenador> ordenadores = new ArrayList<>();

        /*INTRODUZCO LOS OBJETOS Y LOS AÑADO A LA LISTA*/
        ordenadores.add(new ordenador(154308, 16, "i7 8700k", "GTX 1060 6gb"));
        ordenadores.add(new ordenador(658497, 32, "i9 9900", "RTX 2080Ti"));
        ordenadores.add(new ordenador(326578, 12, "Ryzen 7 20700x", "GTX 1080"));
        ordenadores.add(new ordenador(154686, 8, "Ryzen 5 2600x", "GTX 1660"));
        ordenadores.add(new ordenador(698431, 4, "i3 3200", "GTX 1050"));
        ordenadores.add(new ordenador(986543, 16, "i7 7500", "GTX 1070"));
        ordenadores.add(new ordenador(476138, 8, "i5 4900", "GTX 1060"));
        ordenadores.add(new ordenador(137694, 8, "i7 8700k", "GTX 1080Ti"));
        ordenadores.add(new ordenador(963846, 12, "Ryzen 7 3900x", "GTX 1070"));
        ordenadores.add(new ordenador(786431, 32, "Treadripper 1920X", "RTX 2070"));

        /*INICIO DEL TRYCATCH*/
        try {
            /*GENERAMOS EL NUEVO DOCUMENTO, CREANDO EL ELEMENTO RAIZ Y AÑADIÉNDOLO*/
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element root = doc.createElement("ordenadores");
            doc.appendChild(root);

            /*RECORRO LA LISTA DE ORDENADORES*/
            for (ordenador o : ordenadores) {
                Element ordenador = doc.createElement("ordenador");
                ordenador.setAttribute("mac", Integer.toString(o.getMac()));

                Element ram = doc.createElement("ram");
                ram.setTextContent(Integer.toString(o.getRam()));

                Element micro = doc.createElement("micro");
                micro.setTextContent(o.getMicro());

                Element grafica = doc.createElement("grafica");
                grafica.setTextContent(o.getGrafica());

                ordenador.appendChild(mac);
                ordenador.appendChild(ram);
                ordenador.appendChild(micro);
                ordenador.appendChild(grafica);
                root.appendChild(ordenador);
            }
            /*PASO EL ARBOL A MI FICHERO Y CREO EL TRANSFORMER*/
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/sxlt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            /*POR ULTIMO GENERAMOS EL ARCHIVO DE DESTINO Y REALIZAMOS EL PASO*/
            DOMSource origenDOM = new DOMSource(root);
            File NewOrdenadores = new File("cero.xml");
            StreamResult destino = new StreamResult(NewOrdenadores);
            transformer.transform(origenDOM, destino);

        } catch (ParserConfigurationException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
