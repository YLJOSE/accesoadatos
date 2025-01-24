package Simulacro.reto1;

import java.io.Serializable;
import java.util.List;

public class BDCredenciales implements Serializable {
    private List<String> props;

    public BDCredenciales(List<String> props) {
        this.props = props;
    }

    public List<String> getProps() {
        return props;
    }

    @Override
    public String toString() {
        return "BDCredenciales{" +
                "props=" + props +
                '}';
    }
}
