package com.google.location.lbs.asn1.supl2.ver2_ulp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1Object;
import com.google.location.lbs.asn1.base.Asn1Sequence;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class ReportedLocation extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_ReportedLocation
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ReportedLocation() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ReportedLocation;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ReportedLocation != null) {
      return ImmutableList.of(TAG_ReportedLocation);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ReportedLocation from encoded stream.
   */
  public static ReportedLocation fromPerUnaligned(byte[] encodedBytes) {
    ReportedLocation result = new ReportedLocation();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ReportedLocation from encoded stream.
   */
  public static ReportedLocation fromPerAligned(byte[] encodedBytes) {
    ReportedLocation result = new ReportedLocation();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private LocationEncodingDescriptor locationEncodingDescriptor_;
  public LocationEncodingDescriptor getLocationEncodingDescriptor() {
    return locationEncodingDescriptor_;
  }
  /**
   * @throws ClassCastException if value is not a LocationEncodingDescriptor
   */
  public void setLocationEncodingDescriptor(Asn1Object value) {
    this.locationEncodingDescriptor_ = (LocationEncodingDescriptor) value;
  }
  public LocationEncodingDescriptor setLocationEncodingDescriptorToNewInstance() {
    locationEncodingDescriptor_ = new LocationEncodingDescriptor();
    return locationEncodingDescriptor_;
  }
  
  private LocationData locationData_;
  public LocationData getLocationData() {
    return locationData_;
  }
  /**
   * @throws ClassCastException if value is not a LocationData
   */
  public void setLocationData(Asn1Object value) {
    this.locationData_ = (LocationData) value;
  }
  public LocationData setLocationDataToNewInstance() {
    locationData_ = new LocationData();
    return locationData_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getLocationEncodingDescriptor() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationEncodingDescriptor();
          }

          @Override public void setToNewInstance() {
            setLocationEncodingDescriptorToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationEncodingDescriptor.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationEncodingDescriptor : "
                    + getLocationEncodingDescriptor().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getLocationData() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getLocationData();
          }

          @Override public void setToNewInstance() {
            setLocationDataToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? LocationData.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "locationData : "
                    + getLocationData().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
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
    builder.append("ReportedLocation = {\n");
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