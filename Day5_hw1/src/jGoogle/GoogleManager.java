package jGoogle;


public class GoogleManager  {

	public boolean checkPasswordLength(String password) {
		System.out.println("Google ile password uzunlu�u kontrol edildi");
		return false;
	}

	public boolean validateEmailFormat(String email) {
		System.out.println("Google ile email format� kontrol edildi");
		return false;
	}

	public boolean checkIfEmailExists(String email) {
		System.out.println("Google ile email val��� kontrol edildi");
		return false;
	}

	
	public boolean checkNameLength(String name) {
		System.out.println("Google ile ad soyad uzunlu�u kontrol edildi");
		return false;
	}

	
	public void sendValidationEmail() {
		System.out.println("Google ile do�rulama epostas� iletildi.");
		
	}

	
	public void completeRegistration() {
		System.out.println("Google ile �ye olundu.");
		
	}

	
	public boolean isClickedValidationLink() {
		System.out.println("Google validasyon linki t�kland�.");
		return false;
	}

}
