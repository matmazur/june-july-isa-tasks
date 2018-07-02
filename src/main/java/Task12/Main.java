package Task12;

public class Main {

    public static void main(String[] args) {


        double[] test = new double[]{18, 5, 17};


        System.out.println();

        for (double d : xbonacci(test, 10)) {
            System.out.println(d);
        }
    }


    public static double[] xbonacci(double[] signature, int n) {

        if (n == 0 || signature == null) {
            return new double[]{};
        }

        double[] result = new double[n];

        for (int i = 0; i < n; i++) {

            if (i < signature.length) {
                result[i] = signature[i];
            } else {
                for (int j = 0; j <= signature.length; j++) {


                    result[i] += result[i - j];
                }
            }
        }
        return result;
    }
}