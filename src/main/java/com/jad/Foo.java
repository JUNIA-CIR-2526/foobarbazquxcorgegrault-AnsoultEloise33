package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
    }
    public void addBaz(Baz baz){
        if(baz != null){
            bazs.add(baz);
        }
    }
    public Bar getBar() {
        return this.bar;
    }
    public void setBar(Bar bar) {
        this.bar = bar;
    }
    public List<Baz> getBazs() {
        return this.bazs;
    }
    public Qux getQux() {
        return this.qux;
    }
    public void setQux(Qux qux) {
        this.qux = qux;
    }
    public static void main(String[] args) {
        Bar bar = new Bar();

        Foo foo = new Foo(bar);

        Baz baz1 = new Baz();
        Baz baz2 = new Baz();
        foo.addBaz(baz1);
        foo.addBaz(baz2);

        Qux qux = new Qux();
        foo.setQux(qux);

    }
}
