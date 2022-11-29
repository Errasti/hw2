import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {

        HashMap<String, String> task_info = new HashMap<>();
        task_info.put("name", "Ivanov");
        task_info.put("country", "Russia");
        task_info.put("city", "Moscow");
        task_info.put("age", null);
        System.out.println(getQuery(task_info));
    }

    public static String getQuery(HashMap<String, String> params){

        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()){
            if (pair.getValue() != null){
                s.append(pair.getKey() + " = " + pair.getValue() + " and ");
            }
        }
        s.delete(s.toString().length() - 5, s.toString().length());
        return s.toString();


    }
}
