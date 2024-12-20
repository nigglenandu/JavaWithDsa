package CodeSheet;

/* Overloading

1) property of polymorphism.
2) It is compile type polymorphism, exist at compile time.
3) Class having more than 1 method have same method name but different parameter.
4) diff return type if same diff para type if same diff numbers for arguments.
*/
class Overloading{
    static int add(int x, int y){
        System.out.print("1st method = ");
        return x + y;
    }
    static int add(int x, int y, int z){
        System.out.print("2nd method = ");
        return x + y + z;
    }

    static double add(double x, double y){
        System.out.print("3rd method = ");
        return x + y;
    }

    public static void main(String[] args){
        int result = add(1, 1);
        System.out.println(result);

        System.out.println(add(2.5, 2.5));
        System.out.println("hii new feature added");
    }
}

/* Syntax
return_type method_name(para)
return_type same_method_name(para1, para2)
 */
