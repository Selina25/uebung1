package main.java.at.fhj.iit;

import java.util.List;
/**
 * Class represents a mixed drink which can has to contain one alcoholic and one non-alcoholic liquid
 * drinks
 */
public class MixedDrink extends Drink {

    /**
     * This enum contains all possible sirup which can be added to the mixed drink
     */
    protected enum Syrup {
       elderberry,
        blueberry,
        strawberry,
        peach,
        mint,
        rose;

    }

    protected  Liquid l1;
    protected  Liquid l2;
    protected List<String> otherIngredients;
    protected Syrup syrup;
    



    /**
     * Creates a MixedDrink object with given name
     *
     * @param name name of the drink
     *
     */
    MixedDrink(String name){
        super(name);

    }
    /**
     * Creates a MixedDrink object with given name and two Liquids
     *
     * @param name name of the drink
     * @param l1 name of the first liquid
     * @param l2 name of the second liquid
     *
     */
    MixedDrink(String name, Liquid l1, Liquid l2) throws AlcoholicSubstanceException {
        super(name);
        if(l1.getAlcoholPercent()<0 || l2.getAlcoholPercent() <0) {
            this.l1 = l1;
            this.l2 = l2;
        }else{
            throw new AlcoholicSubstanceException();
        }
    }



    /**
     * Creates a MixedDrink object with given name and two Liquids
     *
     * @param name name of the drink
     * @param l1 name of the first liquid
     * @param l2 name of the second liquid
     * @param syrup name of the sirup
     */
    MixedDrink(String name, Liquid l1, Liquid l2, Syrup syrup) throws AlcoholicSubstanceException {
        super(name);
        if(l1.getAlcoholPercent()<0 || l2.getAlcoholPercent() <0) {
            this.l1 = l1;
            this.l2 = l2;
        }else{
            throw new AlcoholicSubstanceException();
        }
        this.syrup = syrup;

    }

    /**
     * Creates a MixedDrink object with given name and two Liquids
     *
     * @param name name of the drink
     * @param l1 name of the first liquid
     * @param l2 name of the second liquid
     * @param otherIngredients  list of names of other ingredients
     */
    MixedDrink(String name, Liquid l1, Liquid l2, List<String>otherIngredients) throws AlcoholicSubstanceException {
        super(name);
        if(l1.getAlcoholPercent()<0 || l2.getAlcoholPercent() <0) {
            this.l1 = l1;
            this.l2 = l2;
        }else{
            throw new AlcoholicSubstanceException();
        }
        this.otherIngredients = otherIngredients;

    }

    /**
     * Creates a MixedDrink object with given name and two Liquids
     *
     * @param name name of the drink
     * @param l1 name of the first liquid
     * @param l2 name of the second liquid
     * @param syrup name of the sirup
     * @param otherIngredients  list of names of other ingredients
     */
    MixedDrink(String name, Liquid l1, Liquid l2, Syrup syrup, List<String>otherIngredients) throws AlcoholicSubstanceException {
        super(name);
        if(l1.getAlcoholPercent()<0 || l2.getAlcoholPercent() <0) {
            this.l1 = l1;
            this.l2 = l2;
        }else{
            throw new AlcoholicSubstanceException();
        }
        this.otherIngredients = otherIngredients;
        this.syrup = syrup;
    }


    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        return l1.getVolume()+l2.getVolume();
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    @Override
    public double getAlcoholPercent() {
        return (l1.getAlcoholPercent()+l2.getAlcoholPercent())/2;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l1.getAlcoholPercent()>0 || l2.getAlcoholPercent()>0){
            return true;
        }else {
            return false;
        }

    }

    /**
     * Shakes the ingredients of the mixed drink
     */
    public void shake(){
    System.out.println("The ingredients have been shook and the drink is now ready to serve");

    }

    /**
     * Stirs the ingredients of the mixed drink
     */
    public  void  stir(){
        System.out.println("The ingredients have been stirred and the drink is now ready to serve");
    }
}