package mx.ipn.mx.listatareas.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TareaDTO {
    @JsonProperty("No_Tarea")
    private Integer No_Tarea;
    @JsonProperty("NombreTarea")
    private String NombreTarea;
    @JsonProperty("Descripcion")
    private String Descripcion;
    @JsonProperty("Materia")
    private String Materia;
    @JsonProperty("Completado")
    private Boolean Completado;

}
