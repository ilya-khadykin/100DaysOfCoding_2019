public class AdjacentElementsProduct {

    // Read AdjacentElementsProduct.md for more details
    public static int adjacentElementsProduct(int[] inputArray) {
        int adjacentProduct = inputArray[0] * inputArray[1];
        for(int i=0; i<inputArray.length-1; i++) {
            if (adjacentProduct <  inputArray[i] * inputArray[i+1]) {
                adjacentProduct = inputArray[i] * inputArray[i+1];
            }
        }
        return adjacentProduct;
    }

    public static void main(String[] args) {
        int[] inputArray1 = {3, 6, -2, -5, 7, 3};
        assert 21 == adjacentElementsProduct(inputArray1);
        int[] inputArray2 = {1, 0, 1, 0, 1000};
        assert 0 == adjacentElementsProduct(inputArray2);
        int[] inputArray3 = {1, 2, 3, 0};
        assert 6 == adjacentElementsProduct(inputArray3);
    }

}
