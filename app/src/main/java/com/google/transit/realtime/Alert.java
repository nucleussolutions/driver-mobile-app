// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: home/kevintan/driver-mobile-app/app/src/main/proto/gtfs-realtime.proto at 376:1
package com.google.transit.realtime;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
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
 * An alert, indicating some sort of incident in the public transit network.
 */
public final class Alert extends Message<Alert, Alert.Builder> {
  public static final ProtoAdapter<Alert> ADAPTER = new ProtoAdapter_Alert();

  private static final long serialVersionUID = 0L;

  public static final Cause DEFAULT_CAUSE = Cause.UNKNOWN_CAUSE;

  public static final Effect DEFAULT_EFFECT = Effect.UNKNOWN_EFFECT;

  /**
   * Time when the alert should be shown to the user. If missing, the
   * alert will be shown as long as it appears in the feed.
   * If multiple ranges are given, the alert will be shown during all of them.
   */
  @WireField(
      tag = 1,
      adapter = "com.google.transit.realtime.TimeRange#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<TimeRange> active_period;

  /**
   * Entities whose users we should notify of this alert.
   */
  @WireField(
      tag = 5,
      adapter = "com.google.transit.realtime.EntitySelector#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<EntitySelector> informed_entity;

  @WireField(
      tag = 6,
      adapter = "com.google.transit.realtime.Alert$Cause#ADAPTER"
  )
  public final Cause cause;

  @WireField(
      tag = 7,
      adapter = "com.google.transit.realtime.Alert$Effect#ADAPTER"
  )
  public final Effect effect;

  /**
   * The URL which provides additional information about the alert.
   */
  @WireField(
      tag = 8,
      adapter = "com.google.transit.realtime.TranslatedString#ADAPTER"
  )
  public final TranslatedString url;

  /**
   * Alert header. Contains a short summary of the alert text as plain-text.
   */
  @WireField(
      tag = 10,
      adapter = "com.google.transit.realtime.TranslatedString#ADAPTER"
  )
  public final TranslatedString header_text;

  /**
   * Full description for the alert as plain-text. The information in the
   * description should add to the information of the header.
   */
  @WireField(
      tag = 11,
      adapter = "com.google.transit.realtime.TranslatedString#ADAPTER"
  )
  public final TranslatedString description_text;

  public Alert(List<TimeRange> active_period, List<EntitySelector> informed_entity, Cause cause, Effect effect, TranslatedString url, TranslatedString header_text, TranslatedString description_text) {
    this(active_period, informed_entity, cause, effect, url, header_text, description_text, ByteString.EMPTY);
  }

  public Alert(List<TimeRange> active_period, List<EntitySelector> informed_entity, Cause cause, Effect effect, TranslatedString url, TranslatedString header_text, TranslatedString description_text, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.active_period = Internal.immutableCopyOf("active_period", active_period);
    this.informed_entity = Internal.immutableCopyOf("informed_entity", informed_entity);
    this.cause = cause;
    this.effect = effect;
    this.url = url;
    this.header_text = header_text;
    this.description_text = description_text;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.active_period = Internal.copyOf("active_period", active_period);
    builder.informed_entity = Internal.copyOf("informed_entity", informed_entity);
    builder.cause = cause;
    builder.effect = effect;
    builder.url = url;
    builder.header_text = header_text;
    builder.description_text = description_text;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Alert)) return false;
    Alert o = (Alert) other;
    return unknownFields().equals(o.unknownFields())
        && active_period.equals(o.active_period)
        && informed_entity.equals(o.informed_entity)
        && Internal.equals(cause, o.cause)
        && Internal.equals(effect, o.effect)
        && Internal.equals(url, o.url)
        && Internal.equals(header_text, o.header_text)
        && Internal.equals(description_text, o.description_text);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + active_period.hashCode();
      result = result * 37 + informed_entity.hashCode();
      result = result * 37 + (cause != null ? cause.hashCode() : 0);
      result = result * 37 + (effect != null ? effect.hashCode() : 0);
      result = result * 37 + (url != null ? url.hashCode() : 0);
      result = result * 37 + (header_text != null ? header_text.hashCode() : 0);
      result = result * 37 + (description_text != null ? description_text.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!active_period.isEmpty()) builder.append(", active_period=").append(active_period);
    if (!informed_entity.isEmpty()) builder.append(", informed_entity=").append(informed_entity);
    if (cause != null) builder.append(", cause=").append(cause);
    if (effect != null) builder.append(", effect=").append(effect);
    if (url != null) builder.append(", url=").append(url);
    if (header_text != null) builder.append(", header_text=").append(header_text);
    if (description_text != null) builder.append(", description_text=").append(description_text);
    return builder.replace(0, 2, "Alert{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Alert, Builder> {
    public List<TimeRange> active_period;

    public List<EntitySelector> informed_entity;

    public Cause cause;

    public Effect effect;

    public TranslatedString url;

    public TranslatedString header_text;

    public TranslatedString description_text;

    public Builder() {
      active_period = Internal.newMutableList();
      informed_entity = Internal.newMutableList();
    }

    /**
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     */
    public Builder active_period(List<TimeRange> active_period) {
      Internal.checkElementsNotNull(active_period);
      this.active_period = active_period;
      return this;
    }

    /**
     * Entities whose users we should notify of this alert.
     */
    public Builder informed_entity(List<EntitySelector> informed_entity) {
      Internal.checkElementsNotNull(informed_entity);
      this.informed_entity = informed_entity;
      return this;
    }

    public Builder cause(Cause cause) {
      this.cause = cause;
      return this;
    }

    public Builder effect(Effect effect) {
      this.effect = effect;
      return this;
    }

    /**
     * The URL which provides additional information about the alert.
     */
    public Builder url(TranslatedString url) {
      this.url = url;
      return this;
    }

    /**
     * Alert header. Contains a short summary of the alert text as plain-text.
     */
    public Builder header_text(TranslatedString header_text) {
      this.header_text = header_text;
      return this;
    }

    /**
     * Full description for the alert as plain-text. The information in the
     * description should add to the information of the header.
     */
    public Builder description_text(TranslatedString description_text) {
      this.description_text = description_text;
      return this;
    }

    @Override
    public Alert build() {
      return new Alert(active_period, informed_entity, cause, effect, url, header_text, description_text, super.buildUnknownFields());
    }
  }

  /**
   * Cause of this alert.
   */
  public enum Cause implements WireEnum {
    UNKNOWN_CAUSE(1),

    /**
     * Not machine-representable.
     */
    OTHER_CAUSE(2),

    TECHNICAL_PROBLEM(3),

    /**
     * Public transit agency employees stopped working.
     */
    STRIKE(4),

    /**
     * People are blocking the streets.
     */
    DEMONSTRATION(5),

    ACCIDENT(6),

    HOLIDAY(7),

    WEATHER(8),

    MAINTENANCE(9),

    CONSTRUCTION(10),

    POLICE_ACTIVITY(11),

    MEDICAL_EMERGENCY(12);

    public static final ProtoAdapter<Cause> ADAPTER = ProtoAdapter.newEnumAdapter(Cause.class);

    private final int value;

    Cause(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static Cause fromValue(int value) {
      switch (value) {
        case 1: return UNKNOWN_CAUSE;
        case 2: return OTHER_CAUSE;
        case 3: return TECHNICAL_PROBLEM;
        case 4: return STRIKE;
        case 5: return DEMONSTRATION;
        case 6: return ACCIDENT;
        case 7: return HOLIDAY;
        case 8: return WEATHER;
        case 9: return MAINTENANCE;
        case 10: return CONSTRUCTION;
        case 11: return POLICE_ACTIVITY;
        case 12: return MEDICAL_EMERGENCY;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  /**
   * What is the effect of this problem on the affected entity.
   */
  public enum Effect implements WireEnum {
    NO_SERVICE(1),

    REDUCED_SERVICE(2),

    /**
     * We don't care about INsignificant delays: they are hard to detect, have
     * little impact on the user, and would clutter the results as they are too
     * frequent.
     */
    SIGNIFICANT_DELAYS(3),

    DETOUR(4),

    ADDITIONAL_SERVICE(5),

    MODIFIED_SERVICE(6),

    OTHER_EFFECT(7),

    UNKNOWN_EFFECT(8),

    STOP_MOVED(9);

    public static final ProtoAdapter<Effect> ADAPTER = ProtoAdapter.newEnumAdapter(Effect.class);

    private final int value;

    Effect(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static Effect fromValue(int value) {
      switch (value) {
        case 1: return NO_SERVICE;
        case 2: return REDUCED_SERVICE;
        case 3: return SIGNIFICANT_DELAYS;
        case 4: return DETOUR;
        case 5: return ADDITIONAL_SERVICE;
        case 6: return MODIFIED_SERVICE;
        case 7: return OTHER_EFFECT;
        case 8: return UNKNOWN_EFFECT;
        case 9: return STOP_MOVED;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  private static final class ProtoAdapter_Alert extends ProtoAdapter<Alert> {
    ProtoAdapter_Alert() {
      super(FieldEncoding.LENGTH_DELIMITED, Alert.class);
    }

    @Override
    public int encodedSize(Alert value) {
      return TimeRange.ADAPTER.asRepeated().encodedSizeWithTag(1, value.active_period)
          + EntitySelector.ADAPTER.asRepeated().encodedSizeWithTag(5, value.informed_entity)
          + (value.cause != null ? Cause.ADAPTER.encodedSizeWithTag(6, value.cause) : 0)
          + (value.effect != null ? Effect.ADAPTER.encodedSizeWithTag(7, value.effect) : 0)
          + (value.url != null ? TranslatedString.ADAPTER.encodedSizeWithTag(8, value.url) : 0)
          + (value.header_text != null ? TranslatedString.ADAPTER.encodedSizeWithTag(10, value.header_text) : 0)
          + (value.description_text != null ? TranslatedString.ADAPTER.encodedSizeWithTag(11, value.description_text) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Alert value) throws IOException {
      TimeRange.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.active_period);
      EntitySelector.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.informed_entity);
      if (value.cause != null) Cause.ADAPTER.encodeWithTag(writer, 6, value.cause);
      if (value.effect != null) Effect.ADAPTER.encodeWithTag(writer, 7, value.effect);
      if (value.url != null) TranslatedString.ADAPTER.encodeWithTag(writer, 8, value.url);
      if (value.header_text != null) TranslatedString.ADAPTER.encodeWithTag(writer, 10, value.header_text);
      if (value.description_text != null) TranslatedString.ADAPTER.encodeWithTag(writer, 11, value.description_text);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Alert decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.active_period.add(TimeRange.ADAPTER.decode(reader)); break;
          case 5: builder.informed_entity.add(EntitySelector.ADAPTER.decode(reader)); break;
          case 6: {
            try {
              builder.cause(Cause.ADAPTER.decode(reader));
            } catch (EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 7: {
            try {
              builder.effect(Effect.ADAPTER.decode(reader));
            } catch (EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 8: builder.url(TranslatedString.ADAPTER.decode(reader)); break;
          case 10: builder.header_text(TranslatedString.ADAPTER.decode(reader)); break;
          case 11: builder.description_text(TranslatedString.ADAPTER.decode(reader)); break;
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
    public Alert redact(Alert value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.active_period, TimeRange.ADAPTER);
      Internal.redactElements(builder.informed_entity, EntitySelector.ADAPTER);
      if (builder.url != null) builder.url = TranslatedString.ADAPTER.redact(builder.url);
      if (builder.header_text != null) builder.header_text = TranslatedString.ADAPTER.redact(builder.header_text);
      if (builder.description_text != null) builder.description_text = TranslatedString.ADAPTER.redact(builder.description_text);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
