package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.1;
		double dolarBugun = 10.1;
		System.out.println(internetSubeButonu);
		if (dolarBugun < dolarDun) {
			System.out.println("dolar düþtü");

		} else if (dolarBugun > dolarDun) {
			System.out.println("dolar yükseldi");

		}

		else {

			System.out.println("dolar deðiþmedi");

		}

		String[] krediler = { "a", "b", "c" };
		for (String kredi : krediler) {
			System.out.println(kredi);

		}
	}

}
