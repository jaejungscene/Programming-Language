package Design_pattern.Structural.adapter;

public class Person {
    public static void main(String[] args) {
        /** references
         * https://refactoring.guru/design-patterns/adapter
         */

        KoreanChargeHoleImpl koreanChargeHole = new KoreanChargeHoleImpl(5.0);

        USAChargerImpl usaCharger01 = new USAChargerImpl(5.0);
        USAChargerImpl usaCharger02 = new USAChargerImpl(10.0);

        //KoreanChargeHole and USACharger do not fit.
//        System.out.println(
//                koreanChargeHole.fit(usaCharger01)
//        ); //error
//        System.out.println(
//                koreanChargeHole.fit(usaCharger02)
//        ); //error

        USAChargerAdapter usaChargerAdapter01 = new USAChargerAdapter(usaCharger01);
        USAChargerAdapter usaChargerAdapter02 = new USAChargerAdapter(usaCharger02);

        System.out.println(
                koreanChargeHole.fit(usaChargerAdapter01)
        );
        System.out.println(
                koreanChargeHole.fit(usaChargerAdapter02)
        );
    }
}