package helpers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader
{
    private Properties properties;
    private String propertyFilePath;

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            propertyFilePath = System.getProperty("env");
            if (propertyFilePath == null) propertyFilePath = "src/main/resources/qa.properties";
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(".properties not found at " + propertyFilePath);
        }
    }

    private String getProp(String keyword) {
        String value = properties.getProperty(keyword);
        if(value != null) return value;
        else throw new RuntimeException(keyword + " not specified in the .properties file.");
    }

    public String getChromeDriverPath(){
        return getProp("chromePath");
    }

    public String getApplicationUrl() {
        return getProp("url");
    }

    public String getRegisterEmail(){
        return getProp("registerEmail");
    }

    public String getRegisterPassword(){
        return getProp("registerPassword");
    }

    public String getRegisterFirstName(){
        return getProp("registerFirstName");
    }

    public String getRegisterLastName(){
        return getProp("registerLastName");
    }

    public String getRegisterIsAccredited(){
        return getProp("registerIsAccredited");
    }
}
