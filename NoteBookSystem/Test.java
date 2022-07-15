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
        
        //----------------对象数组的测试------------------------------
        String[] s = new String[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = "" + i;
        }
        for (String element : s) {
            System.out.println(element);
        }

        Value[] arrayOfValue=new Value[10];
        for(int i=0;i< arrayOfValue.length;i++){
            arrayOfValue[i]=new Value();
            //————***注意***————
            // 在定义了一个对象数组之后，还需要在每一步进行一次实体化，因为数组中存的只是分配好的地址，并没有一个实体
            arrayOfValue[i].setValue(i);
        }
        for(Value element:arrayOfValue){
            System.out.println(element.getValue());
        }

        //----------------Object类的学习---------------------------
        Object obj=new Object();
        obj="ss";    obj=1;    obj=2.3;    obj='s';    obj=true;
        //Object类，表明是任意类型的变量，可以任意赋值


    }
}
