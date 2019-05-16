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

//eyrewolwerowany rewolwerowiec, całkiem spoko klawiatura, ciężko mi sie pisze bo inny układ ale git, wygodna :)

}
