package com.example;

import dagger.BindsInstance;
import dagger.Component;

@Component
public interface GenericComponentBuilder {
  String value();


  @Component.Builder
  interface Builder extends GenericBuilder<GenericComponentBuilder> {
    Builder bindString(@BindsInstance String instance);
  }

  public interface GenericBuilder<Component> {
    Component build();
  }
}
