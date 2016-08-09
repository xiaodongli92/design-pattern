package com.xiaodong.design.pattern.observer;

/**
 * @Description:
 * @Author: lixiaodong@souyidai.com
 * @CreateDate: 2016/8/9
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
