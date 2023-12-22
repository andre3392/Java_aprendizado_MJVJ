package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String MensagemDoar = "Pode doar cara, tu ganha bem!";
        String MensagemNaoDoar = "Ih, doa não, seu duro.";
        String Resultado = salario >=5000 ? MensagemDoar:MensagemNaoDoar;
        System.out.println(Resultado);
    }
}
