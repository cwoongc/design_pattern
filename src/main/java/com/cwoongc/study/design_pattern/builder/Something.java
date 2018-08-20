package com.cwoongc.study.design_pattern.builder;

import lombok.ToString;

@ToString
public class Something {

    private int number;
    private String name;
    private double size;


    private Something(int number, String name, double size) {
        this.number = number;
        this.name = name;
        this.size = size;
        System.out.println(this.toString());
    }

    public static class Builder {

        private int number = 0;
        private String name = null;
        private double size = 0d;

        public Builder() {}

        public Builder number(int number) {
            this.number = number;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder size(double size) {
            this.size = size;
            return this;
        }

        public Something build() {
            return new Something(number, name, size);
        }
    }


}
