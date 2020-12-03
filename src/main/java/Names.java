import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "names", namespace = "names")
public class Names {

    private List<Name> data;

    @XmlElement(name = "name", namespace = "names")
    public List<Name> getData() {
        return data;
    }

    public void setData(List<Name> data) {
        this.data = data;
    }
}
