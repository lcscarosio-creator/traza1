import lombok.Data;
import lombok.Builder;
import lombok.ToString;

@Data
@Builder
@ToString(exclude="localidad")
public class Domicilio {
    private Long id;
    private String calle;
    private Integer numero;
    private Integer cp;

    private Localidad localidad;
}
