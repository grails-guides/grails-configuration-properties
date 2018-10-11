package example.grails

class AddressTagLib {

    static namespace = "app"

    AddressConfiguration addressConfiguration

    def address = { attrs, body ->
        out << """<div class='adr'>
<div class='street-address'>${addressConfiguration.street}</div>
 <span class='locality'>${addressConfiguration.city}</span>,
 <div class='country-name'>${addressConfiguration.country}</div>
</div>"""
    }
}
