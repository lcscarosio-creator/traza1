import lombok.Data;
import lombok.Builder;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@ToString(exclude="pais")
public class Provincia {
    private Long id;
    private String nombre;
    private Set<Localidad> localidades = new HashSet<>();

    private Pais pais;
}
