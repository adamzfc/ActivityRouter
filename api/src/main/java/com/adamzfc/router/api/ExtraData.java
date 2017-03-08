package com.adamzfc.router.api;

import java.util.HashMap;

/**
 * Created by adamzfc on 3/7/17.
 */

public class ExtraData {
    private HashMap<String, Object> map = new HashMap<>();

    public ExtraData(HashMap<String, Object> map) {
        this.map = map;
    }

    public ExtraData(String key, Object value) {
        this.map.put(key, value);
    }

    public ExtraData add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

    public HashMap build() {
        return this.map;
    }

    public static HashMap getExtra(String key, Object value) {
        return new ExtraData(key, value).build();
    }
}
