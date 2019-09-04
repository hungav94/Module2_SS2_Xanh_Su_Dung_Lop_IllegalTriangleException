public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        try {
            Triangle triangle = new Triangle(1, 2, 3);
        } catch (Exception ex){
            System.out.println("3 cạnh " + ex.getMessage());
        }
    }
}
