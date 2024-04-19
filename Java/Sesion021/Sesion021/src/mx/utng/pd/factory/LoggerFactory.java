package mx.utng.pd.factory;

import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {
    public boolean isFileLoggingEnabled() {

        Properties p = new Properties();

        try {
            p.load(ClassLoader.getSystemResourceAsStream("Logger.properties"));
            String fileloggingValue = p.getProperty("FileLogging");

            if(fileloggingValue.equalsIgnoreCase("ON")==true)
                return true;
            else{
                return false;
            }

        } catch (IOException e) {
            return false;
        }
    }

    public Logger getLogger(){
        if(isFileLoggingEnabled()){
            return new FileLogger();
        }else{
            return new ConsoleLogger();
        }
    }
}
