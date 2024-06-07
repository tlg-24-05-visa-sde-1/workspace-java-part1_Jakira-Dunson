public class FentyBeautyClient {
    public static void main(String[] args) {
        FentyBeauty fb = new FentyBeauty();
        //object1
        fb.setPrimer("Silk");
        fb.setFoundation(FoundationType.PRO_FILTR);
        fb.setConcealer(ConcealerType.PRO_FILTR_INSTANT);
        fb.setFoundationNumber(14);
        fb.setConcealerNumber(112);
        fb.setMascara("Hella Thicc Mascara");
        fb.setBlush("Cheeks Out");

        //object2
        FentyBeauty fb2 = new FentyBeauty();
        fb2.setPrimer("Power Grip");
        fb2.setFoundation(FoundationType.EAZE_DROP);
        fb2.setFoundationNumber(12);
        fb2.setConcealer(ConcealerType.HYDRATING_LONGWEAR);
        fb2.setConcealerNumber(110);
        fb2.setMascara("Anastasia");
        fb2.setBlush("Camo Liquid Blush");

        //object3
        FentyBeauty fb3 = new FentyBeauty();

        fb.whatMakeupIsUsed();
        fb2.whatMakeupIsUsed();
        fb3.whatMakeupIsUsed();

        fb.numberOfTheMakeup();
        fb2.numberOfTheMakeup();
        fb3.numberOfTheMakeup();
    }
}