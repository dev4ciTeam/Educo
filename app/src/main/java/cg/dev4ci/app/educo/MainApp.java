package cg.dev4ci.app.educo;

import android.app.Application;
import android.content.Context;
import android.os.Build;

/**
 * Created by ricken07 on 5/5/15.
 */

public class MainApp extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context CONTEXT(){
        return mContext;
    }

    public static int VERSION_SDK(){
        return Build.VERSION.SDK_INT;
    }
}
