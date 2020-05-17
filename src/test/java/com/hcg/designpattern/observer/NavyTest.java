package com.hcg.designpattern.observer;

import com.hcg.designpattern.observer.publish.Colonel;
import com.hcg.designpattern.observer.publish.General;
import com.hcg.designpattern.observer.subscribe.Gunman;
import com.hcg.designpattern.observer.subscribe.Killer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NavyTest {

    @Test
    public void testGeneral() {
        General general = new General();
        Killer killer = new Killer(general.getName());
        Gunman gunman = new Gunman(general.getName());

        general.chase(killer);
        general.chase(gunman);
        Assertions.assertEquals(2, general.getPirateNumber());

        general.ignore(gunman);
        Assertions.assertEquals(1, general.getPirateNumber());

        general.action();
        Assertions.assertEquals("大将来了，砍飞他！", killer.getAnswer());
        Assertions.assertNull(gunman.getAnswer());
    }

    @Test
    public void testColonel() {
        Colonel colonel = new Colonel();
        Killer killer = new Killer(colonel.getName());
        Gunman gunman = new Gunman(colonel.getName());

        colonel.chase(killer);
        colonel.chase(gunman);
        Assertions.assertEquals(2, colonel.getPirateNumber());

        colonel.action();
        Assertions.assertEquals("上校来了，砍飞他！", killer.getAnswer());
        Assertions.assertEquals("上校来了，快跑啊！", gunman.getAnswer());
    }
}
