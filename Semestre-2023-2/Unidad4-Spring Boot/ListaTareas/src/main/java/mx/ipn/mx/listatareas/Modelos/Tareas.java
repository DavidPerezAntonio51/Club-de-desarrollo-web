package mx.ipn.mx.listatareas.Modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Tareas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no_Tarea;
    private String nombre_Tarea;
    private String descripcion;
    private String materia;
    private Boolean completado;
    private String prioridad;
    private String estatus;
    private Date fecha_Creacion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuarios usuario;
}
