package JavaNangCao.JavaAdvancedLearn.Annotation.StringLengthValidation;

import java.lang.reflect.Field;

public class ValidatorEngine {
    public static void validate(Object obj) {
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object value = field.get(obj);
                if (field.isAnnotationPresent(NotNull.class) && value == null){
                    if (field.get(obj) == null){
                        System.out.println("Error: Field '" + field.getName() + "' cannot be null!");
                    }
                }
                if (field.isAnnotationPresent(Length.class) && value != null) {
                    Length annotation = field.getAnnotation(Length.class);
                    int min = annotation.min();
                    int max = annotation.max();

                    if (value instanceof String) {
                        String stringValue = (String) value;
                        if (stringValue.length() < min || stringValue.length() > max) {
                            System.out.println("Error at field: " + field.getName() + 
                                        " (Length: " + stringValue.length() + 
                                            ", require: " + min + "-" + max + ")");
                        }
                    }
                }    
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }        
        }
    }
}