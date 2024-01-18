
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    private String breed;
    private int weight;
    private String color;

    /**
     * Basic constructor for objects of class Dog.
     * Set variable to Breed "Shiba Inu", with weight 50, color "Orange"
     */
    public Dog()
    {
        setBreed("Shiba Inu");
        setWeight(50);
        setColor("Orange");
    }

    /**
     * Constructor for objects of class Dog
     * @param       String breed of dog, 
     * @param       int weight in lbs, 
     * @param       Color colors
     */
    public Dog(String breed, int weight, String color)
    {
        setBreed(breed);
        setWeight(weight);
        setColor(color);
    }
    
    /**
     * Returns the breed of the dog
     *
     * @param       none
     * @return      String breed
     */
    public String getBreed()
    {
        return breed;
    }
    
    /**
     * Returns the weight of the dog
     *
     * @param       none
     * @return      int weight
     */
    public int getWeight(){
        return weight;
    }
    
    /**
     * Returns the color of the dog
     *
     * @param       none
     * @return      String Color
     */
    public String getColor(){
        return color;
    }
    
    /**
     * Sets the breed of the dog
     *
     * @param       String breed
     * @return      void
     */
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    /**
     * Sets the weight of the dog. If <=0, sets to 1.
     *
     * @param       int weight
     * @return      void
     */
    public void setWeight(int weight){
        if(weight <= 0){
            this.weight = 1;
        }
        this.weight = weight;
    }
    
    /**
     * Sets the color of the dog
     *
     * @param       String color
     * @return      void
     */
    public void setColor(String color){
        this.color = color;
    }
    
}
