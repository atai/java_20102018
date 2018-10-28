//        Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
//        С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.
//
//        Возвращает кол-во оставшихся рабочих часов до конца
//        недели по заданному текущему дню. Считается, что
//        текущий день ещё не начался, и рабочие часы за него
//        должны учитываться.
//
//    public class DayOfWeekMain {
//
//    public static void main(final String[] args) {
//        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
//    }

public class DayOfWeekMain {
    enum DayOfWeek {

        SUNDAY(0), MONDAY(40), TUESDAY(32), WENSDAY(24), THURSDAY(16), FRIDAY(8), SATADAY(0);

        private int workHourRemain;

        DayOfWeek(int workHourRemain) {
            this.workHourRemain = workHourRemain;
        }

        public int getWorkHourRemain() {
            return workHourRemain;
        }
    }

    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
        System.out.println(getWorkingHours(DayOfWeek.FRIDAY));
    }

    private static int getWorkingHours(DayOfWeek dow) {

        return dow.getWorkHourRemain();
    }

}