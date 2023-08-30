import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
public class powerHungry {

    public String Solution(int[] xs) {
        int negativeCount = 0;
        int zeroCount = 0;
        int sum = 0;

        if(xs.length <= 1)
        {
            System.out.println(xs[0]);
            return Integer.toString(xs[0]);
        }

        List<Integer> xsList = new ArrayList<Integer>(xs.length);
        for (int o : xs)
        {
            sum+= o;
            if(o == 0)
            {
                zeroCount++;
            }
            xsList.add(o);
        }
        if (zeroCount == xs.length)
        {
            System.out.println("0");
            return "0";
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
            List<Integer> negatives = new ArrayList<>();

            if(xs.length == 2)
            {
                System.out.println(Math.max(xs[0], xs[1]));
                return Integer.toString(Math.max(xs[0], xs[1]));
            }

            for(int negative: xsList)
            {
                if(negative < 0)
                {
                negatives.add(negative);
                }
            }

            Collections.sort(negatives);

            if(negatives.size() == 1)
            {
                System.out.println("0");
                return "0";
            }

            int lastElement = negatives.size() - 1;
            negatives.remove(lastElement);



            for (int j = 0; j < xsList.size(); j++) {
                if (xsList.get(j) <= 0) {
                    xsList.set(j, 1);
                }

                product *= xsList.get(j);
            }

            for (Integer negative : negatives) {
                product *= negative;
            }


        }


        System.out.println(Integer.valueOf(product).toString());
        return String.valueOf(product);
    }

}
