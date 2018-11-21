package ren.solid.library;

import com.youlu.skinloader.base.SkinBaseApplication;

import ren.solid.library.utils.ToastUtils;

/**
 * Created by _SOLID
 * Date:2016/3/30
 * Time:20:59
 */
public class SolidApplication extends SkinBaseApplication {
    private static SolidApplication mInstance;

    public static SolidApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        ToastUtils.init(this);
    }
}
