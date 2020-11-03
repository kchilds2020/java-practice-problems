

public class CamelCase {
    public static String convert(String str){
        String[] words = str.split("[_\\-]");
        str=words[0];
        for(int i=1; i<words.length; i++)
        str+=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
        return str;
    }
}
