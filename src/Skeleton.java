public class   Skeleton extends Boss {
    private int strely;

    public String printInfo(){
        return "���.�����" + getStrely() + "  ���� "+ gethIt() + "/  HP" + gethEalth() + "   " + weapon.getWeaponType() +"/ "+ weapon.getNameOfWeapon();
    }

    public int getStrely() {
        return strely;
    }

    public void setStrely(int strely) {
        this.strely = strely;
    }
}