package {{package_name}}.support.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetVariable {

    private static final String DATA_CONFIG = "src/test/resources/";
    private static Properties properties;

    public static String getProp(String value) {
        try {
            if (properties == null) {
                GetVariable.properties = new Properties();
                GetVariable.properties.load(new FileInputStream(DATA_CONFIG + getEnvironment() +".properties"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return GetVariable.properties.getProperty(value);
    }

    public static String getEnvironment() {
        String environments = System.getProperty("environment");
        if (environments == null) {
            environments = "homolog";
        }
        return environments;
    }
}
