public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] test = {2, -5,-6, -8, 1, 2};

        int[] test2 = {2, -100,-6, -8, 1, 2};
        int[] test3 = {2, -5, -5};


        powerHungry powerHungry = new powerHungry();
        powerHungry.Solution(test);
        powerHungry.Solution(test3);
    }
}