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
// source: google/cloud/tasks/v2beta2/queue.proto

package com.google.cloud.tasks.v2beta2;

public interface RateLimitsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.RateLimits)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The maximum rate at which tasks are dispatched from this queue.
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   * * For [App Engine queues][google.cloud.tasks.v2beta2.AppEngineHttpTarget], the maximum allowed value
   *   is 500.
   * * This field is output only   for [pull queues][google.cloud.tasks.v2beta2.PullTarget]. In addition to the
   *   `max_tasks_dispatched_per_second` limit, a maximum of 10 QPS of
   *   [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] requests are allowed per pull queue.
   * This field has the same meaning as
   * [rate in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
   * </pre>
   *
   * <code>double max_tasks_dispatched_per_second = 1;</code>
   *
   * @return The maxTasksDispatchedPerSecond.
   */
  double getMaxTasksDispatchedPerSecond();

  /**
   *
   *
   * <pre>
   * Output only. The max burst size.
   * Max burst size limits how fast tasks in queue are processed when
   * many tasks are in the queue and the rate is high. This field
   * allows the queue to have a high rate so processing starts shortly
   * after a task is enqueued, but still limits resource usage when
   * many tasks are enqueued in a short period of time.
   * The [token bucket](https://wikipedia.org/wiki/Token_Bucket)
   * algorithm is used to control the rate of task dispatches. Each
   * queue has a token bucket that holds tokens, up to the maximum
   * specified by `max_burst_size`. Each time a task is dispatched, a
   * token is removed from the bucket. Tasks will be dispatched until
   * the queue's bucket runs out of tokens. The bucket will be
   * continuously refilled with new tokens based on
   * [max_tasks_dispatched_per_second][google.cloud.tasks.v2beta2.RateLimits.max_tasks_dispatched_per_second].
   * Cloud Tasks will pick the value of `max_burst_size` based on the
   * value of
   * [max_tasks_dispatched_per_second][google.cloud.tasks.v2beta2.RateLimits.max_tasks_dispatched_per_second].
   * For App Engine queues that were created or updated using
   * `queue.yaml/xml`, `max_burst_size` is equal to
   * [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size).
   * Since `max_burst_size` is output only, if
   * [UpdateQueue][google.cloud.tasks.v2beta2.CloudTasks.UpdateQueue] is called on a queue
   * created by `queue.yaml/xml`, `max_burst_size` will be reset based
   * on the value of
   * [max_tasks_dispatched_per_second][google.cloud.tasks.v2beta2.RateLimits.max_tasks_dispatched_per_second],
   * regardless of whether
   * [max_tasks_dispatched_per_second][google.cloud.tasks.v2beta2.RateLimits.max_tasks_dispatched_per_second]
   * is updated.
   * </pre>
   *
   * <code>int32 max_burst_size = 2;</code>
   *
   * @return The maxBurstSize.
   */
  int getMaxBurstSize();

  /**
   *
   *
   * <pre>
   * The maximum number of concurrent tasks that Cloud Tasks allows
   * to be dispatched for this queue. After this threshold has been
   * reached, Cloud Tasks stops dispatching tasks until the number of
   * concurrent requests decreases.
   * If unspecified when the queue is created, Cloud Tasks will pick the
   * default.
   * The maximum allowed value is 5,000.
   * This field is output only for
   * [pull queues][google.cloud.tasks.v2beta2.PullTarget] and always -1, which indicates no limit. No other
   * queue types can have `max_concurrent_tasks` set to -1.
   * This field has the same meaning as
   * [max_concurrent_requests in
   * queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
   * </pre>
   *
   * <code>int32 max_concurrent_tasks = 3;</code>
   *
   * @return The maxConcurrentTasks.
   */
  int getMaxConcurrentTasks();
}
