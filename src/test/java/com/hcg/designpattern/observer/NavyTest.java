package com.hcg.designpattern.observer;

import com.hcg.designpattern.observer.publish.Kuzan;
import com.hcg.designpattern.observer.publish.Sakazuki;
import com.hcg.designpattern.observer.subscribe.Luffy;
import com.hcg.designpattern.observer.subscribe.Nami;
import com.hcg.designpattern.observer.subscribe.Zoro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NavyTest {

    @Test
    public void testKuzan() {
        Kuzan kuzan = new Kuzan();
        Luffy luffy = new Luffy(kuzan.getName());
        Zoro zoro = new Zoro(kuzan.getName());
        Nami nami = new Nami(kuzan.getName());

        kuzan.chase(luffy);
        kuzan.chase(zoro);
        kuzan.chase(nami);
        Assertions.assertEquals(3, kuzan.getPirateNumber());

        kuzan.ignore(nami);
        Assertions.assertEquals(2, kuzan.getPirateNumber());

        kuzan.action();
        Assertions.assertEquals("青雉来了，打飞他！", luffy.getAnswer());
        Assertions.assertEquals("青雉来了，砍飞他！", zoro.getAnswer());
        Assertions.assertNull(nami.getAnswer());
    }

    @Test
    public void testSakazuki() {
        Sakazuki sakazuki = new Sakazuki();
        Luffy luffy = new Luffy(sakazuki.getName());
        Zoro zoro = new Zoro(sakazuki.getName());
        Nami nami = new Nami(sakazuki.getName());

        sakazuki.chase(luffy);
        sakazuki.chase(zoro);
        sakazuki.chase(nami);
        Assertions.assertEquals(3, sakazuki.getPirateNumber());

        sakazuki.action();
        Assertions.assertEquals("赤犬来了，打飞他！", luffy.getAnswer());
        Assertions.assertEquals("赤犬来了，砍飞他！", zoro.getAnswer());
        Assertions.assertEquals("赤犬来了，快跑啊！", nami.getAnswer());
    }
}
