package com.haifan.demo01.dao.impl;

import com.haifan.demo01.Utils.XmlParserUtils;
import com.haifan.demo01.dao.EmpDao;
import com.haifan.demo01.haifan.Emp;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

//@Component // 将当前类交给IOC容器管理，成为IOC容器中的bean
@Repository (value = "daoA")
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        String file = Objects.requireNonNull(this.getClass().getClassLoader().getResource("emp.xml")).getFile();
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        return empList;
    }
}
