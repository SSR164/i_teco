package parttwo;
//Дано: строка str, начальное значение может быть любое.
//Напишите программу, считающую количество цифр 1, 2, 3 в строке.
//Пример: str = "сегодня мы купили 1 яблоко, 1 грушу и 2 апельсина"
//Кол-во 1: 2
//Кол-во 2: 1
//Кол-во 3: 0
public class TaskFive {
    public static void main(String[] args) {
        String string = "сегодня мы купили 1 яблоко, 1 грушу и 2 апельсина";
        char[] charArray = string.toCharArray();
        int one = 0;
        int two = 0;
        int three = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '1') {
                one++;
            }
            if (charArray[i] == '2') {
                two++;
            }
            if (charArray[i] == '3') {
                three++;
            }
        }
        System.out.println("Кол-во 1: "+one);
        System.out.println("Кол-во 2: "+two);
        System.out.println("Кол-во 3: "+three);
    }
}
