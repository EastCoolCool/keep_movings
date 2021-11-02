package com.example.tuling.spring.first;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/8 上午12:18
 */
public class TulingCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (context.getBeanFactory().containsBean("person")) {
             return true;
        }
        return false;
    }
}
