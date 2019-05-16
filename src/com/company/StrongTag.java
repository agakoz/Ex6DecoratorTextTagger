package com.company;

public class StrongTag extends TextDecorator {
    public StrongTag(Text text){
        super (text);
    }

    @Override
    public void write(){
        System.out.print("<strong>");
        super.write();
        System.out.print("</strong>");
    }
}
