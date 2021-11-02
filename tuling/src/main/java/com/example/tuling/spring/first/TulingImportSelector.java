package com.example.tuling.spring.first;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @描述:
 * @Author EastCool·Lee
 * @Date 2019/6/8 上午9:12
 */
public class TulingImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.example.tuling.spring.first.Car"};
    }
}
