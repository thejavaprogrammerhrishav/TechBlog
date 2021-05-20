/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hdsoft.techblog.utils;

/**
 *
 * @author Programmer Hrishav
 */
public class Message {
    private final String message;
    private final String cssClass;

    public Message(String message, String cssClass) {
        this.message = message;
        this.cssClass = cssClass;
    }

    public String getMessage() {
        return message;
    }

    public String getCssClass() {
        return cssClass;
    }
}
