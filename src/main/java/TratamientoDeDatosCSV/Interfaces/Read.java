package TratamientoDeDatosCSV.Interfaces;

import java.util.List;
import java.util.Objects;

public interface Read {
    List<String> read();
    List<Object> readObjects();
}
