package fluxxion

import grails.testing.web.taglib.TagLibUnitTest
import spock.lang.Specification

class FluxTagLibSpec extends Specification implements TagLibUnitTest<FluxTagLib> {

     void "test simple tag as method"() {
       expect:
       tagLib.simple()
     }
}
