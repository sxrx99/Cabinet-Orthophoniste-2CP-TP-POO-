package MyPackage.Classes;


@SuppressWarnings("serial")
class TroubleInexistantException extends Exception {
	
	public TroubleInexistantException(String message) {
        super(message);
    }
}