package PO61.Blinova.wdad.learn.xml;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String mail;
    private String rights;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\n');
        stringBuilder.append("\tname - ").append(name).append('\n');
        stringBuilder.append("\tmail - ").append(mail).append('\n');
        stringBuilder.append("\trights - ").append(rights).append('\n');
        return stringBuilder.toString();
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getRights() {
        return rights;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }
}
