package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // +, - , / , *
        float numero1 = 10;
        float numero2 = 20;
        double resultado = numero1/numero2;
        System.out.println(resultado);

        // %, (<, > , <=, >=, ==, != (sempre retornam booleanos))
        int resto = 20/7;
        System.out.println(resto);
        boolean IsDezMaiorQueVinte = 10 > 20;
        System.out.println(IsDezMaiorQueVinte);

        // &&, ||, !
        int Idade = 30;
        double Salario = 8000;
        double SaldoPoupanca = 5000;
        double SalcoContaCorrente = 3000;

        boolean CondicaoSaldoPoupanca = SaldoPoupanca >=10000;
        boolean CondicaoSaldoContaCorrente = SalcoContaCorrente >=10000;
        boolean CondicaoSomado = (SaldoPoupanca+SalcoContaCorrente)>=80000;


        boolean ConsegueComprarVideogame = CondicaoSaldoPoupanca || CondicaoSaldoContaCorrente || CondicaoSomado;
        System.out.println("Consegue Comprar: "+ConsegueComprarVideogame);

        // =, +=, -=, *=, /= , %=


    }
}
