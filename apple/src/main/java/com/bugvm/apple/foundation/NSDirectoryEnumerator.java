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
package com.bugvm.apple.foundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.security.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSDirectoryEnumerator/*</name>*/ 
    extends /*<extends>*/NSEnumerator/*</extends>*/ <NSObject>
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSDirectoryEnumeratorPtr extends Ptr<NSDirectoryEnumerator, NSDirectoryEnumeratorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSDirectoryEnumerator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSDirectoryEnumerator(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fileAttributes")
    public native NSFileAttributes getFileAttributes();
    @Property(selector = "directoryAttributes")
    public native NSFileAttributes getDirectoryAttributes();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Property(selector = "level")
    public native @MachineSizedUInt long getLevel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "skipDescendents")
    public native void skipDescendents();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "skipDescendants")
    public native void skipDescendants();
    /*</methods>*/
}
