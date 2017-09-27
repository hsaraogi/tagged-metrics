/*
 * Copyright 2017 Palantir Technologies, Inc. All rights reserved.
 */

package com.palantir.metrictag;

import java.util.Map;

public abstract class TaggedMetric<T> implements Ta {
    public abstract Map<String, String> getTag();
}