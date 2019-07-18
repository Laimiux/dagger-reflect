package com.example

class ComponentBuilderGenericBuild {



    interface GenericBuilder<Component> {
        Component build();
    }
}
