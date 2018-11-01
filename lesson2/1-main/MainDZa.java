//    1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
//         при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
//          Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//          должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
//    3. В методе main() вызвать полученный метод,
//          обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.

public class MainDZa {

    public static void main(String[] args) {
        String[][] arrayForCheckOne = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"5", "6", "7", "8"}, {"1", "2", "3", "4"}};
        System.out.println(CheckArray(arrayForCheckOne));
        String[][] arrayForCheckTwo = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"5", "6", "7", "8"}}; //MyArraySizeException
        System.out.println(CheckArray(arrayForCheckTwo));
        String[][] arrayForCheckThree = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"5", "6", "7", "8"}, {"1", "Two", "3", "4"}}; //MyArrayDataException
        System.out.println(CheckArray(arrayForCheckThree));
    }

    private static int CheckArray(String[][] arrayForCheck) {
        int intReturn=0;
        try {
            MyArraySizeCheck(arrayForCheck.length);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        for (int y = 0; y < arrayForCheck.length ; y++) {
            try {
                MyArraySizeCheck(arrayForCheck[y].length);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
            for (int x = 0; x < arrayForCheck[y].length ; x++) {
//                try {
//                    intReturn += Integer.parseInt(arrayForCheck[y][x]);
//                }catch (MyArrayDataException e){
//            }
        }
        return intReturn;
    }
    private void MyArraySizeCheck(int length) throws MyArraySizeException{
        if (length!=4){
            //MyArrayDataException
            throw new MyArraySizeException("");
        }
    }

}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
        System.out.println("Длина массива не равна 4!");
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message, int positionX, int positionY) {
        super(message);
        System.out.println(String.format("Ошибочные данные в ячейке %1 строки %2", positionX, positionY));
    }
}