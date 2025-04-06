package fluxxion

import grails.plugins.*

class FluxxionGrailsPlugin extends Plugin {

    // the version or versions of Grails the plugin is designed for
       def grailsVersion = "6.2.3  > *"
       // resources that are excluded from plugin packaging
       def pluginExcludes = [
           "grails-app/views/error.gsp"
       ]

       // TODO Fill in these fields
       def title = "Fluxxion" // Headline display name of the plugin
       def author = "Justin Dodson"
       def authorEmail = "justin@89websolutions.com"
       def description = '''\
    Fluxxion is an "HTML over the wire" solution. This library offers a set of `flux` tags that 
    allow for reactive web pages without the need to write any Javascript or leverage a Javascript
    framework.
   '''
   // URL to the plugin's documentation
       def documentation = "https://grails.github.io/Fluxxion/"

       // Extra (optional) plugin metadata

       // License: one of 'APACHE', 'GPL2', 'GPL3'
   //    def license = "APACHE"

       // Details of company behind the plugin (if there is one)
       def organization = [ name: "Daxxion Labs", url: "" ]

       // Any additional developers beyond the author specified above.
       def developers = [ [ name: "Justin Dodson", email: "justin@89websolutions.com" ]]

       // Location of the plugin's issue tracker.
   //    def issueManagement = [ system: "GitHub", url: "https://github.com/grails/Fluxxion/issues" ]

       // Online location of the plugin's browseable source code.
   //    def scm = [ url: "https://github.com/grails/Fluxxion" ]

       Closure doWithSpring() { {->
               // TODO Implement runtime spring config (optional)
           }
       }

       void doWithDynamicMethods() {
           // TODO Implement registering dynamic methods to classes (optional)
       }

       void doWithApplicationContext() {
           // TODO Implement post initialization spring config (optional)
       }

       void onChange(Map<String, Object> event) {
           // TODO Implement code that is executed when any artefact that this plugin is
           // watching is modified and reloaded. The event contains: event.source,
           // event.application, event.manager, event.ctx, and event.plugin.
       }

       void onConfigChange(Map<String, Object> event) {
           // TODO Implement code that is executed when the project configuration changes.
           // The event is the same as for 'onChange'.
       }

       void onShutdown(Map<String, Object> event) {
           // TODO Implement code that is executed when the application shuts down (optional)
       }
}