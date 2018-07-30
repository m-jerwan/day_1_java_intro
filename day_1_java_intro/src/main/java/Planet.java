
public class Planet {
    private String name;
    private int size;


//    INITIALIZE:

    public Planet(String name, int size){
        this.name = name;
        this.size = size;
    }




//---------------------------GET:

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }
//---------------------------other:


    public void explode(){
        System.out.println("Boom, "+this.name+" has exploded");
    }

}
