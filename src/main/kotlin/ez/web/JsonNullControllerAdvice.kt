package ez.web

import org.springframework.core.MethodParameter
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice

@ControllerAdvice
class JsonNullControllerAdvice : ResponseBodyAdvice<Any?> {
  override fun supports(
    returnType: MethodParameter,
    converterType: Class<out HttpMessageConverter<*>>
  ): Boolean {
    return AbstractJackson2HttpMessageConverter::class.java.isAssignableFrom(converterType)
  }

  override fun beforeBodyWrite(
    body: Any?, returnType: MethodParameter, contentType: MediaType,
    converterType: Class<out HttpMessageConverter<*>>,
    request: ServerHttpRequest, response: ServerHttpResponse
  ): Any? {
    return body ?: JsonNull
  }
}