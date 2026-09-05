package LamdaExpression;

import java.util.ArrayList;


class Main{
    public static void main(String[] args) {
//        AO t=(a,b)->{
//            try {
//                System.out.println(a + b);
//                System.out.println(a - b);
//                System.out.println(a * b);
//                System.out.println(a / b);
//            }
//            catch(ArithmeticException e)
//            {
//                System.out.println("ArithmeticException Occured dont divide by 0");
//            }
//        };
//        t.calculate(10,0);
//        AO t=(num)->{
//            for(int i : num)
//            {
//                System.out.println(i);
//
//            }
//
//        };
//        //int[] num={1,2,3,4,5};
//        t.arr(new int[] {1,2,3,4,5});
//        AO t=(name)->{
//          return name;
//        };
//        String[] s =t.takename(new String[] {"kedar","vedant","ravi"});
//        for(String p:s){
//            System.out.println(p+" ");
//        }
//        AO t=(s)->{
//            System.out.println(s.getId());
//            System.out.println(s.getName());
//            System.out.println(s.getDept());
//        };
//        Student ss=new Student(1,"kedar","AIMl");
//        t.takeStudent(ss);
//        AO t=(s)->{
//            for(Student sk:s){
//                System.out.println(sk.getId());
//                System.out.println(sk.getName());
//                System.out.println(sk.getDept());
//                System.out.println("============");
//            }
//        };
//        Student s1=new Student(1,"raja","it");
//        Student s2=new Student(2,"rani","aiml");
//        Student[] s=new Student[2];
//        s[0]=s1;
//        s[1]=s2;
//        t.takeStudent(s);
        AO t=(s)->{
             for(Student a:s)
             {
                 System.out.println(a.getDept());
             }
        };
        ArrayList<Student> a1=new ArrayList<>();
        a1.add(new Student(1,"kedar","it"));
        a1.add(new Student(2,"pawan","aiml"));
        t.takestudents(a1);



    }
}
