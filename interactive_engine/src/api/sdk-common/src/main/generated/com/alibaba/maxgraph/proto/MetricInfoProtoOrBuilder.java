// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/common.proto

package com.alibaba.maxgraph.proto;

public interface MetricInfoProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MetricInfoProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; metricInfo = 1;</code>
   */
  int getMetricInfoCount();
  /**
   * <code>map&lt;string, string&gt; metricInfo = 1;</code>
   */
  boolean containsMetricInfo(
      java.lang.String key);
  /**
   * Use {@link #getMetricInfoMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetricInfo();
  /**
   * <code>map&lt;string, string&gt; metricInfo = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetricInfoMap();
  /**
   * <code>map&lt;string, string&gt; metricInfo = 1;</code>
   */

  java.lang.String getMetricInfoOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; metricInfo = 1;</code>
   */

  java.lang.String getMetricInfoOrThrow(
      java.lang.String key);

  /**
   * <code>repeated .DiskMetricProto diskMetrics = 2;</code>
   */
  java.util.List<com.alibaba.maxgraph.proto.DiskMetricProto> 
      getDiskMetricsList();
  /**
   * <code>repeated .DiskMetricProto diskMetrics = 2;</code>
   */
  com.alibaba.maxgraph.proto.DiskMetricProto getDiskMetrics(int index);
  /**
   * <code>repeated .DiskMetricProto diskMetrics = 2;</code>
   */
  int getDiskMetricsCount();
  /**
   * <code>repeated .DiskMetricProto diskMetrics = 2;</code>
   */
  java.util.List<? extends com.alibaba.maxgraph.proto.DiskMetricProtoOrBuilder> 
      getDiskMetricsOrBuilderList();
  /**
   * <code>repeated .DiskMetricProto diskMetrics = 2;</code>
   */
  com.alibaba.maxgraph.proto.DiskMetricProtoOrBuilder getDiskMetricsOrBuilder(
      int index);
}
