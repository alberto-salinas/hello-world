Class HelloWorld {

	public static void main String (String[] args) {
	
		System.out.println("Hola Jose");
	}

	public int factorial (int n) {
		if (n <= 0) {
			return 1;
		}
		return n * factorial (n-1);
	}
}
