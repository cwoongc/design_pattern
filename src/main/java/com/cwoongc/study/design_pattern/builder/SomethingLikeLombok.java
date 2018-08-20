package com.cwoongc.study.design_pattern.builder;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class SomethingLikeLombok {

    private int number;
    private String name;
    private double size;

    /**
     * private 본클래스 생성자
     *  : 직접생성을 막고 내부클래스의 build()함수를 통해 생성되게함 (내부클래스는 enclosing 클래스의 private 생성자도 접근가능)
     * @param number
     * @param name
     * @param size
     */
    private SomethingLikeLombok(int number, String name, double size) {
        this.number = number;
        this.name = name;
        this.size = size;
        System.out.println(toString());
    }


    /**
     * static builder() 함수
     *  : 내부 빌더 클래스 생성해서 반환. Client가 호출.
     *    Builder를 체인으로 반환하는 set 함수들이 제공되는 Builder 인스턴스생성
     * @return
     */
    public static SomethingLikeLombokBuilder builder() {
        return new SomethingLikeLombokBuilder();
    }


    /**
     * public static class 내부 빌더 클래스
     */
    public static class SomethingLikeLombokBuilder {

        private int number = 0;
        private String name = null;
        private double size = 0d;


        private SomethingLikeLombokBuilder() {

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
