package com.taskin.coherence.interf;

import java.util.Map;

public interface Source extends Iterable<Map<String, ?>> {
    void beginExport();

    void endExport();
}
