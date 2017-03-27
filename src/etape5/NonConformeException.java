package etape5;

public class NonConformeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NonConformeException() {
		super("La voiture n'est pas conforme");
	}

}
