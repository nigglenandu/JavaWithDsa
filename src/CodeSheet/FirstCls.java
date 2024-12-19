package CodeSheet;

public class FirstCls {
    int x = 5;
    int y = 4;

}

class SecondCls{
    public static void main(String[] args){
        FirstCls firstObj = new FirstCls();
        System.out.println(firstObj.x + firstObj.y);

        firstObj.x = 4;
        System.out.println(firstObj.x);
    }
}
