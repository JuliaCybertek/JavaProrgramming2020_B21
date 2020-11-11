package OfficeHours.ArraysForEachLoop;

public class ArraysPractice2 {
    public static void main(String[] args) {
        String []word={"Anna","level","Donald","Biden","Alagar","Engin","Lol"};
        int count=0;
        for(String each:word){
            char firstChar=each.toLowerCase().charAt(0);
            char lastChar=each.toLowerCase().charAt(each.length()-1);
            if(firstChar==lastChar){
              count++;
            }
        }

        System.out.println(count);
    }
}
