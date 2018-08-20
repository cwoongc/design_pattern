package com.cwoongc.study.design_pattern.builder;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class SomethingLikeLombok {

    private int number;
    private String name;
    private double size;


    public static SomethingLikeLombokBuilder builder() {

        return new SomethingLikeLombokBuilder();
    }

    private SomethingLikeLombok(int number, String name, double size) {
        this.number = number;
        this.name = name;
        this.size = size;
        System.out.println(toString());
    }



    public static class SomethingLikeLombokBuilder {

        private int number = 0;
        private String name = null;
        private double size = 0d;

        SomethingLikeLombokBuilder() {

        }


        public SomethingLikeLombokBuilder number(int number) {
            this.number = number;
            return this;
        }

        public SomethingLikeLombokBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SomethingLikeLombokBuilder size(double size) {
            this.size = size;
            return this;
        }

        public SomethingLikeLombok build() {
            return new SomethingLikeLombok(number,name,size);
        }


    }





}
