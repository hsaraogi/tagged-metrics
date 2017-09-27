/*
 * Copyright 2017 Palantir Technologies, Inc. All rights reserved.
 */

package com.palantir.metrictag;

import com.codahale.metrics.Metered;
import java.util.Map;

/**
 * Created by hsaraogi on 9/27/17.
 */
public interface TaggedMeter extends Metered {
    Map<String, String> getTags();
}
