import java.time.LocalTime;
import lombok.Data;
import lombok.Builder;
import lombok.ToString;


@Data
@Builder
@ToString(exclude = "empresa")
public class Sucursal {
    private Long id;
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private boolean es_casa_matriz;

    private Empresa empresa;
    private Domicilio domicilio;
}
