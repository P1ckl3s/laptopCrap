/* Patrick Giorlando
 * CSCI 2120-001
 * Dr. Summa
 * Homework 1
 * Dogfight v1.0 */
package DogfightV1;

public class Dog {
  
  // Instance Variables
  private int tolerance; // @invariant: tolerance >= 0 && tolerance <= 100
  private int speed; // @invariant: speed >=1 && speed <= 100
  private int power; // @invariant: power >= 1 && power <= 20
  private boolean isDefending; // true if current Animal is defending, false if
                               // current Animal is attacking
  private String name;
  private String resultOfLastInteraction; // should contain info about what
                                          // happened last round
  
  public Dog(String name, int tolerance, int speed, int power) {
    this.name = name;
    
    /* If a Dog is created with higher or lower stats it is automatically set
     * to the maximum or minimum value, respectively */
    if (tolerance >= 100)
        this.tolerance = 100;
    else if (tolerance <= 0)
        this.tolerance = 1;
    else
        this.tolerance = tolerance;
        
    if (speed >= 100)
        this.speed = 100;
    else if (speed <= 1)
        this.speed = 1;
    else
        this.speed = speed;
        
    if (power >= 20)
        this.power = 20;
    else if (power <= 1)
        this.power = 1;
    else
        this.power = power;
  }
  
  // Query Methods  
  public int tolerance() {
    return tolerance;
  }
  
  public int speed() {
    return speed;
  }
  
  public int power() {
    return power;
  }
  
  public String name() {
    return name;
  }
  
  public boolean isDefending() {
      return isDefending;
  }
  
  public String resultOfLastInteraction() {
    return resultOfLastInteraction;
  }
  
  public String toString() {
    // Returns the state of the object in a string.
    return name + "'s stats are:\n" + "Tolerance: " + tolerance + "\n" +
        "Speed: " + speed + "\n" + "Power: " + power + "\n" + "and it's last" +
        " interaction was:\n" + resultOfLastInteraction();
  }

  // Commands
  
  // Put this dog into "Attack Mode" in preparation for the performMove command
  public void attack() {
    isDefending = false;
  }
  
  // Put this dog into "Defend Mode" in preperation for the performMove command
  public void defend() {
    isDefending = true;
  }
  
  /* perform whatever "move" is going to happen - in this iteration, for
   * testing, we are passing in a float between 0.0 and 1.0 to represent a
   * random number. In the future variants, we will pass in a reference to an 
   * object of type Random */
  public void performMove(Dog otherDog, double randomNumber) {
      // Reset the last interaction in preparation for the move
      resetLastInteraction();
      
      // Check to see if this dog is attacking
      if (isDefending == false && otherDog.tolerance() > 0 || tolerance() > 0){
          // Checking to see if other dog is attacking as well
          if (otherDog.isDefending() == false && otherDog.tolerance() > 0 || tolerance > 0) {
              // Checking if the attacking dog hit
              if (randomNumber <= (speed / 100.0)) {
                  otherDog.getHit(power);
                  resultOfLastInteraction = name + " attacks " + otherDog.name()
                  + " and hits for " + power + " damage.";
              }
              // The attacking dog misses his attack
              else {
                  resultOfLastInteraction = name + " attacks " + otherDog.name()
                  + " and misses his attack hitting for 0 damage.";
              }
          }
          // The attacking dog is attacking a defending dog
          else if (otherDog.isDefending() == true) {
              // The attack does nothing to the defending dog
              if (randomNumber >= 0.0 && randomNumber <= 0.5) {
                  resultOfLastInteraction = name + " attacks " + otherDog.name()
                  + " while it's defending and does 0 damage.";
              }
              // The attack does 25% damage to the defending dog
              else if (randomNumber > 0.5 && randomNumber <= 0.75) {
                  otherDog.getHit(power / 4);
                  resultOfLastInteraction = name + " attacks " + otherDog.name()
                  + " while it's defending and does " + (power/4) + " damage.";
              }
              // This attack does 25% damage to the attacker
              else if (randomNumber > 0.75 && randomNumber <= 1.0) {
                  getHit(power / 4);
                  resultOfLastInteraction = name + " attacks " + otherDog.name()
                  + " and hurts itself for " + (power / 4) + " damage.";
              }
          }
      }
      // Dog is defending
      else {
          if (otherDog.tolerance() > 0 || tolerance > 0)
            resultOfLastInteraction = name + " defends for the round.";
      }
      
      // Dog is dead
      if (otherDog.tolerance() <= 0)
        resultOfLastInteraction = name + " has killed " + otherDog.name() + ".";
      if (tolerance <= 0)
        resultOfLastInteraction = name + " has been defeated by " + otherDog.name() + ".";
  }
  
  private void getHit(int amountOfHit) {
      tolerance -= amountOfHit;
  }
  
  public void resetLastInteraction() {
    resultOfLastInteraction = "";
  }
} // end of Dog Class
