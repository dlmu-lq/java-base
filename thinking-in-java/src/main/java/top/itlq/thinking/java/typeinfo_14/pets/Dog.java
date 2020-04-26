package top.itlq.thinking.java.typeinfo_14.pets;

public class Dog extends Pet{
    public Dog(String name){super(name);}
    public static class Factory implements top.itlq.thinking.java.typeinfo_14.factory.Factory<Dog> {
        @Override
        public Dog create() {
            return new Dog("factory Dog");
        }
    }
}
