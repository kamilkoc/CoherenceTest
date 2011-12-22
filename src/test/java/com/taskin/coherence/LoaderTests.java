package com.taskin.coherence;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import com.taskin.coherence.interf.Source;
import com.taskin.coherence.source.Country;
import static org.junit.Assert.assertEquals;

import com.taskin.coherence.util.CoherenceTarget;
import com.taskin.coherence.util.CsvSource;
import com.taskin.coherence.util.Loader;
import org.junit.Before;
import org.junit.Test;

public class LoaderTests {
    public static final NamedCache countries = CacheFactory.getCache("countries");

    @Before
    public void clearCache() {
        //countries.clear();
    }

    @Test
    public void testCsvToCoherenceLoader() {
        Source source = new CsvSource("countries.csv");
        CoherenceTarget target = new CoherenceTarget("countries", Country.class, "code");
        target.setBatchSize(50);
        Loader loader = new Loader(source, target);
        loader.load();

        assertEquals(207, countries.size());

        Country srb = (Country) countries.get("SRB");
        assertEquals("Serbia", srb.getName());
        assertEquals("Belgrade", srb.getCapital());
        assertEquals("RSD", srb.getCurrencySymbol());
        assertEquals("Dinar", srb.getCurrencyName());
    }
}
