public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.sethIt(100);
        boss.sethEalth(500);
        boss.weapon.setNameOfWeapon("Тризубец");
        boss.weapon.setWeaponType(WeaponType.LASER);
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setStrely(45);
        skeleton.sethEalth(100);
        skeleton.sethIt(20);
        skeleton.weapon.setWeaponType(WeaponType.COLD);
        skeleton.weapon.setNameOfWeapon("uron");
        System.out.println(skeleton.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setStrely(35);
        skeleton1.sethEalth(80);
        skeleton1.sethIt(17);
        skeleton1.weapon.setWeaponType(WeaponType.NUCLEAR);
        skeleton1.weapon.setNameOfWeapon("uron");
        System.out.println(skeleton1.printInfo());
    }
}