package A;

import java.math.*;
import java.text.NumberFormat;
import java.util.Locale;
//import com.ibm.icu.text.Normalizer;


public class Test27 {
    public static String formatCurrency(double value, int cs) {
        NumberFormat format;
        if(cs==1)
            format = NumberFormat.getCurrencyInstance(new Locale("en", "US")); //"en" "US" => Hoa Kỳ
        else if(cs==2)
            format = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")); //"vi" "VN" => Việt Nam
        else
        format = NumberFormat.getCurrencyInstance(new Locale("ja", "JP")); //"ja" "JP" => Nhật Bản
        
        
        format.setMinimumFractionDigits(2);//Thêm 2 số 0 cuối khi biến truyền vào ít hon 2 chữ số thập phân
        format.setMaximumFractionDigits(5);//Số thập phân tối đa (sau dấu phẩy)
        format.setRoundingMode(RoundingMode.HALF_EVEN);
        return format.format(value);
    }

    public static void main(String[] args) {
        //BigDecimal bigDecimal = new BigDecimal(22121.455);
        //System.out.println("bigDecimal = " + formatCurrency(bigDecimal.doubleValue()));

        System.out.println("Money = "+ formatCurrency(55,1));
        System.out.println("Money = "+ formatCurrency(55,2));
        System.out.println("Money = "+ formatCurrency(55,3));
    }
}
