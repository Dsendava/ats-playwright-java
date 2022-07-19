package com.endava.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public interface SetUpProperties {

    Properties File = new Properties();

    static void ReadProperties() {
        try (InputStream propierties = new FileInputStream("src/test/resources/automationpractice.properties")) {
            File.load(propierties);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static Boolean GetBoolean(String Property) {
        return java.lang.Boolean.valueOf(File.getProperty(Property));
    }

    static Integer GetInt(String Property) {
        return java.lang.Integer.valueOf(File.getProperty(Property));
    }

    static Double GetDouble(String Property) {
        return java.lang.Double.valueOf(File.getProperty(Property));
    }
}
