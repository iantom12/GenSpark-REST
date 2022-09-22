package com.genspark.SnackManagement.Controller;

import com.genspark.SnackManagement.Entity.Snacks;
import com.genspark.SnackManagement.Service.SnackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private SnackService x;

    @GetMapping("/")
    public String home(){
        return "<HTML><H1> Welcome to my Snack Management System</H1></HTML>";
    }

    @GetMapping("/snacks")
    public List<Snacks> getAllSnacks(){
        return this.x.getAllSnacks();
    }
    @GetMapping("/snacks/{name}")
    public Snacks getSnack(@PathVariable String name){
        return this.x.getSnackByName(name);
    }
    @PostMapping("/snacks")
    public Snacks addSnack(@RequestBody Snacks snacks){
        return this.x.addSnack(snacks);
    }
    @PutMapping("/snacks")
    public Snacks updateSnack(@RequestBody Snacks snacks){
        return this.x.updateSnack(snacks);
    }
    @DeleteMapping("/snacks/{name}")
    public String deleteSnack(@PathVariable String name){
        return this.x.deleteSnackByName(name);
    }


}
