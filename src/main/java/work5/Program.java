package work5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Program {
    Libs lb = new Libs();

    public void printPhone(){
        for (Map.Entry <String, ArrayList<String>> listPhone: fillPhone().entrySet()) {
            System.out.println(listPhone);
        }
    } 
    public Map<String, ArrayList<String>> fillPhone() {
        String inp;
        HashMap<String, ArrayList<String>> numbers = new HashMap<>();
        do {
            inp = lb.inputStr("Введите имя или команду 'выход': \n");
            if (!Objects.equals(inp, "выход")){
                int count = lb.inputInt("Введите количество номеров телефона: ");
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < count; i++) {
                    list.add(lb.inputStr("Введите номер телефона" + (i+1) + ": "));
                }
                numbers.put(inp, list);
            }
        } while (!Objects.equals(inp, "выход"));
        return numbers;
    }
}