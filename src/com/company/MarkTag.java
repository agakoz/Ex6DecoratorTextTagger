package com.company;

public class MarkTag extends TextDecorator {
    public MarkTag(Text text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<mark>");
        super.write();
        System.out.print("</mark>");
    }
}
