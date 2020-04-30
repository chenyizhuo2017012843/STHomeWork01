package entity;

import java.util.*;

public class StudentManager {
    static Scanner input = new Scanner(System.in);
    static HashMap<Integer, Student> students = new HashMap<Integer, Student>();

    public void App() {
	while (true) {
            System.out.print(
                    "请选择操作：\n"
                            + "1 插入\n"
                            + "2 查找\n"
                            + "3 删除\n"
                            + "4 修改\n"
                            + "5 输出\n"
                            + "6 退出\n"
            );
            String str = input.next();
            switch (str) {
                case "1":
                    add();
                    break;
                case "2":
                    select();
                    break;
                case "3":
                    delete();
                    break;
                case "4":
                    update();
                    break;
                case "5":
                    out();
                    break;
                case "6":
                    exit();
            }
        }
    }
 private static void add() {
        System.out.print("添加数据中\n");
        System.out.print("请输入学生ID 姓名 性别(男为true，女为false) 出生年月\n");
        int id = input.nextInt();
        String name = input.next();
        boolean gender = input.nextBoolean();
        String b = input.next();
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setBDate(bDate);
        s.setGender(gender);
        students.put(s.getId(), s);
        System.out.println("添加成功");
   }

  private static void select() {
        System.out.print("正在查找中\n");
        System.out.println("输入要查询学生的ID：");
        Integer id = input.nextInt();
        int cnt = 0;
        for (Map.Entry<Integer,Student> entry : students.entrySet()) {
            if (id.equals(entry.getKey()))
            {
                cnt++;
                System.out.print("学生ID：" + entry.getValue().getId()
                        + ", 学生姓名 ： " + entry.getValue().getName()
                        + ", 学生出生日期 ： " + entry.getValue().getBDate() 
	         +", 学生性别 ： " +entry.getValue().getGender()
                );
                  System.out.println("查询成功");
            }}
            if (cnt==0)
            {
                System.out.println("查无此人");
            }}

 private static void delete() {
        System.out.print("删除操作\n");
        System.out.println("输入要删除学生的ID：");
        int id = input.nextInt();
        Student s = new Student();
        s.setId(id);
        students.remove(s.getId());
        System.out.println("删除成功");
    }

    private static void update() {
        System.out.print("修改进行中\n");
        System.out.println("输入学生的ID：");
        int id = input.nextInt();
        Student s = students.get(id);
        System.out.println("输入要修改为的出生日期：");
        s.setBDate(input.next());
        students.put(s.getId(), s);
        System.out.println("修改结束");
    }
  
    private static void out() {
        System.out.print("输出操作\n");
        if (students.isEmpty()) {
            System.out.println("一无所有！");
        }
        else {
            ArrayList<Map.Entry<Integer,Student>> list= new ArrayList<Map.Entry<Integer,Student>>(students.entrySet());
            Collections.sort(list,new Comparator<Map.Entry<Integer,Student>>() {

                public int compare(Map.Entry<Integer,Student> o1, Map.Entry<Integer,Student> o2) {
                    return (o1.getKey() - o2.getKey());
                }
            });
            for(Map.Entry<Integer,Student> entry : list) {
                System.out.print("学生ID：" + entry.getValue().getId()
                        + ", 学生姓名 ： " + entry.getValue().getName()
                        + ", 学生出生日期 ： " + entry.getValue().getBDate()
	        +", 学生性别 ： " +entry.getValue().getGender()
                );
            }
            System.out.println("输出完毕");
        }
    }
   
    private static void exit() {
        System.out.print("退出中\n");
        System.exit(0);
    }



