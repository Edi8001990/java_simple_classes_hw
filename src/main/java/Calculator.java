public class Calculator {
    private int value1;
    private int value2;
    private int value3;


    public Calculator(int value1, int value2, int value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;

    }

    public int getValue1() {
        return this.value1;
    }

    public int getValue2(){
        return this.value2;
    }

    public int add(){
        value1 = 50;
        value2 = 10;

        value3 = value1 + value2;
        return value3;
    }

    public int substract(){
        value1 = 50;
        value2 = 10;

        value3 = value1 - value2;
        return value3;
    }

    public int multiply(){
        value1 = 50;
        value2 = 10;

        value3 = value1 * value2;
        return value3;
    }

    public int divide(){
        value1 = 50;
        value2 = 10;

        value3 = value1 / value2;
        return value3;
    }


}


