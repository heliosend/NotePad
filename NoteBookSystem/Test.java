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

        myNotebook.display();
        for (int i = 0; i < myNotebook.display().length; i++) {
            System.out.println(myNotebook.display()[i]);
        }
    }
}
