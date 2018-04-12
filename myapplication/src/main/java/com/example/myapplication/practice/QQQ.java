package com.example.myapplication.practice;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.RandomAccess;

/**
 * Created by louis2 on 18-3-5.
 */

public class QQQ {

    public static int i = 3;
    public int ii = 4;

    public static class A { //父类
        public static String staticStr = "A静态属性";
        public String nonStaticStr = "A非静态属性";

        public static void staticMethod() {
            i = 2;
            System.out.println("A静态方法");
        }

        public void nonStaticMethod() throws FileNotFoundException {
            System.out.println("A非静态方法");

        }
    }

    public static class B extends A {//子类B
        public static String staticStr = "B改写后的静态属性";
        public String nonStaticStr = "B改写后的非静态属性";

        public static void staticMethod() {
            System.out.println("B改写后的静态方法");
        }
    }


    public static class C {
        public void test() {

            System.out.println("-------------------------------");
            B b = new B();
            System.out.println(b.nonStaticStr);
            System.out.println(b.staticStr);
            b.staticMethod();

            System.out.println("-------------------------------");
            A b1 = new B();
            System.out.println(b1.nonStaticStr);
            System.out.println(b1.staticStr);
            b1.staticMethod();//结果都是父类的静态方法，说明静态方法不可以被重写，不能实现多态

            Integer integer = Integer.valueOf("3");
            String s = String.valueOf("3");
            integer.toString();
        }
    }


}
