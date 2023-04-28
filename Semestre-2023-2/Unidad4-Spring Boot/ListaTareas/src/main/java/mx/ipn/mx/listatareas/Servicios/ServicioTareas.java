package mx.ipn.mx.listatareas.Servicios;

import mx.ipn.mx.listatareas.DTO.TareaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioTareas {
    private List<TareaDTO> tareas = new ArrayList<>();

    public void guardarTarea(TareaDTO tarea){
        tareas.add(tarea);
    }
    public List<TareaDTO> mostrarLista(){
        return this.tareas;
    }
    public void eliminarTarea(TareaDTO tarea){
        int index = 0;
        for (TareaDTO tareaDTO:
             tareas) {
            if(tarea.getNo_Tarea().equals(tareaDTO.getNo_Tarea())){
                break;
            }
            index++;
        }
        tareas.remove(index);
    }
    public void actualizarTarea(TareaDTO tarea){
        Integer id = tarea.getNo_Tarea();
        tareas.forEach(tareaDTO -> {
            if(tareaDTO.getNo_Tarea().equals(id)){
                tareaDTO.setNombreTarea(tarea.getNombreTarea());
                tareaDTO.setCompletado(tarea.getCompletado());
                tareaDTO.setDescripcion(tarea.getDescripcion());
                tareaDTO.setMateria(tarea.getMateria());
            }
        });
    }
}
