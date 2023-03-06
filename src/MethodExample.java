public class MethodExample {
    //Creating a Method
    public int addNumbers(int x, int y) {
        int addition = x + y;
        return addition;
    }
    public static void main(String[] args) {
        int i=10;
        int j=25;
        MethodExample obj = new MethodExample();
        int result = obj.addNumbers(i, j);
        System.out.println("Sum of x+y = " + result);
    }
}
