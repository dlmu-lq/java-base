package top.itlq.thinking.java.typeinfo_14.classObject.pet;

import com.google.common.collect.Lists;
import org.junit.Test;
import top.itlq.thinking.java.typeinfo_14.pets.*;
import top.itlq.thinking.java.typeinfo_14.pets.*;

import java.util.List;

public class LiteralPetCreator extends PetCreator{

    // 防止外部对其进行修改，List，数组要注意
//    private static List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(
//            Cat.class, Dog.class, Hamster.class, Manx.class, Mouse.class,
//            Mutt.class, Pet.class, Pug.class, Rat.class, Rat.class, Rat.class, Rat.class
//    ));

    public static List<Class<? extends Pet>> allTypes = Lists.newArrayList(
            Cat.class, Dog.class, Hamster.class, Manx.class, Mouse.class,
            Mutt.class, Pet.class, Pug.class, Rat.class, Rat.class, Rat.class, Rat.class);

    private static List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Dog.class),allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    @Test
    public void test(){
        LiteralPetCreator creator = new LiteralPetCreator();
        System.out.println(creator.createList(10));
    }
}