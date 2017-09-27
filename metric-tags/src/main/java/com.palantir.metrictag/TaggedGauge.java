/*
 * Copyright 2017 Palantir Technologies, Inc. All rights reserved.
 */

package com.palantir.metrictag;

import com.codahale.metrics.Gauge;
import java.util.Map;

public interface TaggedGauge<T> extends Gauge<T> {
    Map<String, String> getTags();
}
