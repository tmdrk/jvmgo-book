package com.github.jvmgo.classfile.attributeInfo;

import com.github.jvmgo.classfile.ClassReader;

/**
 * @Author: panda
 * @Date: 2018/10/3 0003 19:47
 */
public class SyntheticAttribute implements AttributeInfo {
    @Override
    public AttributeInfo readInfo(ClassReader reader) {
        return null;
    }
}
