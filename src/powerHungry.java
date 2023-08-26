import java.util.*;
public class powerHungry {

    public String Solution(int [] xs) {
        int negativeCount = 0;
        List<Integer> xsList = new ArrayList<Integer>(xs.length);
        for (int o : xs)
        {
            xsList.add(o);
        }

        Collections.sort(xsList);
        ;

        int product = 1;

        for (Integer sortedX : xsList) {
            if (sortedX < 0) {
                negativeCount++;
            }

        }

        if (negativeCount % 2 == 0) {

            for (int j = 0; j < xsList.size(); j++) {
                if (xsList.get(j) == 0) {
                    //trying to replace zero with one
                    xsList.set(j, 1);
                }

                product *= xsList.get(j);
            }

        } else {
            xsList.remove(0);

            for (int j = 0; j < xsList.size(); j++) {
                if (xsList.get(j) == 0) {
                    xsList.set(j, 1);
                }

                product *= xsList.get(j);
            }


        }


        System.out.println(String.valueOf(product));
        return String.valueOf(product);
    }

}
