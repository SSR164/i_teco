package parttwo;

//Дано: строка str,  начальное значение можно указать любое.
//Напишите программу, которая удаляет в строке все лишние пробелы, то есть серии подряд идущих пробелов заменяет на одиночные пробелы. Крайние пробелы в строке также должны удалиться.
//Пример: str = " привет,   в этой    строке лишние   пробелы.  "
//Результат: "привет, в этой строке лишние пробелы"
public class TaskThree {
    public static void main(String[] args) {
        String str = " привет,   в этой    строке лишние   пробелы.  ";
        String str2="привет, в этой строке лишние пробелы.";
        String result=str.trim().replaceAll("\\s+", " ");
        if (result.equals(str2)) {
            System.out.println(result);
        }else {
            System.out.println("Есть лишние пробелы");
        }
    }


}
