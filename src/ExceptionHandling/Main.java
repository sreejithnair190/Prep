package ExceptionHandling;

public class Main {
    public static void main(String[] args) throws MyException {
        try{
            int a = 5;
            int b = 0;
//            int c = Main.divide(a, b);
//            System.out.println(c);
            throw new MyException("Custom Exception");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (MyException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) throw new ArithmeticException("Please do not divide by 0");

        return a / b;
    }
}
