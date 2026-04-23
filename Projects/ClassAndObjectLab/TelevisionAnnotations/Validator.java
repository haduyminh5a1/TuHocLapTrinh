package Projects.ClassAndObjectLab.TelevisionAnnotations;
import java.lang.reflect.Field;;

public class Validator {
    public static int clamp(Object obj, String fieldName, int newValue) {
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            if (field.isAnnotationPresent(VolumeLimiter.class)) {
                VolumeLimiter limits = field.getAnnotation(VolumeLimiter.class);
                
                if (newValue > limits.max()) return limits.max();
                if (newValue < limits.min()) return limits.min();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return newValue;
    }
}
