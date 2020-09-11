package com.proptechos.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InstantDateSerializer extends JsonSerializer<Date> {

  private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

  @Override
  public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    gen.writeString(formatter.format(value));
  }
}
