public class Sistema {
    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double primeiraNota = 8.0;
        double segundaNota = 7.0;

        double mediaFinal = calcularMedia(primeiraNota, segundaNota);
        String situacao = verificarSituacao(mediaFinal);

        apresentarResultados(nomeAluno, mediaFinal, situacao);
    }

    // Método responsável apenas por calcular a média
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }

    // Método responsável por verificar se o aluno está aprovado ou reprovado
    public static String verificarSituacao(double media) {
        if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // Método responsável pela exibição dos dados
    public static void apresentarResultados(String nome, double media, String situacao) {
        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);
        System.out.println("Situação: " + situacao);
    }
}