package MyProjects.Map.Properties;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String args[]) throws IOException {
        Properties p = new Properties();
        //System.out.println(System.getProperty("user.dir")); //Path for .properties file should be
        FileInputStream fis = new FileInputStream("test.properties");
        p.load(fis);
        System.out.println(p);
        String s = p.getProperty("Name");
        System.out.println(s);
        p.setProperty("Ashu", "8888");
        FileOutputStream fos = new FileOutputStream("test.properties");
        p.store(fos, "Updated by Ashu");

    }
}
