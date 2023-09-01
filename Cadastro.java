package Java;
import javax.swing.JOptionPane;
import java.util.Scanner;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class Pet {
    String nome;
    String tipo;

    public Pet(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}

class Veiculo {
    String marca;
    String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro da Pessoa
        String nomePessoa = JOptionPane.showInputDialog("Digite o nome da pessoa:");
        int idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
        Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);

        // Cadastro do Pet
        String nomePet = JOptionPane.showInputDialog("Digite o nome do pet:");
        String tipoPet = JOptionPane.showInputDialog("Digite o tipo do pet:");
        Pet pet = new Pet(nomePet, tipoPet);

        
        // Cadastro do Veículo
        String marcaVeiculo = JOptionPane.showInputDialog("Digite a marca do veículo:");
        String modeloVeiculo = JOptionPane.showInputDialog("Digite o modelo do veículo:");
        Veiculo veiculo = new Veiculo(marcaVeiculo, modeloVeiculo);

        // Exibir informações cadastradas
        JOptionPane.showMessageDialog(null, "Informações cadastradas:\n\n" +
                "Pessoa:\nNome: " + pessoa.nome + "\nIdade: " + pessoa.idade + "\n\n" +
                "Pet:\nNome: " + pet.nome + "\nTipo: " + pet.tipo + "\n\n" +
                "Veículo:\nMarca: " + veiculo.marca + "\nModelo: " + veiculo.modelo);

        scanner.close();
    }
}
