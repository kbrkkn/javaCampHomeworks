package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.1;
		double dolarBugun = 10.1;
		System.out.println(internetSubeButonu);
		if (dolarBugun < dolarDun) {
			System.out.println("dolar d��t�");

		} else if (dolarBugun > dolarDun) {
			System.out.println("dolar y�kseldi");

		}

		else {

			System.out.println("dolar de�i�medi");

		}

		String[] krediler = { "a", "b", "c" };
		for (String kredi : krediler) {
			System.out.println(kredi);

		}
	}

}
