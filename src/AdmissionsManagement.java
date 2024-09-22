import java.util.Scanner;

public class AdmissionsManagement {
    public static void main(String[] args) {
        float SumScore = 0,
              BenchMark;
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Mời bạn nhập điểm môn thứ nhất: ");
        SumScore += inputInfor(sc);
        System.out.print("Mời bạn nhập điểm môn thứ hai: ");
        SumScore += inputInfor(sc);
        System.out.print("Mời bạn nhập điểm môn thứ ba: ");
        SumScore += inputInfor(sc);

        System.out.println("Mời bạn nhập vào khu vực của thí sinh: \n"+
                            "A. Khu Vực A\n" + 
                            "B. Khu Vực B\n" + 
                            "C. Khu Vực C\n" + 
                            "X. Không có khu vực");
        SumScore += getLocal(sc);

        System.out.println("Nhập vào đối tường của thí sinh\n" + 
                            "1. Đối tượng 1\n" + 
                            "2. Đối tượng 2\n" +
                            "3. Đối tượng 3\n" +
                            "0. Không có đối tượng");
        SumScore += getObject(sc);
        System.out.println("Mời bạn nhập vào điểm chuẩn:");
        BenchMark = inputInfor(sc);

        if(SumScore >= BenchMark)
            System.out.println("Bạn đã đậu với: " + SumScore);
        else
             System.out.println("Bạn đã rớt với: " + SumScore);
    }

    private static float getObject(Scanner sc) {
        final float OBJ_1 = 2.5f,
                    OBJ_2 = 1.5f,
                    OBJ_3 = 1;  
        while(true)
        {
            String inputObject = sc.nextLine();
            inputObject = inputObject.trim();
            if (inputObject.equals("1")) {
                return OBJ_1;
            }else if (inputObject.equals("2")) {
                return OBJ_2;
            }else if (inputObject.equals("3")) {
                return OBJ_3;
            }else if (inputObject.equals("0")) {
                return 0;
            }else{
                System.out.println("Nhập sai vui lòng nhập lại: ");
            }
        }      
    }

    private static float getLocal(Scanner sc) {
        final float LOCAL_A = 2,
                    LOCAL_B = 1,
                    LOCAL_C = 0.5f;
       while (true) {
            String inputLocal = sc.nextLine();
            inputLocal = inputLocal.trim().toUpperCase();
            if (inputLocal.equals("A") ) {
                return LOCAL_A;
            }else if (inputLocal.equals("B")) {
                return LOCAL_B;
            }else if (inputLocal.equals("C")) {
                return LOCAL_C;
            }else if (inputLocal.equals("X")) {
                return 0;
            }else{
                System.out.println("Nhập sai vui lòng nhập lại: ");
        }    
       }    
    }

    private static float inputInfor(Scanner sc) {
        float Score;
        while (true) {
            try {
                Score = Float.parseFloat(sc.nextLine());
                return Score;
            } catch (Exception e) {
                System.err.println("lỗi " + e.getMessage());
                System.out.println("Vui lòng nhập lại: ");
            }
        }
    }
}
