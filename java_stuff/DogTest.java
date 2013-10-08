package DogfightV1;
import junit.framework.TestCase;
import java.util.Random;

class DogTest extends TestCase 
{
  private Dog lassie;
  private Dog fido;
  private Dog rupert;
  private Dog chip;
  private Random randomNumber = new Random();
  
  public DogTest() 
  {
    lassie = new Dog("Lassie",82,12,2);
    fido = new Dog("Fido",23,93,15);
    rupert = new Dog("Rupert",75,45,12);
    chip = new Dog("Chip",64,36,7);
  }
  
  public void runTest() 
  {
    testInitialState();
    testAttackVsAttack();
    testAttackVsDefend();
  }
  
  public static void main(String[] arguments) 
  {
    (new DogTest()).runTest();
  }
  
  private void testInitialState() 
  {
    System.out.println("THE DOGS INITIAL STATS ARE AS FOLLOWS: ");
    System.out.println(lassie.toString() + "\n");
    System.out.println(fido.toString() + "\n");
    System.out.println(rupert.toString() + "\n");
    System.out.println(chip.toString() + "\n" + "\n");
  }
  
  private void testAttackVsAttack() 
  {
    // Lassie vs. Fido
    while (lassie.tolerance() > 0 && fido.tolerance() > 0) 
    {
      lassie.attack();
      fido.attack();
      lassie.performMove(fido,makeRandomNumber());
      fido.performMove(lassie,makeRandomNumber());
    }
    
    System.out.println("THE RESULTS ARE AS FOLLOWS FOR ATTACK VS ATTACK: ");
    System.out.println("Lassie vs. Fido" + "\n" + lassie.toString() + "\n");
    System.out.println(fido.toString() + "\n");
    
    // Rupert vs. Chip
    while (rupert.tolerance() > 0 && chip.tolerance() > 0) 
    {
      rupert.attack();
      chip.attack();
      rupert.performMove(chip,makeRandomNumber());
      chip.performMove(rupert,makeRandomNumber());
    }
    
    System.out.println("Rupert vs. Chip" + "\n" + rupert.toString() + "\n");
    System.out.println(chip.toString() + "\n");
    
    // Lassie vs. Rupert
    while (lassie.tolerance() > 0 && rupert.tolerance() > 0) 
    {
      lassie.attack();
      rupert.attack();
      lassie.performMove(rupert,makeRandomNumber());
      rupert.performMove(lassie,makeRandomNumber());
    }
    
    System.out.println("Lassie vs. Rupert" + "\n" + lassie.toString() + "\n");
    System.out.println(rupert.toString() + "\n");
    
    // Chip vs. Fido
    while (chip.tolerance() > 0 && fido.tolerance() > 0) 
    {
      chip.attack();
      fido.attack();
      chip.performMove(fido,makeRandomNumber());
      fido.performMove(chip,makeRandomNumber());
    }
    
    System.out.println("Chip vs. Fido" + "\n" + chip.toString() + "\n");
    System.out.println(fido.toString() + "\n");
  }
  
  
  private void testAttackVsDefend() 
  {
    // Lassie vs. Fido
    while (lassie.tolerance() > 0 && fido.tolerance() > 0) 
    {
      lassie.attack();
      fido.defend();
      lassie.performMove(fido,makeRandomNumber());
      fido.performMove(lassie,makeRandomNumber());
    }
    
    System.out.println("THE RESULTS ARE AS FOLLOWS FOR ATTACK VS DEFEND: ");
    System.out.println("Lassie vs. Fido" + "\n" + lassie.toString() + "\n");
    System.out.println(fido.toString() + "\n");
    
    while (lassie.tolerance() > 0 && fido.tolerance() > 0) 
    {
      lassie.defend();
      fido.attack();
      lassie.performMove(fido,makeRandomNumber());
      fido.performMove(lassie,makeRandomNumber());
    }
    
    System.out.println("Lassie vs. Fido" + "\n" + lassie.toString() + "\n");
    System.out.println(fido.toString() + "\n");
    
    // Rupert vs. Chip
    while (rupert.tolerance() > 0 && chip.tolerance() > 0) 
    {
      rupert.attack();
      chip.defend();
      rupert.performMove(chip,makeRandomNumber());
      chip.performMove(rupert,makeRandomNumber());
    }
    
    System.out.println("Rupert vs. Chip" + "\n" + rupert.toString() + "\n");
    System.out.println(chip.toString() + "\n");    
    
    while (rupert.tolerance() > 0 && chip.tolerance() > 0) 
    {
      rupert.defend();
      chip.attack();
      rupert.performMove(chip,makeRandomNumber());
      chip.performMove(rupert,makeRandomNumber());
    }
    
    System.out.println("Rupert vs. Chip" + "\n" + rupert.toString() + "\n");
    System.out.println(chip.toString() + "\n");
    
    // Lassie vs. Rupert
    while (lassie.tolerance() > 0 && rupert.tolerance() > 0) 
    {
      lassie.attack();
      rupert.defend();
      lassie.performMove(rupert,makeRandomNumber());
      rupert.performMove(lassie,makeRandomNumber());
    }
    
    System.out.println("Lassie vs. Rupert" + "\n" + lassie.toString() + "\n");
    System.out.println(rupert.toString() + "\n");    
    
    while (lassie.tolerance() > 0 && rupert.tolerance() > 0) 
    {
      lassie.defend();
      rupert.attack();
      lassie.performMove(rupert,makeRandomNumber());
      rupert.performMove(lassie,makeRandomNumber());
    }
    
    System.out.println("Lassie vs. Rupert" + "\n" + lassie.toString() + "\n");
    System.out.println(rupert.toString() + "\n");
    
    // Chip vs. Fido
    while (chip.tolerance() > 0 && fido.tolerance() > 0) 
    {
      chip.attack();
      fido.defend();
      chip.performMove(fido,makeRandomNumber());
      fido.performMove(chip,makeRandomNumber());
    }
    
    System.out.println("Chip vs. Fido" + "\n" + chip.toString() + "\n");
    System.out.println(fido.toString() + "\n");    
      
    while (chip.tolerance() > 0 && fido.tolerance() > 0) 
    {
      chip.defend();
      fido.attack();
      chip.performMove(fido,makeRandomNumber());
      fido.performMove(chip,makeRandomNumber());
    }
    
    System.out.println("Chip vs. Fido" + "\n" + chip.toString() + "\n");
    System.out.println(fido.toString());
  }
  
  
  private double makeRandomNumber() 
  {
   return randomNumber.nextDouble();
  }
}
