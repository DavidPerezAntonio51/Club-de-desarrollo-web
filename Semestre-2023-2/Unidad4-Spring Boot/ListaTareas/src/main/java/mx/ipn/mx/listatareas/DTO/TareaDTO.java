package mx.ipn.mx.listatareas.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    @JsonIgnore
    public Integer getNo_Tarea() {
        return No_Tarea;
    }
    @JsonIgnore
    public void setNo_Tarea(Integer no_Tarea) {
        No_Tarea = no_Tarea;
    }
    @JsonIgnore
    public String getNombreTarea() {
        return NombreTarea;
    }
    @JsonIgnore
    public void setNombreTarea(String nombreTarea) {
        NombreTarea = nombreTarea;
    }
    @JsonIgnore
    public String getDescripcion() {
        return Descripcion;
    }
    @JsonIgnore
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    @JsonIgnore
    public String getMateria() {
        return Materia;
    }
    @JsonIgnore
    public void setMateria(String materia) {
        Materia = materia;
    }
    @JsonIgnore
    public Boolean getCompletado() {
        return Completado;
    }
    @JsonIgnore
    public void setCompletado(Boolean completado) {
        Completado = completado;
    }
}
