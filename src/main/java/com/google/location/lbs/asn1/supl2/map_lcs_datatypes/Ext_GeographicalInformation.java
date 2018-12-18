package com.google.location.lbs.asn1.supl2.map_lcs_datatypes;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1OctetString;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * 
 */
public  class Ext_GeographicalInformation extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_Ext_GeographicalInformation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public Ext_GeographicalInformation() {
    super();
    setMinSize(1);
setMaxSize(20);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Ext_GeographicalInformation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Ext_GeographicalInformation != null) {
      return ImmutableList.of(TAG_Ext_GeographicalInformation);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new Ext_GeographicalInformation from encoded stream.
   */
  public static Ext_GeographicalInformation fromPerUnaligned(byte[] encodedBytes) {
    Ext_GeographicalInformation result = new Ext_GeographicalInformation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Ext_GeographicalInformation from encoded stream.
   */
  public static Ext_GeographicalInformation fromPerAligned(byte[] encodedBytes) {
    Ext_GeographicalInformation result = new Ext_GeographicalInformation();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
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

  @Override protected String getTypeName() {
    return "Ext_GeographicalInformation";
  }
}