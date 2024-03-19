import java.util.ArrayList;
import java.util.List;

public class Palindrome_Linked_List {
    public static boolean palindrome(List<Integer> num) {
        List<Integer> list = num;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != list.get(list.size() - i - 1) ){
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {

        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(2);
        test.add(1);

        boolean result = palindrome(test);

        System.out.println(result);
    }


}
