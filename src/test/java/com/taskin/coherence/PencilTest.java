package com.taskin.coherence;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import com.taskin.coherence.stuff.Pencil;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: taskin
 * Date: 04.04.2011
 * Time: 00:52
 * To change this template use File | Settings | File Templates.
 */
public class PencilTest {

    @Test
    public void testPencil() {
        Pencil p = new Pencil();
        for (String s : p) {
            System.out.println(s);
        }
    }

    @Test
    public void xxx() {
        NamedCache c = CacheFactory.getCache("taskinDeneme");
        c.put(1, "bir1");
        c.put(2, "iki2");
        c.put(3, "uc3");
    }
}
