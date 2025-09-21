package com.jad;

public class Main {
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
