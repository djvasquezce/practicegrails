

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'practicegrails.MyUser'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'practicegrails.MyUserMyRole'
grails.plugin.springsecurity.authority.className = 'practicegrails.MyRole'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

//configuración genérica de SAML 

grails.plugin.springsecurity.providerNames = ['samlAuthenticationProvider', 'daoAuthenticationProvider', 'anonymousAuthenticationProvider']
grails.plugin.springsecurity.saml.active = true

//configuracion para entorno

//-------1------
grails.plugin.springsecurity.saml.metadata.providers = [myIDP: 'security/idp.xml']

//-------2------
grails.plugin.springsecurity.saml.keyManager.storeFile = "classpath:security/samlKeystoreDev.jks"
grails.plugin.springsecurity.saml.keyManager.storePass = 'chnageit'
grails.plugin.springsecurity.saml.keyManager.passwords = [mykey:'chnageit']
grails.plugin.springsecurity.saml.keyManager.defaultKey = 'mykey' 

//-------3------
grails.plugin.springsecurity.saml.metadata.sp.file = 'security/sp_localhost.xml'
grails.plugin.springsecurity.saml.metadata.sp.defaults = [ local: true, 
															alias: 'saml::confirma-cursos-devel', 
															entityId: 'saml::confirma-cursos-devel',
															securityProfile: 'metaiop',
															signingKey: 'mykey', 
															encryptionKey: 'mykey', 
															tlsKey: 'mykey', 
															requireArtifactResolveSigned: false, 
															requireLogoutRequestSigned: false, 
															requireLogoutResponseSigned: false ]