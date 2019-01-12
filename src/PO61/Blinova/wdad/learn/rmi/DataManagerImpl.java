package PO61.Blinova.wdad.learn.rmi;

import PO61.Blinova.wdad.data.managers.DataManager;
import PO61.Blinova.wdad.learn.xml.Note;
import PO61.Blinova.wdad.learn.xml.User;
import PO61.Blinova.wdad.learn.xml.XmlTask;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

public class DataManagerImpl implements DataManager {
    XmlTask xmlTask;
    public DataManagerImpl() throws ParserConfigurationException, SAXException, IOException {
        xmlTask = new XmlTask();
    }
    @Override
    public Note getNote(User owner, String title) throws RemoteException {
        return xmlTask.getNote(owner, title);
    }

    @Override
    public void updateNote(User owner, String title, String newText) throws IOException, RemoteException, ClassNotFoundException, SQLException, ParserConfigurationException, SAXException {
        xmlTask.updateNote(owner, title, newText);
    }

    @Override
    public void setPrivileges(String noteTitle, User user, int newRights) throws IOException, RemoteException {
        xmlTask.setPrivileges(noteTitle, user, newRights);

    }

    @Override
    public List<Note> getNotes(User owner) throws RemoteException{

        return xmlTask.getNotes(owner);
    }
}
