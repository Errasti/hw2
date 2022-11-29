import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int[] sortArr = {3, 56, 23, 2, 9, 11, 13, 8, 26};
        int temp;
        for (int i = sortArr.length - 1; i > 0; i--){
            logger.info(String.valueOf(i) + " проход внешнего цикла");
            for (int j = 0; j < i; j++){
                if (sortArr[j] > sortArr[j + 1]){
                    logger.info("Значение - " + String.valueOf(sortArr[j]) + ", меняем местами со значением " +
                            String.valueOf(sortArr[j + 1]));
                    temp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sortArr));
    }
}
