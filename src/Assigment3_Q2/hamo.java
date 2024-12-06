package Assigment3_Q2;

import java.util.ArrayList;

public class hamo {
    public static Integer max (ArrayList < Integer > list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Integer max = list.get(0);
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }

        }
        return max;
    }
}
