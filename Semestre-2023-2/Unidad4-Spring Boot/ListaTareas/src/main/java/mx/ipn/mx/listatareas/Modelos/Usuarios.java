package mx.ipn.mx.listatareas.Modelos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Usuario;
    private String nombre;
    private String email;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    private List<Tareas> tareas;
}
