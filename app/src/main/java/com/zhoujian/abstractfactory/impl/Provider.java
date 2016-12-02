package com.zhoujian.abstractfactory.impl;

/**
 * Created by zhoujian on 2016/12/1.
 *
 *
 * 接口类 Provider，返回的是接口，具体返回什么接口，由子类实现
 *
 */

public interface Provider
{
    public Sender produde();
}
