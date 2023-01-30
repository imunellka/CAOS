package org.example;

import java.io.Serializable;

public class JsonSerializationUtils implements Serializable {
    public static String serialize(Object o) throws IllegalAccessException {
        boolean serialize = false;
        for (var ann : o.getClass().getAnnotations()) {
            if (ann.annotationType().getName().equals("org.example.JsonSerializable")) {
                serialize = true;
            }
        }
        if(!serialize){
            throw new IllegalAccessException("Non serializable class");
        }
        String ans = "{ \n";
        for (var elem : o.getClass().getFields()) {
            boolean ser = false, nul = false;
            for (var ann : elem.getAnnotations()) {
                if (ann.annotationType().getName().equals("org.example.IgnoreNull")) {
                    nul = true;
                }
                if (ann.annotationType().getName().equals("org.example.JsonElement")) {
                    ser = true;
                }
//                System.out.println(ann.annotationType().getName());
            }
            if (ser) {
                if (elem.get(o) == null && !nul) {
                    ans += "\"" + elem.getName() + "\": " + "\"" + null + "\",\n";
                }
                if (elem.get(o) != null) {
                    ans += "\"" + elem.getName() + "\": " + "\"" + elem.get(o) + "\",\n";
                }
            }
        }
        return ans + "}";
    }
}
