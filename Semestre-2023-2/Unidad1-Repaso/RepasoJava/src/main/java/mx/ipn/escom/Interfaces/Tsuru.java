package mx.ipn.escom.Interfaces;

public class Tsuru implements Automovil{
    private String marca;
    private String velocidad;

    public Tsuru(){
        marca = "Nissan";
        velocidad = "80.5";
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public Double getVelocidadMaxima() {
        return Double.parseDouble(velocidad);
    }
}
