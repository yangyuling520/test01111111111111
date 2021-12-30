package com.atguigu.java;

import java.util.ArrayList;

public class TesyYang {
    public void method() {
        System.out.println("methodTst");
        ArrayList list = new ArrayList<>();
        list.add(123333);
        list.add(455666);
        list.add(788999);
        //模板五：ifn/inn/xxx.nn/xxx.null
        if (list == null) {
            System.out.println("hhhhhhhh");
        }
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        if (list != null) {
            System.out.println("oooooooooooooooooo");
        }

    }
}
