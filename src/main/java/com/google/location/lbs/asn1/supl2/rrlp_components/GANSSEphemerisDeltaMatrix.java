package com.google.location.lbs.asn1.supl2.rrlp_components;

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
public  class GANSSEphemerisDeltaMatrix
    extends Asn1SequenceOf<GANSSEphemerisDeltaEpoch> {
  //

  private static final Asn1Tag TAG_GANSSEphemerisDeltaMatrix
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public GANSSEphemerisDeltaMatrix() {
    super();
    setMinSize(1);
setMaxSize(128);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_GANSSEphemerisDeltaMatrix;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_GANSSEphemerisDeltaMatrix != null) {
      return ImmutableList.of(TAG_GANSSEphemerisDeltaMatrix);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new GANSSEphemerisDeltaMatrix from encoded stream.
   */
  public static GANSSEphemerisDeltaMatrix fromPerUnaligned(byte[] encodedBytes) {
    GANSSEphemerisDeltaMatrix result = new GANSSEphemerisDeltaMatrix();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new GANSSEphemerisDeltaMatrix from encoded stream.
   */
  public static GANSSEphemerisDeltaMatrix fromPerAligned(byte[] encodedBytes) {
    GANSSEphemerisDeltaMatrix result = new GANSSEphemerisDeltaMatrix();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSSEphemerisDeltaEpoch createAndAddValue() {
    GANSSEphemerisDeltaEpoch value = new GANSSEphemerisDeltaEpoch();
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
    builder.append("GANSSEphemerisDeltaMatrix = [\n");
    final String internalIndent = indent + "  ";
    for (GANSSEphemerisDeltaEpoch value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}