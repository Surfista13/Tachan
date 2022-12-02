package fr.eni.tachan.dal;

import java.io.IOException;
import java.util.Properties;

public class Settings {
    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.loadFromXML(Settings.class.getResourceAsStream("connexion.xml"));
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static String getProperties(String key) {
        return properties.getProperty(key);
    }
}
