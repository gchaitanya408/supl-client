// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.location.suplclient.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class HorizontalVelocityWithUncertainty extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_HorizontalVelocityWithUncertainty
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public HorizontalVelocityWithUncertainty() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_HorizontalVelocityWithUncertainty;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_HorizontalVelocityWithUncertainty != null) {
      return ImmutableList.of(TAG_HorizontalVelocityWithUncertainty);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new HorizontalVelocityWithUncertainty from encoded stream.
   */
  public static HorizontalVelocityWithUncertainty fromPerUnaligned(byte[] encodedBytes) {
    HorizontalVelocityWithUncertainty result = new HorizontalVelocityWithUncertainty();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new HorizontalVelocityWithUncertainty from encoded stream.
   */
  public static HorizontalVelocityWithUncertainty fromPerAligned(byte[] encodedBytes) {
    HorizontalVelocityWithUncertainty result = new HorizontalVelocityWithUncertainty();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return false;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private HorizontalVelocityWithUncertainty.bearingType bearing_;
  public HorizontalVelocityWithUncertainty.bearingType getBearing() {
    return bearing_;
  }
  /**
   * @throws ClassCastException if value is not a HorizontalVelocityWithUncertainty.bearingType
   */
  public void setBearing(Asn1Object value) {
    this.bearing_ = (HorizontalVelocityWithUncertainty.bearingType) value;
  }
  public HorizontalVelocityWithUncertainty.bearingType setBearingToNewInstance() {
    bearing_ = new HorizontalVelocityWithUncertainty.bearingType();
    return bearing_;
  }
  
  private HorizontalVelocityWithUncertainty.horizontalSpeedType horizontalSpeed_;
  public HorizontalVelocityWithUncertainty.horizontalSpeedType getHorizontalSpeed() {
    return horizontalSpeed_;
  }
  /**
   * @throws ClassCastException if value is not a HorizontalVelocityWithUncertainty.horizontalSpeedType
   */
  public void setHorizontalSpeed(Asn1Object value) {
    this.horizontalSpeed_ = (HorizontalVelocityWithUncertainty.horizontalSpeedType) value;
  }
  public HorizontalVelocityWithUncertainty.horizontalSpeedType setHorizontalSpeedToNewInstance() {
    horizontalSpeed_ = new HorizontalVelocityWithUncertainty.horizontalSpeedType();
    return horizontalSpeed_;
  }
  
  private HorizontalVelocityWithUncertainty.uncertaintySpeedType uncertaintySpeed_;
  public HorizontalVelocityWithUncertainty.uncertaintySpeedType getUncertaintySpeed() {
    return uncertaintySpeed_;
  }
  /**
   * @throws ClassCastException if value is not a HorizontalVelocityWithUncertainty.uncertaintySpeedType
   */
  public void setUncertaintySpeed(Asn1Object value) {
    this.uncertaintySpeed_ = (HorizontalVelocityWithUncertainty.uncertaintySpeedType) value;
  }
  public HorizontalVelocityWithUncertainty.uncertaintySpeedType setUncertaintySpeedToNewInstance() {
    uncertaintySpeed_ = new HorizontalVelocityWithUncertainty.uncertaintySpeedType();
    return uncertaintySpeed_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBearing() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBearing();
          }

          @Override public void setToNewInstance() {
            setBearingToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HorizontalVelocityWithUncertainty.bearingType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "bearing : "
                    + getBearing().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getHorizontalSpeed() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getHorizontalSpeed();
          }

          @Override public void setToNewInstance() {
            setHorizontalSpeedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HorizontalVelocityWithUncertainty.horizontalSpeedType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "horizontalSpeed : "
                    + getHorizontalSpeed().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getUncertaintySpeed() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getUncertaintySpeed();
          }

          @Override public void setToNewInstance() {
            setUncertaintySpeedToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? HorizontalVelocityWithUncertainty.uncertaintySpeedType.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "uncertaintySpeed : "
                    + getUncertaintySpeed().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class bearingType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_bearingType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bearingType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("359"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bearingType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bearingType != null) {
      return ImmutableList.of(TAG_bearingType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bearingType from encoded stream.
   */
  public static bearingType fromPerUnaligned(byte[] encodedBytes) {
    bearingType result = new bearingType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bearingType from encoded stream.
   */
  public static bearingType fromPerAligned(byte[] encodedBytes) {
    bearingType result = new bearingType();
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

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "bearingType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class horizontalSpeedType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_horizontalSpeedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public horizontalSpeedType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("2047"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_horizontalSpeedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_horizontalSpeedType != null) {
      return ImmutableList.of(TAG_horizontalSpeedType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new horizontalSpeedType from encoded stream.
   */
  public static horizontalSpeedType fromPerUnaligned(byte[] encodedBytes) {
    horizontalSpeedType result = new horizontalSpeedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new horizontalSpeedType from encoded stream.
   */
  public static horizontalSpeedType fromPerAligned(byte[] encodedBytes) {
    horizontalSpeedType result = new horizontalSpeedType();
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

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "horizontalSpeedType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class uncertaintySpeedType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_uncertaintySpeedType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public uncertaintySpeedType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("255"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_uncertaintySpeedType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_uncertaintySpeedType != null) {
      return ImmutableList.of(TAG_uncertaintySpeedType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new uncertaintySpeedType from encoded stream.
   */
  public static uncertaintySpeedType fromPerUnaligned(byte[] encodedBytes) {
    uncertaintySpeedType result = new uncertaintySpeedType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new uncertaintySpeedType from encoded stream.
   */
  public static uncertaintySpeedType fromPerAligned(byte[] encodedBytes) {
    uncertaintySpeedType result = new uncertaintySpeedType();
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

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "uncertaintySpeedType = " + getInteger() + ";\n";
  }
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
    builder.append("HorizontalVelocityWithUncertainty = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}
