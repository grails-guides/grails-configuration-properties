package example.grails

import grails.testing.web.taglib.TagLibUnitTest
import spock.lang.Specification

class AddressTagLibSpec extends Specification implements TagLibUnitTest<AddressTagLib> { // <1>

    Closure doWithSpring() {{ -> // <2>
        addressConfiguration(AddressConfiguration)
    }}

    void "test address tag"() {
        expect: // <3>
        tagLib.address() == """<div class='adr'> 
<div class='street-address'>221B Baker Street</div>
 <span class='locality'>London</span>,
 <div class='country-name'>United Kingdom</div>
</div>"""
    }
}
