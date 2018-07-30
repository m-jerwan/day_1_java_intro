public class Printer {
    private int paper;
    private int toner;

    public Printer(){
        this.paper = 10;
        this.toner = 50;
    }

    public String print(int howManyCopies){
        if (howManyCopies <= paper) {
            this.paper -= howManyCopies;
            this.toner -= 1;
            String msg =  "Printing done";
            return msg;
        }else{
            String msg = "Feed me more paper";
            return msg;
        }
    }

    public void refillPaper(){
        this.paper = 500;
    }
}
