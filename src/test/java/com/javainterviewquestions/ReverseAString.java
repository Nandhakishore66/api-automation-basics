package com.javainterviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseAString {
    String given = "mandela";
    public void usingStringBuffer() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(given);
        System.out.println(buffer.reverse());
    }

    public void usingOurOwnLogic() {
        String given = "nelsan a good boy";
        String reverse = "";
        System.out.println(given.charAt(0));
        char[] charArray = given.toCharArray();
        for(int i=charArray.length-1; i>=0; i--){
            reverse= reverse+charArray[i];
        }
        System.out.println(reverse);
    }

    public void usingCollections() {
        String name = "nandha";
        char[] charArray = name.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for(Character value : charArray) {
            arrayList.add(value);
        }
        Collections.reverse(arrayList);
        ListIterator<Character> iterator = arrayList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ReverseAString reverseAString = new ReverseAString();
        //reverseAString.usingStringBuffer();
        //reverseAString.usingOurOwnLogic();
        reverseAString.usingCollections();
    }
}
