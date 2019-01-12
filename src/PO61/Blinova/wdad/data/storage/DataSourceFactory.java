package PO61.Blinova.wdad.data.storage;



import PO61.Blinova.wdad.data.managers.PreferencesManager;

import PO61.Blinova.wdad.utils.PreferencesManagerConstsnts;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

import org.xml.sax.SAXException;



import javax.sql.DataSource;

import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.util.Properties;





public class DataSourceFactory

{

    static private PreferencesManager preferencesManager;



    static private String className;

    static private String driverType;

    static private String hostName;

    static private int port;

    static private String DBName;

    static private String user;

    static private String pass;





    public static DataSource createDataSource() throws ClassNotFoundException, SQLException, IOException, SAXException, ParserConfigurationException {

        preferencesManager = PreferencesManager.getInstance();

        className = preferencesManager.getProperty(PreferencesManagerConstsnts.CLASS_NAME);

        driverType = preferencesManager.getProperty(PreferencesManagerConstsnts.DRIVER_TYPE);

        hostName = preferencesManager.getProperty(PreferencesManagerConstsnts.HOST_NAME);

        port = Integer.parseInt(preferencesManager.getProperty(PreferencesManagerConstsnts.PORT));

        DBName = preferencesManager.getProperty(PreferencesManagerConstsnts.DB_NAME);

        user = preferencesManager.getProperty(PreferencesManagerConstsnts.USER);

        pass = preferencesManager.getProperty(PreferencesManagerConstsnts.PASS);


        DataSource dataSource = null;



        MysqlDataSource ds = new MysqlDataSource();



        ds.setPassword(pass);

        ds.setUser(user);

        ds.setServerName(hostName);

        ds.setDatabaseName(DBName);

        ds.setPort(port);

        ds.setServerTimezone("UTC");

        return ds;

    }

    public static DataSource createDataSource(String className, String

            driverType, String hostName, int port, String DBName, String user, String pass)

    {


        MysqlDataSource ds = new MysqlDataSource();



        ds.setPassword(pass);

        ds.setUser(user);

        ds.setServerName(hostName);

        ds.setDatabaseName(DBName);

        ds.setPort(port);

        return ds;

    }

}