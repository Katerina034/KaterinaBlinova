package PO61.Blinova.wdad.learn.rmi;

import PO61.Blinova.wdad.data.managers.PreferencesManager;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Server {
    static PreferencesManager pref;
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        pref = PreferencesManager.getInstance();
    }
}
