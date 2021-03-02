package com.company.part3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ModelTest {
    private Human human;
    private Door heavyDoor;
    private Monkey monkey;
    private Voice voice;
    private Door lightDoor;

    @Before
    public void init() {
        human = new Human("Артур", "Витягорский");
        heavyDoor = new Door("дверь кабины", true, 18, "деревянная");
        monkey = new Monkey("Обезьянка", "Мохнатая");
        voice = new Voice("тоненький");
        lightDoor = new Door("дверь шкафчика", false, 3, "стеклянная");
    }

    @Test
    public void openTheDoor() {
        Assert.assertFalse(human.leanOnShoulder(heavyDoor));
        Assert.assertTrue(human.leanOnShoulder(lightDoor));
    }

    @Test
    public void lockUp() {
        Assert.assertFalse(human.lockUp(heavyDoor));
        Assert.assertTrue(human.lockUp(lightDoor));
    }

    @Test
    public void pushIn() {
        Assert.assertTrue(monkey.pushIn(lightDoor));
    }

    @Test
    public void squeal() {
        Assert.assertTrue(voice.squeal("безумно"));
    }

}
