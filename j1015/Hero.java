package j1015;

import java.security.PublicKey;

public class Hero {
    // 属性：プロパティ：メンバ変数
    String name;    //勇者の名前保存用
    int hp;         //勇者の体力保存用

    // 操作メンバ変数
    // 具体的な処理は後で書きます
    public void attack(){

    }

    public void sleep(){
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }

    public void sit(int sec){
        this.hp += sec;
        System.out.println(this.name + "は" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した！");
    }

    public void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }

    public void run(){
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは、" + this.hp + "でした");
    }
}

