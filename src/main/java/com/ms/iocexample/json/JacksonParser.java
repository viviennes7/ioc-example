package com.ms.iocexample.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonParser implements JsonParser {
    private final ObjectMapper objectMapper;

    public JacksonParser() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public <T> T parseObject(String s, Class<T> clazz) {
        try {
            return this.objectMapper.readValue(s, clazz);
        } catch (IOException e) {
            throw new JsonParseException(e);
        }
    }

    @Override
    public <T> String parseString(T obj) {
        try {
            return this.objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new JsonParseException(e);
        }
    }
}
