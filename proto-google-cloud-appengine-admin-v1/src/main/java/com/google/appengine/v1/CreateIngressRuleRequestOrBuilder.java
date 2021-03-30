/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

public interface CreateIngressRuleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.CreateIngressRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the parent Firewall collection in which to create a new rule.
   * Example: `apps/myapp/firewall/ingressRules`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Name of the parent Firewall collection in which to create a new rule.
   * Example: `apps/myapp/firewall/ingressRules`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * A FirewallRule containing the new resource.
   * The user may optionally provide a position at which the new rule will be
   * placed. The positions define a sequential list starting at 1. If a rule
   * already exists at the given position, rules greater than the provided
   * position will be moved forward by one.
   * If no position is provided, the server will place the rule as the second to
   * last rule in the sequence before the required default allow-all or deny-all
   * rule.
   * </pre>
   *
   * <code>.google.appengine.v1.FirewallRule rule = 2;</code>
   *
   * @return Whether the rule field is set.
   */
  boolean hasRule();
  /**
   *
   *
   * <pre>
   * A FirewallRule containing the new resource.
   * The user may optionally provide a position at which the new rule will be
   * placed. The positions define a sequential list starting at 1. If a rule
   * already exists at the given position, rules greater than the provided
   * position will be moved forward by one.
   * If no position is provided, the server will place the rule as the second to
   * last rule in the sequence before the required default allow-all or deny-all
   * rule.
   * </pre>
   *
   * <code>.google.appengine.v1.FirewallRule rule = 2;</code>
   *
   * @return The rule.
   */
  com.google.appengine.v1.firewall.FirewallRule getRule();
  /**
   *
   *
   * <pre>
   * A FirewallRule containing the new resource.
   * The user may optionally provide a position at which the new rule will be
   * placed. The positions define a sequential list starting at 1. If a rule
   * already exists at the given position, rules greater than the provided
   * position will be moved forward by one.
   * If no position is provided, the server will place the rule as the second to
   * last rule in the sequence before the required default allow-all or deny-all
   * rule.
   * </pre>
   *
   * <code>.google.appengine.v1.FirewallRule rule = 2;</code>
   */
  com.google.appengine.v1.firewall.FirewallRuleOrBuilder getRuleOrBuilder();
}
