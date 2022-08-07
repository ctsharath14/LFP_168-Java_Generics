import org.junit.Test;

public class MaximumTest {

    /* Test method to find maximum
     * number from 3 float numbers
     */
    @Test
    public void findFloatMaximum() {
        Maximum maximum = new Maximum();

        Float num1 = (float) (Math.random() * 1000);
        Float num2 = (float) (Math.random() * 1000);
        Float num3 = (float) (Math.random() * 1000);
        System.out.println("The maximum float number is :"+ maximum.findMax(num1,num2,num3));
    }
}