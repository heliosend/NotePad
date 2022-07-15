package NoteBookSystem;

public class Test {
    public static void main(String[] args) {
        NoteBook myNotebook = new NoteBook();
        myNotebook.addNote("第一条测试记录");
        myNotebook.addNote("第二条测试记录");
        myNotebook.addNote("第三条测试记录");
        myNotebook.addNote("第四条测试记录");
        myNotebook.addNote("第五条测试记录");
        for (int i = 0; i < myNotebook.getSize(); i++) {
            System.out.println(myNotebook.getNote(i));
        }
        System.out.println("——————————————————————————————");

        myNotebook.addNoteInLocation(2, "在2号位插入测试记录");
        for (int i = 0; i < myNotebook.getSize(); i++) {
            System.out.println(myNotebook.getNote(i));
        }
        System.out.println("——————————————————————————————");

        myNotebook.removeNote(3);
        for (int i = 0; i < myNotebook.getSize(); i++) {
            System.out.println(myNotebook.getNote(i));
        }
        System.out.println("——————————————————————————————");

       //for(type element: array)  {    循环内容，对element进行操作    }
        //For-Each 循环或者加强型循环，它能在不使用下标的情况下遍历数组。
        for (String element : myNotebook.display()) {
            System.out.println(element);
        }
    }
}
