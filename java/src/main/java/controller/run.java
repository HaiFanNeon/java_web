package controller;

import dao.impl.UserDaoImpl;
import pojo.Admin;
import pojo.User;


import java.util.Scanner;

public class run {
    static UserDaoImpl userdaoimpl = new UserDaoImpl();
    public static void main(String[] args) {



        Admin admin = new Admin();
        while (true) {
            System.out.print("请输入用户名>>");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            System.out.print("请输入密码>>");
            String password = sc.nextLine();
            if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {{
                System.out.println("登录成功");
                break;
            }}
        }

        while (true) {
            int meun = Meun();
            switch (meun) {
                case 1:
                    Insert();
                    break;
                case 2:
                    Delete();
                    break;
                case 3:
                    Select();
                    break;
                case 4:
                    SelectAll();
                    break;
                case -1:
                    return;
                default:
                    System.out.println("选项有误");
                    break;
            }
        }
    }


    private static void SelectAll() {
        userdaoimpl.SellectAll();
    }

    private static void Select() {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入id>>");
        int id = sc.nextInt();
        userdaoimpl.Select(id);
    }

    private static void Delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入id>>");
        int id = sc.nextInt();
        userdaoimpl.delete(id);
    }

    private static void Insert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入用户名>>");
        String name = sc.nextLine();
        System.out.print("输入性别>>");
        String gender = sc.nextLine();
        System.out.print("输入电话号>>");
        String tel = sc.nextLine();
        System.out.print("是否添加为特别关心>>");
        boolean coll = sc.hasNext();
        User user = new User(name, gender, tel, coll);
        userdaoimpl.insert(user);
    }

    public static int Meun() {
        System.out.println("1.插入联系人");
        System.out.println("2.删除联系人");
        System.out.println("3.查询联系人");
        System.out.println("4.浏览联系人");
        System.out.println("-1.退出程序");
        System.out.print("输入选项>>");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }

}
