package com.xiaodong.design.pattern.observer;

/**
 * @Description:
 * @Author: lixiaodong@souyidai.com
 * @CreateDate: 2016/8/9
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String is : " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
