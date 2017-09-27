/*
 * Copyright 2017 Palantir Technologies, Inc. All rights reserved.
 */

package com.palantir.metrictag;

import com.codahale.metrics.Meter;
import java.util.Map;

public final class SimpleTaggedMeter implements TaggedMeter {
    private final Meter meter;
    private final Map<String, String> tags;

    public SimpleTaggedMeter(Meter meter, Map<String, String> tags) {
        this.meter = meter;
        this.tags = tags;
    }

    @Override
    public Map<String, String> getTags() {
        return tags;
    }

    @Override
    public long getCount() {
        return meter.getCount();
    }

    @Override
    public double getFifteenMinuteRate() {
        return meter.getFifteenMinuteRate();
    }

    @Override
    public double getFiveMinuteRate() {
        return meter.getFiveMinuteRate();
    }

    @Override
    public double getMeanRate() {
        return meter.getMeanRate();
    }

    @Override
    public double getOneMinuteRate() {
        return meter.getOneMinuteRate();
    }
}
