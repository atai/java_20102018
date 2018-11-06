package Lesson_1;

public class Test {
}



// 1 --------------------------
//class Mountain {
//    static String name = "Himalaya";
//    static Mountain getMountain() {
//        System.out.println("Getting Name ");
//        return null;
//    }
//    public static void main(String[ ] args) {
//        System.out.println( getMountain().name );
//    }
//}
// -----------------------------------















// 2 ---------------------
//class Test2 {
//    static void method(int... a) {
//        System.out.println("inside int...");
//    }
//    static void method(long a, long b) {
//        System.out.println("inside long");
//    }
//    static void method(Integer a, Integer b) {
//        System.out.println("inside INTEGER");
//    }
//    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//        method(a,b);
//    }
//}
// ------------------------------










// 3 -------------------
//class Test4 {
//    public static void main(String[] args) {
//        String str = null;
//        int x = 10;
//        if(x < 0 && str.equals("hello")) {
//            System.out.println("java");
//        }
//
//    }
//}
//--------------------










//class Test1 {
//    public static void main(String[] args) {
//        int i = 5;
//        System.out.print(i++);
//        System.out.print(++i);
//        System.out.print(i + 1);
//        System.out.print(i);
//
//    }
//}


//




















class Application {
    public static void main(String[] args) {
        infoT(1);
    }

    public static void infoT(int arg) {
        if(arg < 37) {
            infoT(arg + 10);
        }
        System.out.println(arg);
    }
}