package parttwo;
//Дано: целочисленное число n, начальное значение может быть любое.
//Напишите программу, которая определяет: (можно сделать не все варианты, а выбрать понравившийся)
//а) количество цифр в нем;
//б) сумму его цифр;
//в) произведение его цифр;
//г) среднее арифметическое его цифр;
//д) сумму квадратов его цифр;
//е) сумму кубов его цифр;
//ж) его первую цифру;
//з) сумму его первой и последней цифр.

public class TaskFore {
    public static void main(String[] args) {
        int nomberA = 50;
        int resoltA = 0;
        for (int i=0; nomberA != 0; i++) {
            resoltA++;
            nomberA /= 10;

        }

        System.out.println("А="+resoltA);

        int nomberB = 555;
        int nomberBBB=0;
        while (nomberB != 0) {
            int nomberBB = nomberB % 10;
            nomberBBB=nomberBB+nomberBBB;
            nomberB /= 10;

        }
        System.out.println("B="+nomberBBB);


        int nomberC = 555;
        int nomberCCC=1;
        while (nomberC != 0) {
            int nomberCC = nomberC % 10;
            nomberCCC=nomberCC*nomberCCC;
            nomberC /= 10;

        }
        System.out.println("C="+nomberCCC);
    }


}