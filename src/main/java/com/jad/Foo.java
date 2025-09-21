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
}
