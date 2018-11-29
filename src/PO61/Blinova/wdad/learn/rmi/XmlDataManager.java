package PO61.Blinova.wdad.learn.rmi;

import PO61.Blinova.wdad.learn.xml.Note;
import PO61.Blinova.wdad.learn.xml.User;

import java.io.IOException;
import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;

public interface XmlDataManager extends Remote
{
    public Note getNote(User owner, String title);
    public void updateNote(User owner, String title, StringBuilder newText) throws IOException;
    public void setPrivileges(String noteTitle, User user, int newRights) throws IOException;
    public List<Note> getNotes(User owner);
}