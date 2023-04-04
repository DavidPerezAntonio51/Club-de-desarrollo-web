package mx.ipn.escom;

import mx.ipn.escom.Ejercicio1.Persona;
import mx.ipn.escom.Interfaces.Automovil;
import mx.ipn.escom.Interfaces.AutomovilFactory;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Un objeto es una instancia creada a partir de una plantilla(Clase)
         */
        Persona persona1 = new Persona("David", 23, "Calle Tabasco No.10");
        System.out.println(persona1);
        Automovil auto = AutomovilFactory.getInstance(1);
        Automovil auto2 = AutomovilFactory.getInstance(0);
        persona1.conducir(auto);
        List<Automovil> automovilList = new ArrayList<>();
        automovilList.add(auto);
        automovilList.add(auto2);
        for (int i = 0; i < automovilList.size(); i++) {
            persona1.conducir(automovilList.get(i));
        }
        for (Automovil a:
             automovilList) {
            persona1.conducir(a);
        }
        automovilList.forEach(a->{
            persona1.conducir(a);
        });
        Iterator<Automovil> iterator = automovilList.iterator();
        while(iterator.hasNext()){
            Automovil a = iterator.next();
            persona1.conducir(a);
        }
        Map<Integer,Automovil> mapa = new HashMap<>();
        mapa.put(1,auto);
        mapa.putIfAbsent(2,auto2);
        mapa.forEach((key,value)->{
            System.out.println("key:" + key + " valor:" + value);
        });
    }
}
