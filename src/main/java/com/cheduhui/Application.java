package com.cheduhui;

import com.blade.Blade;
import com.blade.mvc.view.template.JetbrickTemplateEngine;

public class Application {
    public static void main(String[] args) {
        Blade blade = Blade.me();
        blade.bannerText("cheduhui");
        blade.threadName("thread-");
               blade .start(Application.class, args);
    }
}
