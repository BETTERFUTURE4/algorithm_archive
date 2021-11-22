public class UnitConverter {
    // 필요한 상수 정의
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double POUNDS_PER_KILOGRAM = (double) 1 / 0.45359237;
    public static final double CENTIMETERS_PER_INCH = 2.54;
    public static final double INCHES_PER_CENTIMETER = (double) 1 / 2.54;

    public static double toPounds(double kilograms) {
        // 메소드 내부를 채워주세요
        return kilograms * KILOGRAMS_PER_POUND;
    }
    public static double toKilograms(double pounds) {
        // 메소드 내부를 채워주세요
        return pounds * POUNDS_PER_KILOGRAM;
    }
    public static double toCentimeters(double inches) {
        // 메소드 내부를 채워주세요
        return  inches * INCHES_PER_CENTIMETER;
    }
    public static double toInches(double centimeters) {
        // 메소드 내부를 채워주세요
        return centimeters * CENTIMETERS_PER_INCH;
    }
    public static double toFahrenheit(double celsius) {
        // 메소드 내부를 채워주세요
    }
    public static double toCelsius(double fahrenheit) {
        // 메소드 내부를 채워주세요
    }
}