package com.company.test;

import com.company.part3.Door;
import com.company.part3.Human;
import com.company.part3.Monkey;
import com.company.part3.Voice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModelTest {
    private Human human;
    private Door heavyDoor;
    private Monkey monkey;
    private Voice voice;
    private Door lightDoor;

    @BeforeEach
    public void init() {
        human = new Human("Артур", "Витягорский");
        heavyDoor = new Door("дверь кабины", true, 18, "деревянная");
        monkey = new Monkey("Обезьянка", "Мохнатая");
        voice = new Voice("тоненький");
        lightDoor = new Door("дверь шкафчика", false, 3, "стеклянная");
    }

    @Test
    public void openTheDoor() {
        Assertions.assertFalse(human.leanOnShoulder(heavyDoor));
        Assertions.assertTrue(human.leanOnShoulder(lightDoor));
    }

    @Test
    public void lockUp() {
        Assertions.assertFalse(human.lockUp(heavyDoor));
        Assertions.assertTrue(human.lockUp(lightDoor));
    }

    @Test
    public void pushIn() {
        Assertions.assertTrue(monkey.pushIn(lightDoor));
    }

    @Test
    public void squeal() {
        Assertions.assertTrue(voice.squeal("безумно"));
    }

}
