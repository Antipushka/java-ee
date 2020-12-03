import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Names.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Names names = (Names) unmarshaller.unmarshal(new File("src/main/java/names.xml"));
        names.getData().forEach(System.out::println);

        names.getData().add(new Name("Added", "Added", "Added"));

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.marshal(names, new File("src/main/java/names.xml"));
    }
}
