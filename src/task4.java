import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task4 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task4.class.getName());
        FileHandler fh = new FileHandler("log_calc.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        String[] nums = new String[3];
        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пример используя ('+', '-', '*', '/')");
        String problem = scan.nextLine();
        logger.info("Пользователь ввёл пример: " + problem);
        if(problem.contains("+")) {
            nums = problem.split(" ");
            for (int i = 0; i < nums.length; i++) {
                if (isNumeric(nums[i])) {
                    result += Integer.parseInt(nums[i]);
                }
            }
        }
        if(problem.contains("-")){
            nums = problem.split(" ");
            int num_one = Integer.parseInt(nums[0]);
            for (int i = 1; i < nums.length; i++){
                if(isNumeric(nums[i])){
                    result = num_one - Integer.parseInt(nums[i]);
                }
            }
        }
        if(problem.contains("*")) {
            result = 1;
            nums = problem.split(" ");
            for (int i = 0; i < nums.length; i++) {
                if (isNumeric(nums[i])) {
                    result *= Integer.parseInt(nums[i]);
                }
            }
        }
        if(problem.contains("/")){
            nums = problem.split(" ");
            int num_one = Integer.parseInt(nums[0]);
            for (int i = 1; i < nums.length; i++){
                if(isNumeric(nums[i])){
                    result = num_one / Integer.parseInt(nums[i]);
                }
            }
        }
        logger.info("И получил результат " + String.valueOf(result));
        System.out.printf("Результат = %d", result);
    }

    public static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit);

    }
}
