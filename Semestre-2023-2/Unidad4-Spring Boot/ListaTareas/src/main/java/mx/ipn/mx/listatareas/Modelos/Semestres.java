package mx.ipn.mx.listatareas.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Semestres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Semestre;
    private String semestre;
}
