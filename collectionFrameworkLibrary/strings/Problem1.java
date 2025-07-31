package collectionFrameworkLibrary.strings;

public class Problem1 {
    public static void main(String[] args) {
        String str = " -++-- ? ab  2345 abcdef 466 ";
        System.out.println(number(str));
    }

    public static int number(String str){
        int count =0;
        String num = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '+'){
                count++;
            }
            else if(str.charAt(i) == '-'){
                count = count-1;
            }
            else if(str.charAt(i) == ' '){
                continue;
            }
            else if(Character.isDigit(str.charAt(i))){
                num = num + str.charAt(i);
            }
            else{
                if(!num.equals("")){
                    break;
                }
            }
        }
        if(count<0) return Integer.parseInt(num) * -1 ;
        else return Integer.parseInt(num);
    }
}
