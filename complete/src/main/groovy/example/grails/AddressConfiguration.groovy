package example.grails

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

@Configuration
@ConfigurationProperties("address")
class AddressConfiguration {
    String street
    String city
    String country
}
