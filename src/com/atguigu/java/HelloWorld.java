package com.atguigu.java;




import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 */
public class HelloWorld {
    //模板六：prsf/psfi/psfs：private static final
    private static final int a=10;

   // private static final TemHoole jjj= new TemHoole();
    private static final TesyYang yang= new TesyYang();
    //模板一:主方法psvm
    public static void main(String[] args) {
        //模板二:输出sout/soutp/soutm/soutv/xxx.out
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        System.out.println("args = " + args.toString());
        //模板三：fori/iter/itar
        String[] arr= new String[]{"杨玉玲","梁天阳","梁梓沫"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        int count=1;
        for (String s : arr) {
            System.out.println("第"+ count++ +"个"+s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(arr[i]);
        }
        //模板四：list.for/list.fori/list.forr
        ArrayList list=new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("111111111111111");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("222222222222222");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));

        }
        System.out.println("333333333333333");
        //TemHoole jjj= new TemHoole();
        HelloWorld  dd= new HelloWorld();
        dd.method();

       // method();

    }
    public void method() {
        System.out.println("method");
        ArrayList list = new ArrayList<>();
        list.add(123333);
        list.add(455666);
        list.add(788999);
        //模板五：ifn/inn/xxx.nn/xxx.null
        if (list != null) {
            System.out.println("oooooooooooooooooo");
        }
/*        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
            System.out.println("hhhhhhhh");
        }*/
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
            System.out.println("hhhhhhhh");
        }
        for (Object o : list) {
            System.out.println(o+"2222222222222");
        }
        if (list == null) {
            System.out.println("4555555555");
        }

        yang.method();

    }
/*    public static void main(String[] args){
        System.out.println("HelloWorld idea 新的起点，新的开始");
        ArrayList list = new ArrayList<>();
        if (list == null) {
            System.out.println("Hello hahahaha");
        }else{
            System.out.println("Hello xixixixixi");
        }
    }*/
}
