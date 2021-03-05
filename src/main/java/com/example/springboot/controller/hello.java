package com.example.springboot.controller;

import com.example.springboot.Entity.Alian;
import com.example.springboot.Repo.AlianRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hello {

    @Autowired
    AlianRepo alianRepo;
    @RequestMapping("home")
    public String home() {
        System.out.println("inside home");
        return "home.html";
    }

    @RequestMapping("save")
    public String save(Alian alian){
        System.out.println(alian);
        alianRepo.save(alian);
        return "index.html";
    }

}
