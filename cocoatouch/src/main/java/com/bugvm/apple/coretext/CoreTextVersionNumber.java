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
package com.bugvm.apple.coretext;

/*<imports>*/
import com.bugvm.apple.foundation.CocoaUtility;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreText")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CoreTextVersionNumber/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CoreTextVersionNumber.class); }/*</bind>*/
    /*<constants>*/
    public static final int Version10_5 = 0x00020000;
    public static final int Version10_5_2 = 0x00020001;
    public static final int Version10_5_3 = 0x00020002;
    public static final int Version10_5_5 = 0x00020003;
    public static final int Version10_6 = 0x00030000;
    public static final int Version10_7 = 0x00040000;
    public static final int Version10_8 = 0x00050000;
    public static final int Version10_9 = 0x00060000;
    public static final int Version10_10 = 0x00070000;
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Bridge(symbol="CTGetCoreTextVersion", optional=true)
    public static native int getVersion();
    /*</methods>*/
}