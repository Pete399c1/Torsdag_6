package Task_1;

public class FourMethods {
    public char methodJ(){
        System.out.println('J');
        return 'J';
    }

    public String methodFirstA(){
        System.out.println("a");
        return "a";
    }

    public String methodV(){
        System.out.println("v");
        return "v";
    }

    public String methodA(){
        System.out.println("a");
        return "a";
    }

    public char methodI(){
        System.out.println('I');
        return 'I';
    }

    public String methodS(){
        System.out.println("s");
        return "s";
    }

    public char methodF(){
        System.out.println('F');
        return 'F';
    }

    public String methodU(){
        System.out.println("u");
        return "u";
    }

    public String methodN(){
        System.out.println("n");
        return "n";
    }


    @Override
    public String toString(){
        return  methodJ() + methodFirstA() + methodV() + methodA() + " " + methodI() + methodS() + " " + methodF() + methodU() + methodN();
    }
}
