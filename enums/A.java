package enums;

enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY
}



public class A {

    enum Months{
    JANUARY(3), FEBRUARY(4), MARCH(5), APRIL(6);
    
    private int value;
    private Months(int value){
    this.value = value;
    }
}

    public static void main(String[] args) {
        for(Days ele: Days.values()){
            System.out.print(ele + " ");
        }
        System.out.println();
        Days[] arr = Days.values();
        System.out.println(arr[0]);
        System.out.println(Days.valueOf("MONDAY"));
        System.out.println(Days.TUESDAY.ordinal());

        for(Months ele: Months.values()){
            System.out.println(ele + " " + ele.value );
        }

        Days obj = Days.MONDAY;

        switch (obj) {
            case MONDAY:
                System.out.println("Monday... switch..");
                break;
            case TUESDAY:
                System.out.println("Tuesday..");
            case WEDNESDAY:
                System.out.println("Wednesday..");
            default:
                break;
        }
    }
}
