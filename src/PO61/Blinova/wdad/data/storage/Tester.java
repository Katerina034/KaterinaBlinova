package PO61.Blinova.wdad.data.storage;

import PO61.Blinova.wdad.data.managers.JDBCDataManager;
import PO61.Blinova.wdad.learn.xml.Note;
import PO61.Blinova.wdad.learn.xml.User;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLException;

public class Tester {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, ParserConfigurationException, SAXException, IOException {
        testDataSource();
    }

    private static void testDataSource() throws ClassNotFoundException, SQLException, ParserConfigurationException, SAXException, IOException {

        JDBCDataManager jdbcDataManager = new JDBCDataManager();

        User user = new User();

        user.setName("user1");

        Note note = jdbcDataManager.getNote(user,"zagolovok1");

        System.out.println(note.toString());


        User owner = new User();
        owner.setName("user2");

        //jdbcDataManager.updateNote(owner,"zagolovok2","Katya_V_Shoke");


        //System.out.println(note.toString());
        User owner2 = new User();
        owner2.setName("user2");
        jdbcDataManager.setPrivileges("zagolovok1",owner2,3);

    }
}
