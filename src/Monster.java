public class Monster {
    private String monsterName;
    private int monsterHP;
    private int monsterHit = (int) (6 + Math.random()*5);

    public Monster(String monsterName, int monsterHP) {
        this.monsterName = monsterName;
        this.monsterHP = monsterHP;
    }

    public String getMonsterName() {
        return monsterName;
    }

    private void setMonsterHP(int monsterHP) {
        this.monsterHP = monsterHP;
    }

    public int getMonsterHP() {
        return monsterHP;
    }

    public int getMonsterHit() {
        // c некотороый вероятностью промахивается
        return ((int) (1 + Math.random()*2) == 0) ? 0 : monsterHit;
    }
}
