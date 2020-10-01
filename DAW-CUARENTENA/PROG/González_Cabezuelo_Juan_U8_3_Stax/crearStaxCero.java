import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class crearStaxCero {
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

        try {
            /*GENERAMOS EL ARCHIVO STAX PARA USARLO*/
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("stax.xml"));
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();
            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);

            /*CREAMOS AQUÍ LO QUE USAREMOS PARA MAQUETAR EL XML*/
            Characters inicio = eventFactory.createCharacters("\t");
            Characters medio = eventFactory.createCharacters("\n\t\t");
            Characters fin = eventFactory.createCharacters("\n");

            /*COMENZAMOS A INTRODUCIR EN EL XML CON UNA ORDENACIÓN CONCRETA*/
            StartElement ordenadoresStartElement = eventFactory.createStartElement("","","ordenadores");
            xmlWriter.add(ordenadoresStartElement);
            xmlWriter.add(medio);

            /*ESTE FOR INTRODUCIRÁ TODOS LOS DATOS CON SU MAQUETACIÓN CORRECTA*/
            for (ordenador o : ordenadores) {
                /*INICIAMOS Y CERRAMOS TODOS LOS ELEMENTOS*/
                StartElement ordenadorstart = eventFactory.createStartElement("","","ordenador");
                StartElement ramStart = eventFactory.createStartElement("","","ram");
                StartElement microStart = eventFactory.createStartElement("","","micro");
                StartElement graficaStart = eventFactory.createStartElement("","","grafica");

                Attribute mac = eventFactory.createAttribute("mac", Integer.toString(o.getMac()));

                EndElement ordenadorEnd = eventFactory.createEndElement("","","ordenador");
                EndElement ramEnd = eventFactory.createEndElement("","","ram");
                EndElement microEnd = eventFactory.createEndElement("","","micro");
                EndElement graficaEnd = eventFactory.createEndElement("","","grafica");

                /*AQUIRIMOS LOS DATOS CONCRETOS A INTRODUCIR*/
                Characters micro = eventFactory.createCharacters(o.getMicro());
                Characters grafica = eventFactory.createCharacters(o.getGrafica());
                Characters ram = eventFactory.createCharacters(Integer.toString(o.getRam()));

                /*COMIENZA LA MAQUETACIÓN*/
                xmlWriter.add(inicio);
                xmlWriter.add(ordenadorstart);
                xmlWriter.add(mac);
                xmlWriter.add(medio);

                xmlWriter.add(microStart);
                xmlWriter.add(micro);
                xmlWriter.add(microEnd);
                xmlWriter.add(medio);

                xmlWriter.add(graficaStart);
                xmlWriter.add(grafica);
                xmlWriter.add(graficaEnd);
                xmlWriter.add(medio);

                xmlWriter.add(ramStart);
                xmlWriter.add(ram);
                xmlWriter.add(ramEnd);
                xmlWriter.add(medio);
                
                xmlWriter.add(ordenadorEnd);
                xmlWriter.add(fin);
            }
            /*FINALIZAMOS CON EL CIERRE DEL NODO RAIZ*/
            EndElement ordenadoresEndElement = eventFactory.createEndElement("","","ordenadores");
            xmlWriter.add(ordenadoresEndElement);

            /*CERRAMOS EL DOCUMENTO Y ESTÁ LISTO PARA PODER VISUALIZAR EL RESULTADO*/
            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
