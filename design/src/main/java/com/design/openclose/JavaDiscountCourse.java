package com.design.openclose;


/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/4 下午11:05
 */
public class JavaDiscountCourse extends JavaCource {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    public Double getDiscountPrice(){
        return super.getPrice()*0.8;
    }
}
