import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class YamlRunner {

    public static int getYamlData(){
        Map<String, Integer> prop = null;
        try {
            InputStream in = new FileInputStream
                    ("src/main/resources/application.yaml");
            Yaml yaml = new Yaml();
            prop = yaml.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return prop.get("column");
    }
    }
