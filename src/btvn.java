import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class btvn {
    public static void main(String[] args) {
        //    Quan ly thong tin cua 1 sinh vien
//=====Bài tâp===
//1. Nhap vao ma sinh vien
//2. Nhap vao ho ten
//3. so diejnd thoại
//4. Nhập vào ngày tháng năm sinh
//5. In thông tin sinh vien
//
//    Validate dữ liệu nhập vào
//    mã sinh viên phải bắt đầu bằng chữ B sau là 3 số (VD : B200)
//    Ho ten khong chua ky tu dac biet trừ khoảng trắng có tối thiểu 10 ký tự
//    Phone Đúng định dạng Đông Lào
//    Năm sinh phải đúng yy/mmm/dd (05/10/1994)
        Scanner sc = new Scanner(System.in);
        String msv="";
        String fullName="";
        String telePhoneNumber="";
        String birtday="";
        do {
            System.out.println("=====MENU=====");
            System.out.println("1. Nhap vao ma sinh vien ");
            System.out.println("2. Nhap vao ho ten ");
            System.out.println("3. so dien thoại ");
            System.out.println("4. Nhập vào ngày tháng năm sinh ");
            System.out.println("5. In thông tin sinh vien");
            System.out.println("Mời bạn chọn: ");
            int chose = Integer.parseInt(sc.nextLine());
            switch (chose){
                case 1:
                    System.out.println("Mời bạn nhập mã sinh viên");
                    do{
                        msv = sc.nextLine();
                        // validate input
                        // Pattern pattern = Pattern.compile("(0[3|5|7|9][0-9]{8})");
                        Pattern pattern = Pattern.compile("B[0-9]{3}");
                        Matcher matcher = pattern.matcher(msv);
                        boolean check = matcher.matches();
                        if (check){
                            System.out.println("Mã sinh viên hợp lệ");
                            break;
                        } else {
                            System.out.println("Mã sinh viên không hợp lệ, mời nhập lại");
                        }
                    }while (true);
                    break;
                case  2:
                    System.out.println("Mời bạn nhập Họ và tên");
                    do{
                        fullName = sc.nextLine();
                        Pattern pattern = Pattern.compile("([a-z A-Z \s]){10,}");
                        Matcher matcher = pattern.matcher(fullName);
                        boolean check = matcher.matches();
                        if (check){
                            System.out.println("Họ và tên sinh viên hợp lệ");
                            break;
                        } else {
                            System.out.println("Họ và tên sinh viên không hợp lệ, mời nhập lại");
                        }
                    }while (true);
                    break;
                case 3:
                    System.out.println("Mời nhập sđt");
                    do {
                        telePhoneNumber = sc.nextLine();
                        Pattern pattern = Pattern.compile("(0[3579][0-9]{8})");
                        Matcher matcher = pattern.matcher(telePhoneNumber);
                        boolean check = matcher.matches();
                        if (check){
                            System.out.println("Số điện thoại hợp lệ");
                            break;
                        } else {
                            System.out.println("Số điện thoại không hợp lệ, mời nhập lại");
                        }
                    }while (true);
                    break;
                case 4:
                    System.out.println("Mời nhập ngày tháng năm sinh: ");
                    do{
                        birtday = sc.nextLine();
                        Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
                        Matcher matcher = pattern.matcher(birtday);
                        boolean check = matcher.matches();
                        if (check){
                            System.out.println("Ngày tháng năm sinh hợp lệ");
                            break;
                        } else {
                            System.out.println("Ngày tháng năm sinh hợp lệ, mời nhập lại");
                        }
                    }while (true);
                    break;
                case 5:
                    System.out.printf(" Mã sinh viên %s \n Họ và tên %s \n Số điện thoại %s \n Ngày tháng năm sinh %s ",msv,fullName,telePhoneNumber,birtday );
                    break;
                default:
                    System.out.println("Mời chọn lại từ 1-5");
            }
        } while (true);
    }
}
