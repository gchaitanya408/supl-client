package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1SequenceOf;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class GPS_TOW_Assist
    extends Asn1SequenceOf<GPS_TOW_AssistElement> {
  //

  private static final Asn1Tag TAG_GPS_TOW_Assist
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GPS_TOW_Assist() {
    super();
    setMinSize(1);
setMaxSize(64);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GPS_TOW_Assist;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GPS_TOW_Assist != null) {
      return ImmutableList.of(TAG_GPS_TOW_Assist);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GPS_TOW_Assist from encoded stream.
   */
  public static GPS_TOW_Assist fromPerUnaligned(byte[] encodedBytes) {
    GPS_TOW_Assist result = new GPS_TOW_Assist();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GPS_TOW_Assist from encoded stream.
   */
  public static GPS_TOW_Assist fromPerAligned(byte[] encodedBytes) {
    GPS_TOW_Assist result = new GPS_TOW_Assist();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GPS_TOW_AssistElement createAndAddValue() {
    GPS_TOW_AssistElement value = new GPS_TOW_AssistElement();
    add(value);
    return value;
  }

  

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("GPS_TOW_Assist = [\n");
    final String internalIndent = indent + "  ";
    for (GPS_TOW_AssistElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}