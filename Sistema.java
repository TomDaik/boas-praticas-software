public class Sistema {
    public static void main(String[] args) {
        String nome = "Carlos";
        double nota1 = 8;
        double nota2 = 7;
        double media = (nota1 + nota2) / 2;
        System.out.println("Aluno: " + nome);
        System.out.println("édia: " + media);
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}