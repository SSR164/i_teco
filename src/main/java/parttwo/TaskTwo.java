//Дано: целочисленное 01, начальное значение можно указать любое.
//Найти количество натуральных чисел, не превосходящих n и не делящихся ни на одно из чисел 2, 3, 5.
package parttwo;

public class TaskTwo {
    public static void main(String[] args) {
        int number = 100;
        int count=0;
        for (int i = 1; i < number + 1; i++) {
            if ((i%2)!=0&&(i%3)!=0&&(i%5)!=0){
                count++;
            }
        }
        System.out.println(count);
    }


}
