package com.proptechos.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class InstantSerializer extends JsonSerializer<Instant> {

  private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

  @Override
  public void serialize(Instant value, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    gen.writeString(DateTimeFormatter.ISO_INSTANT.format(value));
  }
}
