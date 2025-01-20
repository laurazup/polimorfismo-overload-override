class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public double somar(double a, double b) {
        return a + b;
    }
}

// Sobrecarrega um metodo, é estático, utiliza o mesmo nome porém tem parâmetros diferentes
public class Overload {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3)); // Chama o metodo com dois inteiros
        System.out.println(calc.somar(2, 3, 4)); // Chama o metodo com três inteiros
        System.out.println(calc.somar(2.5, 3.5)); // Chama o metodo com dois doubles
    }
}