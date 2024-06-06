package com.haifan.demo01.controller;

import com.haifan.demo01.Utils.XmlParserUtils;
import com.haifan.demo01.haifan.Emp;
import com.haifan.demo01.haifan.Result;
import com.haifan.demo01.service.EmpService;
import com.haifan.demo01.service.impl.EmpServiceA;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class EmpController {
    @Autowired
//    @Qualifier("empServiceB")
    @Resource (name = "empServiceA")
    private EmpService empService;
    @RequestMapping("/listEmp")
    public Result list() {
        List<Emp> empList = empService.listEmp();
        return Result.success(empList);
    }
}
