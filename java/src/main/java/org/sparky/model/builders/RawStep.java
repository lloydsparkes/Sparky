package org.sparky.model.builders;

/**
 * Created by lloyd on 17/10/2015.
 */
public class RawStep implements Step {
    private final String raw;

    public RawStep(String raw) {
        this.raw = raw;
    }

    public String getRaw() {
        return raw;
    }
}
