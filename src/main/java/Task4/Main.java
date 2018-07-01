package Task4;

public class Main {

    public static void main(String[] args) {

        //https://www.codewars.com/kata/robotic-tattoo-removal/train/java

        String[][] tat = new String[][]{
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", "X", "X", " ", " ", " ", "X", "X", " ", " "},
                {" ", "X", " ", " ", "X", " ", "X", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                {" ", " ", "X", " ", " ", " ", " ", " ", "X", " ", " "},
                {" ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " "},
                {" ", " ", " ", " ", "X", " ", "X", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}};
    }

    public static String[][] robot(String[][] skinScan) {

        for (int i = 0; i < skinScan.length; i++) {

            for (int j = 0; j < skinScan[i].length; j++) {
                if (skinScan[i][j].equals("X"))
                    skinScan[i][j] = "*";
            }
        }

        return skinScan;
    }
}