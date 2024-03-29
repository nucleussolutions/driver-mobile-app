// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: home/kevintan/driver-mobile-app/app/src/main/proto/gtfs-realtime.proto at 38:1
package com.google.transit.realtime;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * The contents of a feed message.
 * A feed is a continuous stream of feed messages. Each message in the stream is
 * obtained as a response to an appropriate HTTP GET request.
 * A realtime feed is always defined with relation to an existing GTFS feed.
 * All the entity ids are resolved with respect to the GTFS feed.
 * Note that "required" and "optional" as stated in this file refer to Protocol
 * Buffer cardinality, not semantic cardinality.  See reference.md at
 * https://github.com/google/transit/tree/master/gtfs-realtime for field
 * semantic cardinality.
 */
public final class FeedMessage extends Message<FeedMessage, FeedMessage.Builder> {
  public static final ProtoAdapter<FeedMessage> ADAPTER = new ProtoAdapter_FeedMessage();

  private static final long serialVersionUID = 0L;

  /**
   * Metadata about this feed and feed message.
   */
  @WireField(
      tag = 1,
      adapter = "com.google.transit.realtime.FeedHeader#ADAPTER",
      label = WireField.Label.REQUIRED
  )
  public final FeedHeader header;

  /**
   * Contents of the feed.
   */
  @WireField(
      tag = 2,
      adapter = "com.google.transit.realtime.FeedEntity#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<FeedEntity> entity;

  public FeedMessage(FeedHeader header, List<FeedEntity> entity) {
    this(header, entity, ByteString.EMPTY);
  }

  public FeedMessage(FeedHeader header, List<FeedEntity> entity, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.header = header;
    this.entity = Internal.immutableCopyOf("entity", entity);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.header = header;
    builder.entity = Internal.copyOf("entity", entity);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FeedMessage)) return false;
    FeedMessage o = (FeedMessage) other;
    return unknownFields().equals(o.unknownFields())
        && header.equals(o.header)
        && entity.equals(o.entity);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + header.hashCode();
      result = result * 37 + entity.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(", header=").append(header);
    if (!entity.isEmpty()) builder.append(", entity=").append(entity);
    return builder.replace(0, 2, "FeedMessage{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<FeedMessage, Builder> {
    public FeedHeader header;

    public List<FeedEntity> entity;

    public Builder() {
      entity = Internal.newMutableList();
    }

    /**
     * Metadata about this feed and feed message.
     */
    public Builder header(FeedHeader header) {
      this.header = header;
      return this;
    }

    /**
     * Contents of the feed.
     */
    public Builder entity(List<FeedEntity> entity) {
      Internal.checkElementsNotNull(entity);
      this.entity = entity;
      return this;
    }

    @Override
    public FeedMessage build() {
      if (header == null) {
        throw Internal.missingRequiredFields(header, "header");
      }
      return new FeedMessage(header, entity, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_FeedMessage extends ProtoAdapter<FeedMessage> {
    ProtoAdapter_FeedMessage() {
      super(FieldEncoding.LENGTH_DELIMITED, FeedMessage.class);
    }

    @Override
    public int encodedSize(FeedMessage value) {
      return FeedHeader.ADAPTER.encodedSizeWithTag(1, value.header)
          + FeedEntity.ADAPTER.asRepeated().encodedSizeWithTag(2, value.entity)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, FeedMessage value) throws IOException {
      FeedHeader.ADAPTER.encodeWithTag(writer, 1, value.header);
      FeedEntity.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.entity);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public FeedMessage decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.header(FeedHeader.ADAPTER.decode(reader)); break;
          case 2: builder.entity.add(FeedEntity.ADAPTER.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public FeedMessage redact(FeedMessage value) {
      Builder builder = value.newBuilder();
      builder.header = FeedHeader.ADAPTER.redact(builder.header);
      Internal.redactElements(builder.entity, FeedEntity.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
