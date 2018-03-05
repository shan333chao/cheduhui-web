package com.cheduhui.config;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;

/**
 * Created by HenDiao on 2018/3/4.
 */
@Bean
public class TemplateConfig implements BeanProcessor {

    @Override
    public void processor(Blade blade) {
        blade.templateEngine(new JetbrickTemplateEngine());
    }

}