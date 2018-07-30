public class waterBottle {
    private int volume;

    public waterBottle(){
        this.volume =  100;
    }



    public int getWaterLevel(){
        return this.volume;
    }


    public void drink(){
        this.volume -= 10;
    }

    public void empty(){
        this.volume =  0;
    }
    public void refill(){
        this.volume = 100;
    }



}
