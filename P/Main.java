package P;
import P1.*;
import P2.*;



public class Main {
    public static void main(String[] args) {
        TwoDim ref;
        ref =new TwoDim(4, 3);
        System.out.println(ref);
        ref=new ThreeDim(2, 1, 5);
        System.out.println(ref);
    }
}
