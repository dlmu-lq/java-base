package top.itlq.thinking.java.chapter06_housekeeping;

public class InitBase {
    {
        System.out.println("base {}");
    }
    public InitBase(){
        System.out.println("base constructor");
    }
    public InitBase(int i){
        System.out.println("base constructor");
    }
}
