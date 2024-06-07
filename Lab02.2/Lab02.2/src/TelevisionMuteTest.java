
class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 32);
        System.out.println(tv);

        tv.mute();
        tv.mute();
        tv.mute();

        System.out.println(tv);

        Television tv2 = new Television("LG");
        System.out.println(tv2);
        tv2.mute();
        System.out.println(tv2);

        tv2.setVolume(50);
        System.out.println(tv2);

        tv.oldVolume();
        System.out.println(tv);





    }
}