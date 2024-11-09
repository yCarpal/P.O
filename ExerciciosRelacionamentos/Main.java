package ExerciciosRelacionamentos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando Universidades
        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");

        // Criando Departamentos
        Departamento fisica = new Departamento("Departamento de Física");
        Departamento matematica = new Departamento("Departamento de Matemática");

        // Criando Pessoas
        Pessoa einstein = new Pessoa("Albert Einstein", LocalDate.of(1879, 3, 14), princeton, fisica);
        Pessoa newton = new Pessoa("Isaac Newton", LocalDate.of(1643, 1, 4), cambridge, matematica);

        // Exibindo informações
        System.out.println("Informações de Albert Einstein:");
        einstein.informar();

        System.out.println("\nInformações de Isaac Newton:");
        newton.informar();
    }
}