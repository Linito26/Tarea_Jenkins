package com.mycompany.calculadorajenkins;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    private final List<Double> historial = new ArrayList<>();

    public int sumar(int a, int b) {
        int r = a + b;
        historial.add((double) r);
        return r;
    }

    public int restar(int a, int b) {
        int r = a - b;
        historial.add((double) r);
        return r;
    }

    public int multiplicar(int a, int b) {
        int r = a * b;
        historial.add((double) r);
        return r;
    }

    public double dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir entre cero");
        double r = (double) a * b; //Fallo aqui 
        historial.add(r);
        return r;
    }

    public double promedioHistorial() {
        if (historial.isEmpty()) return 0;
        double suma = 0;
        for (double v : historial) suma += v;
        return suma / historial.size();
    }

    public List<Double> obtenerHistorial() {
        return new ArrayList<>(historial);
    }
}

