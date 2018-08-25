package com.ms.iocexample.member;

import com.ms.iocexample.json.JsonParser;

public class MemberService {
    private final JsonParser jsonParser;

    public MemberService(JsonParser jsonParser) {
        this.jsonParser = jsonParser;
    }

    public String parseString(Member member) {
        return this.jsonParser.parseString(member);
    }
}