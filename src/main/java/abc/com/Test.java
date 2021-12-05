package abc.com;

public class Test {
    public static void main(String[] args) {
        System.out.println("\\\\" );
        String str = "jajdhfhkdf.jdhfjhf";
        System.out.println(str);
        str=str.replaceAll("\\.","C:\\\\");
        System.out.println(str);
        str=str.replace(".","C:\\");
        System.out.println(str);
        //Luu y ham replace(nhan vao la 1 mang Char)
        // Ham replaceALL va replaceFirst ( thuoc regex) nhan vao la 1 String
        // => *dau "\" va cac dau dac biet can chu y nhu sau :
        // replace(".","C:\\")   ===   replaceAll("\\.","C:\\\\")
    }
}
