package com.haifan.demo01.controller;

import com.haifan.demo01.haifan.Address;
import com.haifan.demo01.haifan.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.haifan.demo01.haifan.Result;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


@RestController
public class RequestController {
    // 非Result格式
//    @RequestMapping("/getAddr")
//    public Address getAddr() {
//        Address addr = new Address();
//        addr.setProvice("广东");
//        addr.setCity("深圳");
//
//        return addr;
//    }

    // Result格式
    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address addr = new Address();
        addr.setProvice("广东");
        addr.setCity("深圳");

//        return new Result(1, "success", "hello world");
        return Result.success(addr);
    }
}

//@RestController
//public class RequestController {
//
//    // 1. 简单参数
//    @RequestMapping("/simpleParam")
//    public String simpleParam(String name, String age) {
//        System.out.println(name);
//        System.out.println(age);
//        return "OK";
//    }
//
//    // 2. 实体参数
////    @RequestMapping("/simpleHaiFan")
////    public String simpleHaiFan(User user) {
////        System.out.println(user);
////        return user.toString();
////    }
//
//    @RequestMapping("/simpleHaiFan")
//    public String simpleHaiFan(String[] hobby) {
//        System.out.println(Arrays.toString(hobby));
//
//        return "ok";
//    }
//
//    @RequestMapping("/listParm")
//    public String listParm(@RequestParam List<String> hobby) {
//        System.out.println(hobby);
//        return "ok";
//    }
//
//    @RequestMapping("/dataParam")
//    public String listParam(@DateTimeFormat (pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
//        System.out.println(updateTime);
//        return "OK";
//    }
//
//    @RequestMapping("/jsonParam")
//    public String jsonParam(@RequestBody User user) {
//        System.out.println(user);
//        return "ok";
//    }
//
//    @RequestMapping("/path/{id}")
//    public String pathParam(@PathVariable Integer id) {
//        System.out.println(id);
//        return "true";
//    }
//
//    @RequestMapping("/path/{id}/{name}")
//    public String pathParam1(@PathVariable Integer id, @PathVariable String name) {
//        System.out.println(id);
//        System.out.println(name);
//        return "true";
//    }
//
//
//
//
//}
