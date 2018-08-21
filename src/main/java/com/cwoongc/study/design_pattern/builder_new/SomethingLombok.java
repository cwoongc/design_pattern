package com.cwoongc.study.design_pattern.builder_new;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Setter
@Getter
public class SomethingLombok {

    private int number;
    private String name;
    private double size;


    @lombok.Builder
    private SomethingLombok(int number, String name, double size) {
        this.number = number;
        this.name = name;
        this.size = size;
        System.out.println(this.toString());
    }


}
