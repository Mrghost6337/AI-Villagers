
package com.aivillagers.component;

import java.util.ArrayList;
import java.util.List;

public class MemoryComponent {

    public static class MemoryEntry {
        public final String type;
        public final long timestamp;
        public final int severity;

        public MemoryEntry(String type, int severity) {
            this.type = type;
            this.severity = severity;
            this.timestamp = System.currentTimeMillis();
        }
    }

    private final List<MemoryEntry> memories = new ArrayList<>();

    public void remember(String type, int severity) {
        memories.add(new MemoryEntry(type, severity));
    }

    public List<MemoryEntry> getMemories() {
        return memories;
    }
}
