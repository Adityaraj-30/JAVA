public class test {
    int v1;
    int v2;
    public void meth1(){
        v1=0;
        v2=0;
        int []v3={0};
        meth2(v2,v3);
        System.out.print(v1 + v2 + v3[0]);
    }
    public void meth2(int v2, int [] v3){
        v1=1;
        v2=1;
        v3[0]=1;
    }
    public static void main(String[] args) {
        test aq = new test();
        aq.meth1();
    }
}
