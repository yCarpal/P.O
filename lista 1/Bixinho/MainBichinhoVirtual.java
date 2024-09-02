package Bixinho;
public class MainBichinhoVirtual {
    public static void main(String[] args) {
        // Testando a classe BichinhoVirtual
        BichinhoVirtual tamagushi = new BichinhoVirtual("Tama", 5, 7, 2);
        System.out.println("Nome: " + tamagushi.getNome());
        System.out.println("Fome: " + tamagushi.getFome());
        System.out.println("Saúde: " + tamagushi.getSaude());
        System.out.println("Idade: " + tamagushi.getIdade());
        System.out.println("Humor: " + tamagushi.getHumor());

        // Alterações nos atributos e cálculo do humor
        tamagushi.alterarFome(10);
        tamagushi.alterarSaude(9);
        System.out.println("Nova Fome: " + tamagushi.getFome());
        System.out.println("Nova Saúde: " + tamagushi.getSaude());
        System.out.println("Novo Humor: " + tamagushi.getHumor());

        // Testando mudança de nome e idade
        tamagushi.alterarNome("Tama ");
        tamagushi.alterarIdade(3);
        System.out.println("Novo Nome: " + tamagushi.getNome());
        System.out.println("Nova Idade: " + tamagushi.getIdade());
    }
}