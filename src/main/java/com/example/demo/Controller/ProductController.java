package com.example.demo.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {


    @GetMapping
    public String getAll(){
        return "Public Content";
    }

    @PostMapping
    public String addAll(@RequestParam ("abc") String abc){
        return abc;
    }

    @PutMapping
    public String updateData(){
        return "";
    }

    @DeleteMapping("/{id}")
    public void deleteData(@PathVariable("id") Long id){

    }

}
