package com.interregnum.component;

/**
 * @author Interregnum
 * @version 9/6/17
 */
public interface MessageSender<T> {

    void send(T message);

}