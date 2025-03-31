package parttwo;
//Дано: переменная int count, начальное значение можно указать любое.
//Напишите программу, которая выводит на экран count в степени 10, если count является чётным числом, и count в степени 3, если count нечётное.
public class TaskOne {

    public double exponentiationСonditions(double count) {
        double result;
        if ((count % 2) == 0) {
            result = Math.pow(count,10);
        }else {
            result = Math.pow(count,3);
        }
        return result;
    }
    public static void main(String[] args) {
        double count = 3;
        TaskOne taskOne = new TaskOne();
        System.out.println(taskOne.exponentiationСonditions(count));
    }
}
