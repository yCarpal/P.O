package Lista 2.empregador;

public class empregado {
    private int codigo;
    private String nome;
    private String email;
    private float salario;

public empregado(int codigo, String nome, String email, float salario) {
    this.codigo = codigo;
    this.nome = nome;
    this.email = email;
    this.salario = salario;
}   

public float getSalario() {
    return salario;
}

public void aumentoSalarial(float percentual){
    this.salario += this.salario * (percentual/100);
}

public String tString(){
    return "O empregado"+ nome + ", Salario:" + salario;
}
}






