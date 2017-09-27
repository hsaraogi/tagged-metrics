/*
 * Copyright 2017 Palantir Technologies, Inc. All rights reserved.
 */

package com.palantir.metrictag;

import com.codahale.metrics.Gauge;
import java.util.Map;

public final class SimpleTaggedGauge<T> implements TaggedGauge<T> {
    private final Gauge<T> gauge;
    private final Map<String, String> tags;

    public SimpleTaggedGauge(Gauge<T> gauge, Map<String, String> tags) {
        this.gauge = gauge;
        this.tags = tags;
    }

    @Override
    public Map<String, String> getTags() {
        return tags;
    }

    @Override
    public T getValue() {
        return gauge.getValue();
    }
}
