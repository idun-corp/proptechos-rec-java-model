package com.proptechos.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InstantDeserializer extends JsonDeserializer<Instant> {

  private static final Logger log
      = Logger.getLogger(InstantDeserializer.class.getName());

  private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

  @Override
  public Instant deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
      throws IOException {
    ObjectCodec oc = jsonParser.getCodec();
    JsonNode node = oc.readTree(jsonParser);
    String dateAsString = node.asText();
    try {
      return formatter.parse(dateAsString).toInstant();
    } catch (ParseException e) {
      log.log(Level.WARNING, "Couldn't parse date: " + dateAsString);
      return null;
    }
  }
}
