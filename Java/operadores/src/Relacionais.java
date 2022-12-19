
public class Relacionais {

    public static void main(String[] args) {

        String nomeUm = "Cibele";
        String nomeDois = "Cibele";

        System.out.println(nomeUm == nomeDois);

        String nomeTres = "Cibele";
        String nomeQuatro = new String("Cibele");

        System.out.println(nomeTres.equals(nomeQuatro));


        int numeroUm = 1;
        int numeroDois = 2;

        boolean simNao = numeroUm == numeroDois;

        if(numeroUm < numeroDois){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numeroUm != numeroDois;

        System.out.println("numero1 é diferente a numero2? " + simNao);

        simNao = numeroUm > numeroDois;

        System.out.println("numero1 é maior que numero2? " + simNao);

    }
}
