package com.qascriptcucmber.Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {


    public static Properties properties = new Properties();

    public static Properties loadApplicationProperties(){

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/test/resources/config/application.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static Properties loadFrameworkProperties(){

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/test/resources/config/framework.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static Properties loadUserProperties(){

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/test/resources/config/user.properties");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
    //Same above function we will create for freamework properties and user properties  files
}
