package lukin;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.*;

//https://github.com/kerbyy/reflectionLab5

public class Injector {

    /**
     * @author Artem Lukin
     * Assigns the necessary classes to fields that are not filled in and marked with the AutoInjectable annotation
     * @param obj  accepts any object
     * @return The same object, but with already initialized fields
     */
    public static <T> T inject(T obj) throws Exception{
        Field[] fields =  obj.getClass().getDeclaredFields();
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/cfg.properties"));
        for(Field field : fields) {
            if (field.isAnnotationPresent(AutoInjectable.class)) {
                String type = field.getAnnotatedType().toString();
                String implementationName = properties.get(type).toString();
                Object value = Class.forName(implementationName).getConstructor().newInstance();
                Field _field = obj.getClass().getDeclaredField(field.getName());
                _field.setAccessible(true);
                _field.set(obj, value);
            }
        }
        return obj;
    }
}