public class ShapeArea {

    // Read ShapeArea.md for more details regarding the code quiz
    public static int shapeArea(int n) {
        /* Solution below will cause java.lang.StackOverflowError for really large inputs
        that is why recursion is not a good option in this case
        if (n == 1) {
            return 1;
        } else {
            return shapeArea(n-1) + 4 * (n-1);
        }
        */
        int result_shape = 1;
        for (int i = 2; i <= n; i++) {
            result_shape = result_shape + 4 * (i - 1);
        }
        return result_shape;
    }

    public static void main(String[] args) {
        assert 1 == shapeArea(1);
        assert 5 == shapeArea(2);
        assert 13 == shapeArea(3);
        assert 25 == shapeArea(4);
        assert 41 == shapeArea(5);
    }

}
