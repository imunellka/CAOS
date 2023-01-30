package org.example;

import java.io.Serializable;

public class JsonSerializationUtils implements Serializable {
    public static String serialize(Object o) throws IllegalAccessException {
        String ans = "Person: { \n";
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
                    ans += "'" + elem.getName() + "': " + "'" + null + "',\n";
                }
                if (elem.get(o) != null) {
                    ans += "'" + elem.getName() + "': " + "'" + elem.get(o) + "',\n";
                }
            }
        }
        return ans + "}";
    }
}
