package com.company;

public class EmTag extends TextDecorator {
    public EmTag(Text text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<em>");
        super.write();
        System.out.print("</em>");
    }


}
