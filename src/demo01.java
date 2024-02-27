import java.nio.channels.FileLock;

public class demo01 {
    public static void main(String[] args) {
        String fullName = "nguyen hong ngoc";
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(1));
        System.out.println(fullName.concat(" Xinh gai"));
        System.out.println(fullName);
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());
        String msv = " BV001 ";
        msv.trim();
        System.out.println(msv.trim().length());
        String address = "nguyen hong ngoc";
        System.out.println(fullName.equals(address));
        System.out.println(fullName.compareTo(address));
        fullName = "nguyen van anh";
        System.out.println(fullName.contains("van"));
        String[] sv = {"cat", "dog","pig","vk"};
        // tim xem mang sinh vien cos dog hay k
        /*for (int i = 0; i < sv.length; i++) {
            if (sv[i].equals("dog")){
                System.out.println("co");
                break;
            } else {
                System.out.println("khong");
            }*/
        boolean check = false;
        for (String item : sv) {
            if (item.equals("dog")){
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("cos dog");
        } else {
            System.out.println("k co dog");
        }
    }
}
