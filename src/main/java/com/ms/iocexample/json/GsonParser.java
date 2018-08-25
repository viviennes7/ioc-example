package com.ms.iocexample.json;

import com.google.gson.Gson;

public class GsonParser implements JsonParser {
    private final Gson gson;

    public GsonParser() {
        gson = new Gson();
    }

    @Override
    public <T> T parseObject(String s, Class<T> clazz) {
        return this.gson.fromJson(s, clazz);
    }

    @Override
    public <T> String parseString(T obj) {
        return this.gson.toJson(obj);
    }
}
