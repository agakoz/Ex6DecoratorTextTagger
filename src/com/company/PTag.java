package com.company;

public class PTag extends TextDecorator {

    public PTag(Text text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<p>");
        super.write();
        System.out.print("</p>");
    }
}
