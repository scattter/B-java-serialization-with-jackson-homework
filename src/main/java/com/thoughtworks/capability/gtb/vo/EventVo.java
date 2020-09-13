package com.thoughtworks.capability.gtb.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.thoughtworks.capability.gtb.DeserializeUtiles.EventTypeDeserializer;
import com.thoughtworks.capability.gtb.SerializeUtils.EventTypeSerializer;
import com.thoughtworks.capability.gtb.SerializeUtils.TimestampSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

  private String id;
  private String name;
  @JsonSerialize(using = EventTypeSerializer.class)
  @JsonDeserialize(using = EventTypeDeserializer.class)
  private EventType type;
  @JsonSerialize(using = TimestampSerializer.class)
  private Date time;
  @JsonUnwrapped
  private UserVo user;
}
