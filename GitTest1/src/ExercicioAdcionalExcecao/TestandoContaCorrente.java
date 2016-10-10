package ExercicioAdcionalExcecao;

public class TestandoContaCorrente {
	public static void main(String args[]) {
		ContaCorrente conta = null;
		try {
			conta = new ContaCorrente(-10);
			System.out.println("Saldo inicial: " + conta.getSaldo());
			conta.deposito(1000);
			conta.retirada(1000);
			System.out.println("Saldo final: " + conta.getSaldo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.print("Erro: ");
			e.printStackTrace();
		}
	}
}
