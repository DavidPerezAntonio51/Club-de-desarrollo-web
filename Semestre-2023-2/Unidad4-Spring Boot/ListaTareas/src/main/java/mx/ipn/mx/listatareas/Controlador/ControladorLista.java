package mx.ipn.mx.listatareas.Controlador;

import mx.ipn.mx.listatareas.DTO.TareaDTO;
import mx.ipn.mx.listatareas.Servicios.ServicioTareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ControladorLista {
    @Autowired
    private ServicioTareas servicioTareas;

    @PostMapping("/tareas")
    public ResponseEntity<?> agregarTarea(@RequestBody TareaDTO tarea){
        servicioTareas.guardarTarea(tarea);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/tareas")
    public ResponseEntity<List<TareaDTO>> listarTareas(){
        ResponseEntity<List<TareaDTO>> respuesta = new ResponseEntity<>(servicioTareas.mostrarLista(),HttpStatus.OK);
        return respuesta;
    }
    @PutMapping("/tareas")
    public ResponseEntity<List<TareaDTO>> actualizarTarea(@RequestBody TareaDTO tarea){
        servicioTareas.actualizarTarea(tarea);
        ResponseEntity<List<TareaDTO>> respuesta = new ResponseEntity<>(HttpStatus.OK);
        return respuesta;
    }

    @DeleteMapping("/tareas")
    public ResponseEntity<?> eliminarTareas(@RequestBody TareaDTO tarea){
        servicioTareas.eliminarTarea(tarea);
        ResponseEntity<List<TareaDTO>> respuesta = new ResponseEntity<>(HttpStatus.OK);
        return respuesta;
    }

    @PostMapping("/extra")
    public ResponseEntity<Integer> mostrandoEntero(@RequestParam(name = "numero") Integer numero1,
                                                   @RequestParam Integer numero2) {
        return  new ResponseEntity<>(numero1+numero2,HttpStatus.OK);
    }
}
