public class TiposVariaveis {
	public static void main(String[] args) throws Exception {

		double salarioMinimo = 2500;

		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;

		int numero = 5; // se a variável tiver final na frente, não permite alteração e escrita em caixa alta

		numero = 10;

		System.out.println(numero);

	}
}