// Documentação: https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook

package segundasemana;

public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Cibele";
        String segundoNome = "Mallmann";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

    }
    
}