public class MyArrayList<Element> extends AbstractList<Element>{

 

  private Object[] elements;

 

 

 

/**

 * Makes myArrayList at specified size

 * @Require:

 *  maxSize > 0

 */

   

  public MyArrayList(int maxSize) {

 

    // stubbed, please implement

 

}

 

/**

 * Makes myArrayList at set maxSize 12

 * calls myArrayList(int maxSize)

 */

 

  public MyArrayList(){

 

    // stubbed, please implement

 

}

 

 

/**

 * Returns the element at the particular index point.

 */

  public Element get (int index) {

    return (Element)elements[index];

  }

     

  /**

 * Adds Element to a particular point

 */

  public void add(int index, Element element) {

  

   //stubbed, please implement

   

  }

    /**

   * Replace the element at the specified position with the specified Element.

   * @require    element != null

   *             0 <= index  index < this.size()

   * @ensure     this.get(index).equals(element)

   */

  public void set (int index, Element element){

    /* stubbed - please implement */

  }

 

 /**

 * Removes an element at index position

 */

  public void remove(int index) {

   /* stubbed - please implement */

  }

 

 

 /**

 * expands the Array by amount Increase

 * @require

 * increase >=0

 * @ensure

 * elements.length == old.elements.length + increase

 * for all i, 0 <= i && i < old.elements.length, elements[i] == old.elements[i]

 *

 */ 

  public void expand(int increase) {

   /* stubbed - please implement */

  }

 

 

  /**

   * A copy of this List.

   * @ensure     this.copy() != this

   *             this.copy().size() == this.size()

   *             for all indexes j,

   *             this.get(j).equals(this.copy().get(j))

   */

  public List<Element> copy () {

 

  /* stubbed - please implement */

    return null;

  }

}  
