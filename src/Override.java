// Classe base
class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

// Subclasse Cachorro
class Cachorro extends Animal {
    @java.lang.Override
    public void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

// Subclasse Gato
class Gato extends Animal {
    @java.lang.Override
    public void fazerSom() {
        System.out.println("O gato mia: Miau!");
    }
}
// Sobrescreve um metodo, é dinâmico, utiliza o mesmo nome porém ação diferente
public class Override {
    public static void main(String[] args) {
        Animal meuAnimal;

        meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Chama o metodo sobrescrito em Cachorro

        meuAnimal = new Gato();
        meuAnimal.fazerSom(); // Chama o metodo sobrescrito em Gato
    }
}