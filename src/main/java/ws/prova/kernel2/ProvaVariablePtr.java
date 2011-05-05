package ws.prova.kernel2;


/**
 * The term structure of a ProvaRule doesn't contain any variables but variable pointers i.e. instances of this class.
 * The actual variables are held in an array in the rule object. This pointer class contains the array index of the respective variable.
 * -martin
 */
public interface ProvaVariablePtr extends ProvaObject {

	/**
	 * ????
	 * @param target
	 * @param unification
	 * @return
	 */
	public boolean unifyReverse(
			ProvaObject target,
			ProvaUnification unification);

	/**
	 * 
	 * @return ID of the rule this pointer belongs to.
	 */
	public long getRuleId();

	/**
	 * 
	 * @return The array index of the referenced variable.
	 */
	public int getIndex();

}
