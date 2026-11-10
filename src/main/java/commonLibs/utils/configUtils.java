package commonLibs.utils;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class configUtils
{
    public static Properties readProperties(String filename) throws Exception
    {
        filename=filename.trim();
        InputStream is=new FileInputStream(filename);
        Properties property = new Properties();
        property.load(is);
        return property;
    }
}
