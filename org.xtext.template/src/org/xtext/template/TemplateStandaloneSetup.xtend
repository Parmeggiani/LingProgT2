/*
 * generated by Xtext 2.14.0
 */
package org.xtext.template


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TemplateStandaloneSetup extends TemplateStandaloneSetupGenerated {

	def static void doSetup() {
		new TemplateStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}