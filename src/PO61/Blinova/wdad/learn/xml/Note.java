package PO61.Blinova.wdad.learn.xml;

import java.io.Serializable;

public class Note implements Serializable {
    private  String title;
    private  String text;
    private User owner;
    private String cdate;

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public User getOwner() {
        return owner;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
