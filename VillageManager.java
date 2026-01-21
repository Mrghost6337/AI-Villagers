
package com.aivillagers.village;

import java.util.HashMap;
import java.util.UUID;

public class VillageManager {

    private static final HashMap<UUID, Integer> collectiveReputation = new HashMap<>();

    public static void adjustReputation(UUID player, int amount) {
        collectiveReputation.put(player,
                collectiveReputation.getOrDefault(player, 0) + amount);
    }

    public static int getReputation(UUID player) {
        return collectiveReputation.getOrDefault(player, 0);
    }
}
