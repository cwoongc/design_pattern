package com.cwoongc.study.design_pattern.builder;

import com.cwoongc.study.design_pattern.builder.Something;
import com.cwoongc.study.design_pattern.builder.SomethingLikeLombok;
import com.cwoongc.study.design_pattern.builder.SomethingLombok;

/**
 * 1. 빌더 제공클래스와 client간 결합도 낮춤
 *  - 생성자에 인수로 전달해야 하는 부분의 규격변경에 민감하지 않음
 * 2. 생성자에 전달하는 인수를 직관적으로 파악하기 쉽게하기 위해
 *  - method chaining 방식으로 생성
 */
public class BuilderMain {

    public static void main(String[] args) {
        Something s = new Something.Builder()
                .name("wcchoi")
                .number(1)
                .size(182.5d)
                .build();

        SomethingLombok sl = SomethingLombok.builder()
                .name("sjchoi")
                .number(2)
                .size(100.0d)
                .build();

        SomethingLikeLombok sll = SomethingLikeLombok.builder()
                .name("swchoi")
                .number(3)
                .size(120.00d)
                .build();


    }
}
