package com.thoughtworks.capability.gtb.SerializeUtils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.thoughtworks.capability.gtb.vo.EventType;

import java.io.IOException;

public class AgeSerializer extends JsonSerializer<Integer> {

    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeNumber(0);
    }
}
