package com.lds.demo.Test;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/10/9 下午1:33
 */
public enum EnumTest {

    PHONE(0, "手机"),

    STB(1, "电视");

    private Integer code;

    private String desc;

    EnumTest(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    EnumTest(int i, java.lang.String str) {

    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static void main(String[] args) {
        System.out.println(EnumTest.PHONE.desc);
    }
}



