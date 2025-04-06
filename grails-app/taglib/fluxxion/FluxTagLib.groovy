package fluxxion

import groovy.util.logging.Slf4j


@Slf4j
class FluxTagLib {
    static namespace = "flux"
    private final methods = ["get", "post", "put", "patch", "delete"]

    def flux = { Map attrs, Closure body ->
        def getUrl = attrs.get ?: ''
        def postUrl = attrs.post ?: ''
        def putUrl = attrs.put ?: ''
        def patchUrl = attrs.patch ?: ''
        def deleteUrl = attrs.delete ?: ''
    }

    def validateKeys(Map attrs) {
        def keySet = attrs.keySet()
        try {
            checkMultipleMethods(keySet)
        } catch (IllegalStateException ise) {
            log.error("error validating keys", ise)
        }
    }

    def checkMultipleMethods(Set keys) {
        def hasMethod = false
        keys.each { key ->
            if(methods.contains(key) && hasMethod) {
                throw new IllegalStateException("cannot have multiple methods on single HTML tag")
            }
        }
    }
}