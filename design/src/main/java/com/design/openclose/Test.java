package com.design.openclose;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2018/12/4 下午10:59
 */
public class Test {

    public static void main(String[] args) {
        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(957,"钢铁是怎样炼成的",299D);
        //JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)iCourse;
        System.out.println("课程的ID："+javaDiscountCourse.getId()+"  课程的名称："+javaDiscountCourse.getName()+"  课程的原价格"+javaDiscountCourse.getOriginPrice()+"  课程打折后的价格"+javaDiscountCourse.getDiscountPrice());


    }


}
