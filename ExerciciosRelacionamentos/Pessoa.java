package ExerciciosRelacionamentos;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Universidade universidade;
    private Departamento departamento;

    public Pessoa(String nome, LocalDate dataNascimento, Universidade universidade, Departamento departamento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getUniversidade() {
        return universidade != null ? universidade.getNome() : "Nenhuma";
    }

    public String getDepartamento() {
        return departamento != null ? departamento.getNome() : "Nenhum";
    }

    public void informar() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Universidade: " + getUniversidade());
        System.out.println("Departamento: " + getDepartamento());
    }
}
