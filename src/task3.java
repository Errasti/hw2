import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        HashMap<String, String> task_info_one = new HashMap<>();
        HashMap<String, String> task_info_two = new HashMap<>();
        HashMap<String, String> task_info_three = new HashMap<>();
        List<HashMap> marksList = new ArrayList<>();
        task_info_one.put("Фамилия", "Иванов");
        task_info_one.put("Оценка", "5");
        task_info_one.put("Предмет", "Математика");
        marksList.add(task_info_one);
        task_info_two.put("Фамилия", "Петрова");
        task_info_two.put("Оценка", "4");
        task_info_two.put("Предмет", "Информатика");
        marksList.add(task_info_two);
        task_info_three.put("Фамилия", "Краснов");
        task_info_three.put("Оценка", "5");
        task_info_three.put("Предмет", "Физика");
        marksList.add(task_info_three);
        System.out.println(marksList.toString());
        System.out.println(listParse(marksList));

    }
    public static String listParse(List<HashMap> marks){
        HashMap<String, String> temp = new HashMap<>();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < marks.size(); i++){
            temp = marks.get(i);
            s.append("Студент " + temp.get("Фамилия") + " получил " + temp.get("Оценка") + " по " + temp.get("Предмет")
            + "\n");
        }
        return s.toString();
    }
}
