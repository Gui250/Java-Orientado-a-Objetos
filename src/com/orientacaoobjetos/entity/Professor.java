package com.orientacaoobjetos.entity;

public class Professor {
    public String escola = "Ebac" ;
    public String nome = "Guilherme" ;
    public String materia = "Java Orientado a Objetos" ;

    // comportamentos -> métodos
    public void lecionarMateria() {
        System.out.println("O professor " + nome + " está dando a matéria " + materia + " na escola " + escola );
    }

    public void finalizarTarefa() {
        System.out.println("O professor " + nome + " finalizou a matéria " + materia + " na escola " + escola);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEscola: " + escola + "\nMateria: " + materia;
    }
}
