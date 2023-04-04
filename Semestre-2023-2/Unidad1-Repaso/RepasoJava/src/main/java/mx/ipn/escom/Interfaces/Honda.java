package mx.ipn.escom.Interfaces;

public class Honda implements Automovil{
    private String marca;
    private Double velocidad;
    public Honda(){
        marca = "Honda";
        velocidad = 90.20;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public Double getVelocidadMaxima() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "Honda{" +
                "marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
