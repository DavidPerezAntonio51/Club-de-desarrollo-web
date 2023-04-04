package mx.ipn.escom.Interfaces;

public class AutomovilFactory {
    public static Automovil getInstance(int tipo){
        return switch (tipo){
            case 1 -> new Honda();
            default -> new Tsuru();
        };
    }
}
