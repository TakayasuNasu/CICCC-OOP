package minProject2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.representer.Representer;

public class YmlStream {

  private Yaml yaml;
  private Path input;

  public YmlStream() {
    Constructor c = new Constructor(ContactList.class);
    TypeDescription td = new TypeDescription(ContactList.class);
    td.putListPropertyType("list", Contact.class);
    c.addTypeDescription(td);
    DumperOptions options = new DumperOptions();
    options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
    this.yaml = new Yaml(c, new Representer(), options);
    this.input = Paths.get(
        "src/minProject2/contact.yml");
  }

  ArrayList<Contact> read() {
    try (InputStream in = Files.newInputStream(this.input)) {
      ContactList cl = (ContactList) this.yaml.load(in);
      return cl.getList();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new ArrayList<>();
  }

  public void write(ContactList cl) {
    try {
      Files.writeString(this.input, this.yaml.dump(cl));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
