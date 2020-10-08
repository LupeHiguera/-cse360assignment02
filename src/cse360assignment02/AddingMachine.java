package cse360assignment02;

public class AddingMachine {
    private int total;
    private String myString = "0";

    /***
     * Constructor
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /***
     * gets total
     * @return returns total
     */
    public int getTotal () {
        return total;
    }

    /***
     * add a value to total
     * @param value adds value to total
     */
    public void add (int value) {
        total = total + value;
        myString = myString + " + " + value;
    }

    /***
     * subtracts from total
     * @param value value subtracts from total
     */
    public void subtract (int value) {
        total = total - value;
        myString = myString + " - " + value;

    }

    /***
     * returns message
     * @return message
     */
    public String toString () {
        return myString;
    }

    /***
     * deletes everything
     */
    public void clear() {
        myString = "0";
    }
}