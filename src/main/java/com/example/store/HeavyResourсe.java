package com.example.store;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HeavyResourсe {   
    public HeavyResourсe() {
        System.out.println("HeavyResourсe is created");
    }
}
