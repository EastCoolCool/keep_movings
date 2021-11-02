package com.example.tuling.spring.first;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/8 下午3:03
 */
public class TulingService {

    private Integer flag;

    public TulingService(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "TulingService{" +
                "flag=" + flag +
                '}';
    }
}
