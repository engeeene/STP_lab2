
public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.print();
        array.geometricMeanOfPairedArrayElements();
        array.maxModuleElement();
        array.maxPairedElement();
        array.minModuleElement();
        array.sumOfFirst(11);

        Matrix matrix = new Matrix();
        matrix.print();
        matrix.rowSums();

        Matrix matrix9 = new Matrix(9);
        matrix9.print();
        matrix9.binariMatrix();

    }
}