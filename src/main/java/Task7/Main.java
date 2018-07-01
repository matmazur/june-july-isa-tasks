package Task7;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        String[] str = getCard();

        for (String s:str){
            System.out.println(s);
        }

    }

    public static String[] getCard() {
        List<String> card = new LinkedList<>();
        Random rand = new Random();
        String temp;

        for (int i = 0; i < 25; i++) {

            if (i == 12) continue;
            else if (i <= 4)
                temp = "B" + (rand.nextInt(15) + 1);
            else if (i <= 9)
                temp = "I" + (rand.nextInt(15) + 16);
            else if (i <= 14)
                temp = "N" + (rand.nextInt(15) + 31);
            else if (i <= 19)
                temp = "G" + (rand.nextInt(15) + 46);
            else
                temp = "O" + (rand.nextInt(15) + 61);

            if (card.contains(temp)) {
                i--;
                continue;
            }
            card.add(temp);
        }
        return card
                .stream()
                .toArray(String[]::new);
    }
}
/*import java.util.*;

public class BingoCard
{
      public static String[] getCard() {
        String[] letters = new String[]{"B", "B", "B", "B", "B", "I", "I", "I", "I", "I", "N", "N", "N", "N", "N", "G", "G", "G", "G", "G", "O", "O", "O", "O", "O"};
        List<Integer> list = new ArrayList<>();
        List<String> card = new ArrayList<>();
        Random rand = new Random();

        Integer temp;

        for (int i = 0; i < 25; i++) {

            if (i <= 4)
                temp = (rand.nextInt(15) + 1);
            else if (i <= 9)
                temp = (rand.nextInt(15) + 16);
            else if (i <= 14)
                temp = (rand.nextInt(15) + 31);
            else if (i <= 19)
                temp = (rand.nextInt(15) + 46);
            else
                temp = (rand.nextInt(15) + 61);

            if (list.contains(temp)) {
                i--;
                continue;
            }
            list.add(temp);
        }

        for (int i = 0; i < 25; i++) {

            if (i == 12){

            continue;
            }
            card.add(letters[i] + list.get(i));
        }


        card.forEach(System.out::println);


        return card
                .stream()
                .toArray(String[]::new);

    }

}
*/