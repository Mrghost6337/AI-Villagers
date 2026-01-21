
package com.aivillagers.component;

public class EmotionComponent {

    private float trust = 0.5f;
    private float fear = 0.0f;
    private float anger = 0.0f;
    private float greed = 0.2f;
    private float intelligence = 0.5f;

    public void onAttack() {
        trust = Math.max(0f, trust - 0.25f);
        fear = Math.min(1f, fear + 0.35f);
        anger = Math.min(1f, anger + 0.45f);
    }

    public void onTrade() {
        trust = Math.min(1f, trust + 0.15f);
        greed = Math.min(1f, greed + 0.05f);
    }

    public float getTrust() { return trust; }
    public float getFear() { return fear; }
    public float getAnger() { return anger; }
}
