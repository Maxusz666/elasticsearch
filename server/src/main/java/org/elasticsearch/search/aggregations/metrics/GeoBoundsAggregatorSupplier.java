/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0 and the Server Side Public License, v 1; you may not use this file except
 * in compliance with, at your election, the Elastic License 2.0 or the Server
 * Side Public License, v 1.
 */

package org.elasticsearch.search.aggregations.metrics;

import org.elasticsearch.search.aggregations.Aggregator;
import org.elasticsearch.search.aggregations.support.AggregationContext;
import org.elasticsearch.search.aggregations.support.ValuesSourceConfig;

import java.io.IOException;
import java.util.Map;

@FunctionalInterface
public interface GeoBoundsAggregatorSupplier {

    MetricsAggregator build(
        String name,
        AggregationContext context,
        Aggregator parent,
        ValuesSourceConfig valuesSourceConfig,
        boolean wrapLongitude,
        Map<String, Object> metadata
    ) throws IOException;
}
