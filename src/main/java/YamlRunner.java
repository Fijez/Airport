import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public final class YamlRunner {

    public static Integer getYamlData(){
        Map<String, Integer> prop = null;
        try {
            InputStream in = new FileInputStream
                    ("src/main/resources/application.yaml");
            Yaml yaml = new Yaml();
            prop = yaml.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop != null ? prop.get("column") : 0;
    }
    }
