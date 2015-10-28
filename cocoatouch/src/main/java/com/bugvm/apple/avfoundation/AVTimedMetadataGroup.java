/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.avfoundation;

/*<imports>*/

import com.bugvm.apple.corefoundation.CFType;
import com.bugvm.apple.coremedia.CMFormatDescription;
import com.bugvm.apple.coremedia.CMSampleBuffer;
import com.bugvm.apple.coremedia.CMTimeRange;
import com.bugvm.apple.foundation.NSArray;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVTimedMetadataGroup/*</name>*/ 
    extends /*<extends>*/AVMetadataGroup/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVTimedMetadataGroupPtr extends Ptr<AVTimedMetadataGroup, AVTimedMetadataGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVTimedMetadataGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVTimedMetadataGroup() {}
    protected AVTimedMetadataGroup(SkipInit skipInit) { super(skipInit); }
    public AVTimedMetadataGroup(NSArray<AVMetadataItem> items, @ByVal CMTimeRange timeRange) { super((SkipInit) null); initObject(init(items, timeRange)); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    public AVTimedMetadataGroup(CMSampleBuffer sampleBuffer) { super((SkipInit) null); initObject(init(sampleBuffer)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "items")
    public native NSArray<AVMetadataItem> getItems();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithItems:timeRange:")
    protected native @Pointer long init(NSArray<AVMetadataItem> items, @ByVal CMTimeRange timeRange);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "initWithSampleBuffer:")
    protected native @Pointer long init(CMSampleBuffer sampleBuffer);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @WeaklyLinked
    @Method(selector = "copyFormatDescription")
    public native @com.bugvm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class)
    CMFormatDescription getFormatDescription();
    /*</methods>*/
}