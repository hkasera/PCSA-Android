package com.peacecorps.pcsa.utils;

import android.content.Context;
import android.widget.Toast;

import com.peacecorps.pcsa.R;

/**
 * Created by harshita.k on 15/01/16.
 */
public class Util {
    public static void showUnavailableMessage(Context context){
        if(context == null){
            return;
        }
        Toast.makeText(context, context.getString(R.string.unavailable_function), Toast.LENGTH_SHORT).show();
    }
}
