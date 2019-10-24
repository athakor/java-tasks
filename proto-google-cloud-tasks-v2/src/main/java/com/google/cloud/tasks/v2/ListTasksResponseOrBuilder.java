/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/tasks/v2/cloudtasks.proto

package com.google.cloud.tasks.v2;

public interface ListTasksResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.ListTasksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2.Task tasks = 1;</code>
   */
  java.util.List<com.google.cloud.tasks.v2.Task> getTasksList();
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2.Task tasks = 1;</code>
   */
  com.google.cloud.tasks.v2.Task getTasks(int index);
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2.Task tasks = 1;</code>
   */
  int getTasksCount();
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2.Task tasks = 1;</code>
   */
  java.util.List<? extends com.google.cloud.tasks.v2.TaskOrBuilder> getTasksOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2.Task tasks = 1;</code>
   */
  com.google.cloud.tasks.v2.TaskOrBuilder getTasksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * To return the next page of results, call
   * [ListTasks][google.cloud.tasks.v2.CloudTasks.ListTasks] with this value as the
   * [page_token][google.cloud.tasks.v2.ListTasksRequest.page_token].
   * If the next_page_token is empty, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * To return the next page of results, call
   * [ListTasks][google.cloud.tasks.v2.CloudTasks.ListTasks] with this value as the
   * [page_token][google.cloud.tasks.v2.ListTasksRequest.page_token].
   * If the next_page_token is empty, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
