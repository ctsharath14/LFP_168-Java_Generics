import org.junit.Test;

public class MaximumTest {
    /* Test method to find maximum
     * String from 3 strings
     */
    @Test
    public void findStringMaximum() {
        Maximum maximum = new Maximum();

        String fruit1 = "Apple";
        String fruit2 = "Peach";
        String fruit3 = "Banana";
        System.out.println("The maximum string is :"+ maximum.findMax(fruit1,fruit2,fruit3));
    }

}