package com.cheduhui.controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Request;
import com.blade.mvc.http.Response;

@Path
public class IndexController {

    @GetRoute("/test")
    public void test(Request req, Response res){

        res.text("testComplate");



    }

    @GetRoute("/")
    public String home(){
        return "index.html";
    }

    @GetRoute("/index")
    public String index(){
        return "index.html";
    }

    @GetRoute("/about")
    public String about(){
        return "about.html";
    }

    @GetRoute("/contact")
    public String contact(){
        return "contact.html";
    }
    @GetRoute("/join")
    public String join(){
        return "join.html";
    }
    @GetRoute("/login")
    public String login(){
        return "login.html";
    }

    @GetRoute("/news")
    public String news(){
        return "news.html";
    }

    @GetRoute("/news-content")
    public String newsContent(){
        return "news-content.html";
    }
    @GetRoute("/product1")
    public String product1(){
        return "product1.html";
    }
    @GetRoute("/product2")
    public String product2(){
        return "product2.html";
    }
    @GetRoute("/product3")
    public String product3(){
        return "product3.html";
    }

    @GetRoute("/register")
    public String register(){
        return "register.html";
    }
    @GetRoute("/solution")
    public String solution(){
        return "solution.html";
    }

    @GetRoute("/example")
    public String example(){
        return "example.html";
    }
    @GetRoute("/404-dark")
    public String notFoundDark(){
        return "404-dark.html";
    }
    @GetRoute("/404-light")
    public String notFoundlight(){
        return "404-light.html";
    }
    @GetRoute("/error-500")
    public String error500(){
        return "404-dark.html";
    }

}
