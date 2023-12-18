package ru.wolfnord.lab12;

import java.util.Stack;

public class Task1 {
    Stack<Integer> fp, sp;

    public Task1(String fp, String sp) {
        this.fp = new Stack<>();
        this.sp = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.fp.push(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.push(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count <= 106){
            if(fp.peek() > sp.peek()
                    && sp.peek() != 0){
                pushBack(fp, fp.pop());
                pushBack(fp, sp.pop());
            }else{
                pushBack(sp, fp.pop());
                pushBack(sp, sp.pop());
            }
            count++;
        }
        if (count >= 106)
            return "botva";
        else {
            String res = "";
            if(fp.isEmpty()) res += "second ";
            else res += "first ";
            res += count;
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1("92101", "82378").play());
        System.out.println(new Task1("72411", "19328").play());
        System.out.println(new Task1("26171", "21992").play());
    }

}
