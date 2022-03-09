package com.nugrahaas.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class IndexController {
    @GetMapping("home")
    public String home(String nama){
        nama = "Nugraha";
        return "Halo, selamat datang " + nama;
    }
}
