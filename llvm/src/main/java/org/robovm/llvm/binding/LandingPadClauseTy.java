/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.llvm.binding;

public enum LandingPadClauseTy {
  LandingPadCatch,
  LandingPadFilter;

  public final int swigValue() {
    return swigValue;
  }

  public static LandingPadClauseTy swigToEnum(int swigValue) {
    LandingPadClauseTy[] swigValues = LandingPadClauseTy.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (LandingPadClauseTy swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + LandingPadClauseTy.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private LandingPadClauseTy() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private LandingPadClauseTy(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private LandingPadClauseTy(LandingPadClauseTy swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
