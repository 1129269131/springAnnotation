package com.tjh.springannotation.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * day08：
 *      自定义逻辑返回需要导入的组件
 *
 * Create by koala on 2021-03-09
 */
public class MyImportSelector implements ImportSelector {

    //返回值，就是到导入到容器中的组件全类名
    //AnnotationMetadata：当前标注@Import注解的类的所有注解信息
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //importingClassMetadata
        //方法不要返回null值
        return new String[]{"com.tjh.springannotation.bean.Blue","com.tjh.springannotation.bean.Yellow"};
    }

}
