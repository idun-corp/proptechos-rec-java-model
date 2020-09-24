package com.proptechos.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InstantDeserializer extends JsonDeserializer<Instant> {

  private static final Logger log
      = Logger.getLogger(InstantDeserializer.class.getName());

  @Override
  public Instant deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
      throws IOException {
    ObjectCodec oc = jsonParser.getCodec();
    JsonNode node = oc.readTree(jsonParser);
    String dateAsString = node.asText();
    try {
      return Instant.from(DateTimeFormatter.ISO_INSTANT.parse(dateAsString));
    } catch (Exception e) {
      log.log(Level.WARNING, "Couldn't parse date: " + dateAsString);
      return null;
    }
  }
}
