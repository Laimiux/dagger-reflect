package com.example;

import dagger.Component;
import dagger.Dagger;

public class ComponentHolder {

    @Component(modules = {StringModule.class})
    interface MyComponent {
        @Component.Factory
        interface Factory {
            MyComponent create();
        }

        String getString();
    }

    public static MyComponent create() {
        return Dagger.factory(MyComponent.Factory.class).create();
    }
}
