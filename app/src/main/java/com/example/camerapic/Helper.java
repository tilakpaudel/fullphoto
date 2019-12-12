package com.example.camerapic;

import android.content.Context;

public class Helper {
    public int dpToPx(int dp, Context context) {
        float density = context.getResources()
                .getDisplayMetrics()
                .density;
        return Math.round((float) dp * density);
    }
}
