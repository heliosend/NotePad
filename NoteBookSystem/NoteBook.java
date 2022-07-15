package NoteBookSystem;

import java.util.ArrayList;

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();//存放String类型的


    //向记事本中添加条目
    public void addNote(String Notebook) {
        //新条目的添加不应该有数量的限制，所以不能用数组的形式
        notes.add(Notebook);//这是ArrayList类固有方法，用于添加内容

    }

    //向特定位置添加条目
    public void addNoteInLocation(int location, String Notebook) {
        notes.add(location, Notebook);
    }

    //根据索引删除已经存在的条目
    public void removeNote(int index) {
        notes.remove(index);
    }

    //获取当前记事本中条目的数量
    public int getSize() {
        return notes.size();//Arraylist类固有，时刻记录当前容量
    }

    //根据索引获取一条特定的条目
    public String getNote(int index) {
        return notes.get(index);
    }

    // 以字符串数组的形式返回全部的条目
    public String[] display() {
        String[] ArraylistForDisplay = new String[notes.size()];
//        for (int i = 0; i < notes.size(); i++) {
//            ArraylistForDisplay[i] = notes.get(i);
//        }                                 //这是C语言模式下将链表转化为数组的方法，不使用 ↓
        notes.toArray(ArraylistForDisplay); //这是ArrayList的固有方法，用于把链表转化为数组
        return ArraylistForDisplay;
    }

}
