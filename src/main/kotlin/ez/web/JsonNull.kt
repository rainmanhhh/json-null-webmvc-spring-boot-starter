package ez.web

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.ser.std.NullSerializer

@JsonSerialize(using = NullSerializer::class)
object JsonNull