package com.hotel.sf.injectviews;

/**
 * Created by 林其望
 * data：2016/7/17
 * email: 1105896230@qq.com
 */
public interface ViewBinder<T> {
    void bind(T target);
}
