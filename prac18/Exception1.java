public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 1/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Wtf u doing why u divided by zero?");
        }
        //infinity
    }

    public static void main(String [] args){
        Exception1 a = new Exception1();
        a.exceptionDemo();
    }
}
