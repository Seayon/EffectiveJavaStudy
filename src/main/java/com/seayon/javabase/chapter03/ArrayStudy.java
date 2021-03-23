package com.seayon.javabase.chapter03;

import com.seayon.chapter02.item2.Person;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayStudy {
    @Test
    public void test() {
        int[] a1 = {18, 19, 1, 2, 3};
        System.out.println("Arrays.toString(new int[]{18,19,1,2,3}) = " + Arrays.toString(a1));
        int[] a = new int[10];//所有元素都会初始化为 0
        for (int i : a) {
            assertThat(i, equalTo(0));
        }
        double[] d = new double[10];//所有元素都会初始化为 0.0
        for (double v : d) {
            assertThat(v, equalTo(0.0));
        }
        float[] f = new float[10];//所有元素都会初始化为 0.0F
        for (float v : f) {
            assertThat(v, equalTo(0.0f));
        }
        boolean[] b = new boolean[10];
        for (boolean b1 : b) {
            assertThat(b1, equalTo(false));
        }
        Person[] people = new Person[100];
        for (Person person : people) {
            assertThat(person, equalTo(null));
        }

        Arrays.sort(a1);
        System.out.println("a1 = " + Arrays.toString(a1));

    }

    @Test
    public void testSort() {
        int[] a = new int[1000000];
        for (int i = 0; i < a.length; i++) {
            int t = (int) (Math.random() * 10000);
            a[i] = t;
        }
//        String s = Arrays.toString(a);
//        System.out.println("s = " + s);
        System.out.println("Calendar.getInstance().getTimeInMillis() = " + Calendar.getInstance().getTimeInMillis());
        Arrays.sort(a);
        String s = Arrays.toString(a);
        System.out.println("s = " + s);
        System.out.println("Calendar.getInstance().getTimeInMillis() = " + Calendar.getInstance().getTimeInMillis());
        ArrayList arrayList = new ArrayList(100);
        arrayList.ensureCapacity(100);
        List list = new ArrayList();
        Map<String,String> map = new HashMap();
        arrayList.trimToSize();
        Integer integer = new Integer(1);
        Boolean aBoolean = new Boolean(true);
        Float aFloat = new Float(1.0F);
        Double aDouble = new Double(1);
        Short aShort = new Short((short) 1);
        Byte aByte = new Byte((byte) 1);
        Character character = new Character('1');

        integer++;
    }

    @Test
    public void testMul() {
        int[][] magicSquare = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Arrays.deepToString(magicSquare) = " + Arrays.deepToString(magicSquare));
        String s = Arrays.toString(magicSquare);
        System.out.println("Arrays.toString(magicSquare[0])+Arrays.toString(1) = " + Arrays.toString(magicSquare[0]) + Arrays.toString(magicSquare[1]));
    }
}
