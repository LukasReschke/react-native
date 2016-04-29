/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 * <p/>
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.react.modules.fresco;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;

/** Extended ImageRequest with request headers */
public class NetworkImageRequest extends ImageRequest {

  /** Headers for the request */
  private final ReadableMap mHeaders;

  public static NetworkImageRequest fromBuilder(ImageRequestBuilder builder,
                                                ReadableMap headers) {
    return new NetworkImageRequest(builder, headers);
  }

  protected NetworkImageRequest(ImageRequestBuilder builder, ReadableMap headers) {
    super(builder);
    this.mHeaders = headers;
  }

  public ReadableMap getHeaders() {
    return mHeaders;
  }
}
