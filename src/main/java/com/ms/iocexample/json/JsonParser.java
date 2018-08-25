package com.ms.iocexample.json;

public interface JsonParser {
    <T> T parseObject(String s, Class<T> clazz);

    <T> String parseString(T obj);
}
