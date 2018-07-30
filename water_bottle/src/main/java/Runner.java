public class Runner {
    public static void main(String[] args){

    waterBottle bottle_01  = new waterBottle();

        System.out.println(bottle_01.getWaterLevel());

        bottle_01.drink();
        bottle_01.drink();
        bottle_01.drink();

        System.out.println(bottle_01.getWaterLevel());

        bottle_01.empty();

        System.out.println(bottle_01.getWaterLevel());

        bottle_01.refill();

        System.out.println(bottle_01.getWaterLevel());

    }
}
