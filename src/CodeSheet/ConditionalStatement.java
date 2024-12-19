package CodeSheet;

public class ConditionalStatement {
    public static void main(String[] args){
        int a = 10;
        int b = 15;

//        if...else
//        if(condition){.....} else {....}

        if(a>b){
            System.out.println("a is greater than b");
        } else{
            System.out.println("b is greater");
        }


//        else if
//        if(condition){.....} else if(condition) {....} else{..}

        if(a>b){
            System.out.println("a is greater than b");
        } else if(a<b) {
            System.out.println("b is greater");
        } else {
            System.out.println("both are equal");
        }


//       Ternary operator
//       variable = (condition) ? expressionTrue :  expressionFalse;
        String greater  = (a>b)? "a is greater" : "b is greater";
        System.out.println(greater);

    }
}

