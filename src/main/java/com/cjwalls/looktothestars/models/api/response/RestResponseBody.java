package com.cjwalls.looktothestars.models.api.response;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class RestResponseBody {

    private final Object meta;
    private final Object data;

    public Object getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }

    public RestResponseBody() {
        this.data = null;
        this.meta = null;
    }

    public RestResponseBody(Object data, Object meta) {
        this.data = data;
        this.meta = meta;
    }


}
