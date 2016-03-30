package io.pivotal

import org.springframework.web.bind.annotation.RequestMapping

class HelloController {

    @RequestMapping("/resource/hello")
    fun hello() = mapOf("id" to "1", "content" to "Go swimming on Monday night")
}