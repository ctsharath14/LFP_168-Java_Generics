 public class PrintArray<T> {

        public void toPrint(T[] arr) {
            System.out.println("Integer Array:");
            for (T t : arr) {
                System.out.print(t + "  ");
            }
            System.out.print("\n");
        }
        public static void main(String[] args) {
            //printing welcome message
            MaximumTest max = new MaximumTest();
            System.out.println("Welcome to Java Generics Program.");
            max.findFloatMaximum();
        }
    }
