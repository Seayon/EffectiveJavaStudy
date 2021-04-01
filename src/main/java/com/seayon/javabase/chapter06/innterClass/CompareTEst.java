package com.seayon.javabase.chapter06.innterClass;

/**
 * @BelongProjecet EffectiveJavaStudy
 * @BelongPackage com.seayon.javabase.chapter06.innterClass
 * @Copyright 2018-2021 万达信息股份有限公司 - 医疗保障业务群
 * @Author: 赵旭阳/Zhao Xuyang
 * @Date: 2021/4/1 4:44 下午
 * @Version V1.0
 * @Description:
 */

public class CompareTEst {
    public static void main(String[] args) {
        double[] doubles = new double[]{1.0, 2.0, 3.0, 3.1, 999.0, -1.2, 2};
        ArrayAlg.Pair pair = ArrayAlg.minAndMax(doubles);
        System.out.println("pair.getFirst() = " + pair.getFirst());
        System.out.println("pair.getSecond() = " + pair.getSecond());
    }

   public static class ArrayAlg {

        public static Pair minAndMax(double[] values) {
            double min = Double.POSITIVE_INFINITY;
            double max = Double.NEGATIVE_INFINITY;
            for (double value : values) {
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
            }
            return new Pair(min, max);
        }

        public static class Pair {
            private double first;
            private double second;

            public Pair(double first, double second) {
                this.first = first;
                this.second = second;
            }

            public double getFirst() {
                return first;
            }

            public void setFirst(double first) {
                this.first = first;
            }

            public double getSecond() {
                return second;
            }

            public void setSecond(double second) {
                this.second = second;
            }
        }
    }
}
