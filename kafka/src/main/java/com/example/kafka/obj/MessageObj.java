package com.example.kafka.obj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>
 *
 * <p>
 *
 * @author EastCool·Lee
 * @date 2020/7/7 上午11:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MessageObj {

    public Integer id = 9527;

    public String name = "EastCool·Lee";

    public String sex = "male";

    public Integer age = 17;

}
