package Session06;

public abstract class Hero {
    int atk;
    protected int hp;
    int mp;
    private int lvl;

    public int getlvl(){
        return lvl;
    }

    public Hero(){
        lvl = 1;
    }
    
    public void attack(Hero enemy){
        enemy.hp -= this.atk;
    }

    public Hero(int lvl){
        this.lvl = lvl;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getHp(){
        return hp;
    }

    public abstract void skill1(Hero target);
}
