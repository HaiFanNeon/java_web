package com.haifan.demo01.service.impl;

import com.haifan.demo01.dao.EmpDao;
import com.haifan.demo01.dao.impl.EmpDaoA;
import com.haifan.demo01.haifan.Emp;
import com.haifan.demo01.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

//@Primary
@Component // 将当前类交给IOC容器管理，成为IOC容器中的bean
public class EmpServiceB implements EmpService {
    @Autowired // 运行时，IOC容器会提供该类型的bean对象，并赋值给该变量 - 依赖注入
    private EmpDao empDao;
    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();
        empList.stream().forEach(emp->{
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("女");
            } else if ("2".equals(gender)) {
                emp.setGender("男");
            }

            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
