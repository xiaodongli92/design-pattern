package com.xiaodong.design.pattern.observer;

/**
 * @Description:
 * @Author: lixiaodong@souyidai.com
 * @CreateDate: 2016/8/9
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String is : " + subject.getState());
    }
}
