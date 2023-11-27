package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StructData {
    private Queue<MotocicletaDRA> listaMotos;
    private Queue<MotocicletaDRA> copia;
    
    public StructData(){
        listaMotos = new LinkedList<>();
        copia = new LinkedList<>();
        defaultList();
    }

    public boolean isEmpty(){
        return listaMotos.isEmpty();
    }

    public void add(MotocicletaDRA moto){
        listaMotos.add(moto);
    }

    private void defaultList(){
        listaMotos.add(new MotocicletaDRA("ABC123", "Honda", 2010, "Carreteral"));
        listaMotos.add(new MotocicletaDRA("DEF456", "Yamaha", 2015, "Pista"));
        listaMotos.add(new MotocicletaDRA("GHI789", "Suzuki", 2018, "Enduro"));
        listaMotos.add(new MotocicletaDRA("JKL012", "Kawasaki", 2019, "Pista"));
        listaMotos.add(new MotocicletaDRA("MNO345", "Harley Davidson", 2020, "Carreteral"));
    }

    public List<MotocicletaDRA> listar() {
        return listaMotos.stream().toList();
    }
    public List<MotocicletaDRA> listarcopia() {
        return copia.stream().toList();
    }

    public int valorPagar() {
        int anio = listaMotos.peek().getAnio();
        int anioBase = 2025;
        int anioRestante = anioBase - anio;
        int total = 0;
        String type = listaMotos.peek().getTipo();
        String marca = listaMotos.peek().getMarca();

        if(type.equals("Carreteral")){
            total = anioRestante + 100;
            
        }else{
            total = anioRestante + 50;
        }
        copiar(marca);
        listaMotos.remove();
        return total;
    }

    public Queue<MotocicletaDRA> copiar(String marca){
        for (MotocicletaDRA moto: listaMotos) {
            if(moto.getMarca().equals(marca)){
                copia.add(moto);
            }
        }
        return copia;
    }
    
}
