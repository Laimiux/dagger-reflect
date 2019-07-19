package com.example;

import dagger.Component;
import dagger.Provides;

public interface GenericComponentInterface {

  @Component(modules = com.example.GenericComponentInterface.Module1.class)
  public interface Component1 extends HasValue<String> {
  }

  @dagger.Module
  class Module1 {
    @Provides public static String provideValue() {
      return "value";
    }
  }

  public interface HasValue<Value> {
    Value value();
  }
}
