package homework9;

public class StringTest1 {
    public static void main(String[] args) {


        String s1 = "java";
        String s2 = "hello";
        String sum = s1 + s2;
        String reversed = new StringBuilder(sum).reverse().toString();
        System.out.println(sum);
        System.out.println(reversed);

        char[] array = {'I',' ','l','i','k','?',' ', 'J','a','v','a'};
        String s = new String(array);
        s = s.replace("?","!");
        System.out.println(s);

        String a = "I";
        char[] a1 = {'l','i','k','e'};
        String like = new String(a1);
        String likeREvers = new StringBuilder(like).reverse().toString();
        System.out.println(likeREvers);

        char[] a2 = {'J','a','v','a'};
        String java = new String(a2);
        String javaRevers = new StringBuilder(java).reverse().toString();
        System.out.println(javaRevers);

        String revers = a +" "+ likeREvers+" " + javaRevers;
        System.out.println(revers);
    }





}
