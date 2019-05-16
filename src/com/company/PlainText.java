package com.company;

public class PlainText extends Text {

    private String content;

    public PlainText(String content) {
        setContent(content);
    }

    public PlainText() {
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void write() {
        System.out.print(content);
    }
}
