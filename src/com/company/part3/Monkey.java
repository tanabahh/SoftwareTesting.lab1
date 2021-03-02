package com.company.part3;

public class Monkey extends Creature {
    private String nickname;

    public Monkey (String name, String nickname) {
        super(name);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
