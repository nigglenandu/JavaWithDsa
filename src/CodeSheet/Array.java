package CodeSheet;

public class Array {
        public static void main(String[] args) {
            String[] names = {"Niggle", "Nandu", "John", "Kurt"};
            System.out.println(names[0]);

            for(int i = 0; i<=3; i++){
                System.out.println(names[i]);
            }

//          for each loop
            for(String i : names){
                System.out.println(i);
            }

//          replacing new name
            names[2] = "Harry";
            System.out.println("name replace: " + names[2]);

            System.out.println("length: " + names.length);
        }
}
