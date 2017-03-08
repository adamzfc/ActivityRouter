package com.adamzfc.router.api;

import java.util.HashMap;

/**
 * Created by adamzfc on 3/7/17.
 */

public class ActivityRouter {
    private static HashMap<String, Object> extraDataCache = new HashMap<>();
    public static HashMap<String, Object> getExtraData() {
        return extraDataCache;
    }
    public static void setExtraData(HashMap<String, Object> extraData) {
        extraDataCache = extraData;
    }
}
