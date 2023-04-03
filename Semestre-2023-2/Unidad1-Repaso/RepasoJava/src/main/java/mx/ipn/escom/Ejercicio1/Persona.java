package mx.ipn.escom.Ejercicio1;

/**
 * ¡Recuerda! Una clase es solamente la plantilla que nos dicta
 * la estructura que debe tener nuestro objeto
 */
public class Persona {
    /**
     * Declaramos los atributos
     */
    private String nombre;
    private int edad;
    private String direccion;

    /**
     * Tenemos 2 tipos de constructores, el primero es el constructor
     * por default, y el segundo admite parametros necesarios para
     * inicializar nuestro objeto.
     */

    public Persona(){

    }

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    /**
     * Los Getters nos ayudan a obtener el valor de un atributo de nuestro objeto
     * Los Setters nos ayudan a modificar una propiedad de nuestro objeto
     * ¿Porque usar setters y getters?
     * Nos dan mas control sobre lo que puede hacerse y lo que no en nuestro objeto
     * ¿Esto tiene algo que ver con el encapsulamiento?
     * ¡Claro! el encapsulamiento en si es un mecanismo que nos ayuda a proteger las
     * operaciones y los datos de un objeto. Es por ello que se recomienda utilizar
     * los modificadores de acceso de los atributos y metodos y solamente exponer
     * lo realmente necesario.
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
