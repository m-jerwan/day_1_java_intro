public class calculatorJava {
    private int firstNo;
    private int secondNo;


    public calculatorJava(int firstNo, int secondNo){
        this.firstNo = firstNo;
        this.secondNo = secondNo;
    }


    public int add(){
        return firstNo+secondNo;
    }
    public int subtract(){
        return firstNo-secondNo;
    }
    public int multiply(){
        return firstNo*secondNo;
    }
    public int divide(){
        return firstNo/secondNo;
    }

}

