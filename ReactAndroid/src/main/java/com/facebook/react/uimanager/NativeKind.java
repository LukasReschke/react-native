/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.react.uimanager;

public enum NativeKind {
  // Node is in the native hierarchy and the HierarchyOptimizer should assume it can host children
  // (e.g. because it's a ViewGroup). Note that it's okay if the node doesn't support children. When
  // the HierarchyOptimizer generates children manipulation commands for that node, the
  // HierarchyManager will catch this case and throw an exception.
  PARENT,
  // Node is in the native hierarchy, it may have children, but it cannot host them itself (e.g.
  // because it isn't a ViewGroup). Consequently, its children need to be hosted by an ancestor.
  LEAF,
  // Node is not in the native hierarchy.
  NONE
}
