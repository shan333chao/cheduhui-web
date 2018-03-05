package com.cheduhui;

import com.blade.Blade;

public class Application {
    public static void main(String[] args) {
        Blade blade = Blade.me();
                blade.templateEngine();
               blade .start(Application.class, args);
    }
}
