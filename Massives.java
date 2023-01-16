public class Massives {
    public static void main(String[] args) {

        double[] array1 = new double[6];
        String[] array2 = {"bdhd", "jdjd"};
        String[] array3 = new String[2];
        array3[0] = "fhfh";

        array1[0] = 1.2;
        array1[2] = 5.8;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i] + " ");
        }
    }

}
