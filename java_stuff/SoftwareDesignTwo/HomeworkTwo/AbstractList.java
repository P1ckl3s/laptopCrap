/**

 * Base class for implementing interface List. To complete an implementation,

 * the following methods must be implemented:

 *   public int size ()

 *   public Element get (int)

 *   public void set (int, Element)

 *   public void add (int, Element)

 *   public void remove (int)

 *   public List<Element>; copy ()

 *

 */

public abstract class AbstractList<Element> implements List<Element> {

 

  protected int size;  // the number of elements in the List

  /**

   * {@inheritDoc}

   *

   * This implementation invokes this.size().

   */

  public boolean isEmpty () {
    if (this.size() == 0)
	return true;
    else
	return false;
 }

 

  /** returns an integer that represents how many elements are on the list **/

 

  public int size() {

 

    // stubbed, please implement  

    return 0;

  }

 

  /**

   * {@inheritDoc}

   *

   * This implementation iterates through the list invoking this.get(int)

   * until element is found or the list is exhausted. this.size() is also invoked.

   * @ensure     if this.indexOf(element) <= 0

   *     this.get(this.indexOf(element)).equals(element)

   *     for all indexes j: j < this.indexOf(element) implies

   *     !this.get(j).equals(element)

   *             if this.indexOf(element) == -1

   *    for all indexes j

   *     !this.get(j).equals(element)

   */

  public int indexOf (Element element) {

 

    // stubbed, please implement

    return 0;

 

}

 

  /**

   * {@inheritDoc}

   *

   * This implementation invokes this.indexOf(element)

   */

  public boolean contains (Element element) {

 

    // stubbed, please implement

    return false;

 

}

 

  /**

   * {@inheritDoc}

   *

   * This implementation invokes this.add(this.size(),element).

   * @require    element != null

   * @ensure     this.size() == old.size() + 1

   *             this.get(this.size()-1).equals(element)

   */

  public void add (Element element) {

 

    // stubbed, please implement

 

}

 

  /**

   * {@inheritDoc}

   *

   * This implementation invokes this.remove(int).

   */

  public void remove (Element element) {

 

     // stubbed, please implement

  }

 

  /**

   * String representation of this List.

   *

   * This implementation invokes this.size(), and this.get(int) for each

   * List.

   */

  public String toString () {

 

   /* stubbed - please implement */

    return null;

  }

 

}
