
public class ExemplosTryCat {

	public static void main(String[] args) {
		System.out.println("Começou");
		/* *Segunda forma
		 	
		 	1º 
		 	
		 	try {
				main2();
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			==========================
			comlete a funcao findnumber no editor abaixo
			2º 
			
			... Tem como colocar varios tipos de exception
			catch (ArithmeticException | NullPointerException e) {
				System.out.println(e);
			}
			==========================
			
			Mostra a pilha passo a passo onde o codigo tentou executar
			e.printStackTrace(); 
			
		 * */
		main2();
		System.out.println("Fim");
	}

	private static void main2() {
		System.out.println("main2 começou");
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
			try {
				int a = i/0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		}
	}
}
