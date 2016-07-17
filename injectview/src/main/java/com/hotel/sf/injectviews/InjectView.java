package com.hotel.sf.injectviews;

import android.app.Activity;

/**
 * Created by 林其望
 * data：2016/7/17
 * email: 1105896230@qq.com
 */
public class InjectView {
    public static void bind(Activity activity) {
        String clsName = activity.getClass().getName();
        try {
            Class<?> viewBindingClass = Class.forName(clsName + "$$ViewBinder");
            ViewBinder viewBinder = (ViewBinder) viewBindingClass.newInstance();
            viewBinder.bind(activity);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
