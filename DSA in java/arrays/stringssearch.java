public class stringssearch{
    public static void main(String[] args) {
        String str="Ayush";
        char c = 'u';
        System.out.println(search(str,c));
    }

    static boolean search(String str, char c)
    {
        if(str.length()==0){
            return false;}
            for(int i=0;i<str.length();i++){
                if(c== str.charAt(i))
                return true;
            }
            return false;
        }
            }
