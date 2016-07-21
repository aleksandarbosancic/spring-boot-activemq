/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abosancic.activemq.models;

/**
 *
 * @author aleksandar
 */
public class Message {

    private final long id;
    private final String content;

    public Message(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        StringBuilder toStringBuilder;
        toStringBuilder = new StringBuilder("Greeting{");
        toStringBuilder.append("id=").append(this.id);
        toStringBuilder.append(",content=").append(this.content);
        toStringBuilder.append('}');
        return toStringBuilder.toString();
    }
}
