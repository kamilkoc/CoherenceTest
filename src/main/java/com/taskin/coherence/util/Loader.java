package com.taskin.coherence.util;

import com.taskin.coherence.interf.Source;
import com.taskin.coherence.interf.Target;

import java.util.Map;

public class Loader {
    private Source source;
    private Target target;

    public Loader(Source source, Target target) {
        this.source = source;
        this.target = target;
    }

    public void load() {
        source.beginExport();
        target.beginImport();

        for (Map<String, ?> sourceItem : source) {
            target.importItem(sourceItem);
        }

        source.endExport();
        target.endImport();
    }
}
