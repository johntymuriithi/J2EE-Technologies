package this_keyword;

class Calculator {
    int value; // default value of int is 0;

    public Calculator() {
        this(20); // using this to difference bet instance variables and parameters
    }

    Calculator(int value) {
        this.value = value;
    }

//    Calculator add(int value) {
//        this.result += value;
//
//        return this;
//    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.value);
    }
}
