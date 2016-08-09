package com.xiaodong.design.pattern.observer;

/**
 * @Description:
 * @Author: lixiaodong@souyidai.com
 * @CreateDate: 2016/8/9
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("first state is 15 :");
        subject.setState(15);
        System.out.println("second state is 10 :");
        subject.setState(10);
    }
}
