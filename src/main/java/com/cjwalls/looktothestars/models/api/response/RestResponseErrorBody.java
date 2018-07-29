package com.cjwalls.looktothestars.models.api.response;

import java.util.ArrayList;

public class RestResponseErrorBody extends RestResponseBody {
    private final Iterable<String> errors;

    public Iterable<String> getErrors() {
        return errors;
    }

    public RestResponseErrorBody(String errorMsg) {
        super();
        this.errors = new ArrayList<>();
        ((ArrayList<String>) this.errors).add(errorMsg);
    }

    public RestResponseErrorBody(Iterable<String> errors) {
        super();
        this.errors = errors;
    }
}
