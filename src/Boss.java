public class Boss extends GameEntity{
    Weapon weapon = new Weapon();


    public  String printInfo(){
        return "Health"+gethEalth() + " урон" + gethIt() + "/  " + weapon.getWeaponType() +" /// "+ weapon.getNameOfWeapon();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


}