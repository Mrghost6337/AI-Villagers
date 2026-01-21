
package com.aivillagers.ai;

import com.aivillagers.component.EmotionComponent;

public class AIVillagerBrain {

    public enum State {
        NEUTRAL,
        DISTRUST,
        CONSPIRACY,
        HOSTILE
    }

    public State evaluateState(EmotionComponent emotion) {
        if (emotion.getAnger() > 0.75f) return State.HOSTILE;
        if (emotion.getTrust() < 0.25f) return State.CONSPIRACY;
        if (emotion.getTrust() < 0.45f) return State.DISTRUST;
        return State.NEUTRAL;
    }
}
