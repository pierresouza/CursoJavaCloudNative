public class MinhaClasseJava {
    public static void main(String[] args) {
        String primeiroNome = "Pierre";
        String segundoNome = "Souza";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){

        return "Resultado do método " + primeiroNome.concat( " ").concat(segundoNome);

    }
}