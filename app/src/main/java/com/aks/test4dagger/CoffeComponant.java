package com.aks.test4dagger;


import dagger.Component;


@Component(modules = CoffeeModule.class)
public interface CoffeComponant {

    Coffee getCoffee();

    public void Inject(MainActivity mainActivity);
}
