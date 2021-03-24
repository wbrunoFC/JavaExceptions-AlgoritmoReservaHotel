package  exceptions ;

public  class  DomainException  extends  RuntimeException {
	/**
	 Exception obriga a tratar 
	 RuntimeException n obriga a tratar
	 **/
	private  static  final  long serialVersionUID =  1L ;

	public  DomainException ( String  msg ) {
		super (msg);
	}
}