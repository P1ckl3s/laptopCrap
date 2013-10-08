/**

 *A finite list of Elements.

 */

public interface List<Element>{

  /**

   * Number of elements in this List.

   * @ensure     this.size() <= 0

   */

  public int size ();

 

  /**

   * This List contains no elements.

   * this.isEmpty() == (this.size() == 0)

   */

  public boolean isEmpty ();

 

  /**

   * The Element with the specified index.

   * @require    0 <= index && index < this.size()

   */

  public Element get (int index);

 

  /**

   * The index of the first occurrence of the specified element,

   * or -1 if this List does not contain the specified element.

   * @ensure     if this.indexOf(element) <= 0

   *                 this.get(this.indexOf(element)).equals(element)

   *                 for all indexes j: j < this.indexOf(element) implies

   *                      !this.get(j).equals(element)

   *             if this.indexOf(element) == -1

   *                 for all indexes j,

   *                      !this.get(j).equals(element)

   */

  public int indexOf (Element element);

 

  /**

   * This List contains the specified Element.

   * this.contains(element) == (this.indexOf(element) <= 0)

   */

  public boolean contains (Element element);

 

  /**

   * Append the specified Element to the end of this List.

   * Equivalent to this.add(this.size(),element).

   * @require    element != null

   * @ensure     this.size() == old.size() + 1

   *             this.get(this.size()-1).equals(element)

   */

  public void add (Element element);

 

  /**

   * Insert the specified Element at the specified index.

   * @require    element != null

   *             0 <= index && index <= this.size()

   * @ensure     this.size() == old.size() + 1

   *             this.get(index).equals(element)

   *             for all j: index <= j && j < old.size() implies

   *                 old.get(j).equals(this.get(j+1))

   */

  public void add (int index, Element element);

 

  /**

   * Replace the element at the specified position with the specified Element.

   * @require    element != null

   *             0 <= index && index < this.size()

   * @ensure     this.get(index).equals(element)

   */

  public void set (int index, Element element);

 

  /**

   * Remove the element with the specified index.

   * @require    0 <= index && index < this.size()

   * @ensure     this.size() == old.size() - 1

   *             for all j: index <= j && j < this.size() implies

   *                      this.get(j).equals(old.get(j+1))

   */

  public void remove (int index);

 

  /**

   * Remove the first occurrence of the specified Element from this List.

   * Has no effect if the Element is not contained in this List.

   */

  public void remove (Element element);

 

  /**

   * A copy of this List.

   * @ensure     this.copy() != this

   *             this.copy().size() == this.size()

   *             for all indexes j,

   *                 this.get(j).equals(this.copy().get(j))

   */

  public List<Element> copy ();

 

}
