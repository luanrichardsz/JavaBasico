package luan.edu.primeiraSemana.segunda;

public class MyClass {
    public static void main(String [] args) {
        String primeiroNome = "Luan";
        String segundoNome = "Richard";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome,String segundoNome) {
        String s = "Seu nome completo é " + primeiroNome.concat(" ").concat(segundoNome);
        return s;

    }
}
