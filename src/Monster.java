import java.io.Serializable;

public class Monster  implements Serializable {

  private int attack;
    private int def;
    private String name;


    public Monster() {

    }


    public Monster(int attack, int def, String name) {
        this.attack = attack;
        this.def = def;
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
