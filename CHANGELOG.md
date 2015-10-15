
# **0.3**
- update to Grails-3.0.9 and related plugins ... wip
- add sample for connecting to a PostgreSQL and a MongoDB instance, using a connection URL form an environmental variable (typical at Heroku) ... wip

# **0.2**
- update to Grails-3.0.8, running at Heroku but using the Tomcat embedded available with Grails, approach suggested even by Grails developers
- now even Grails usual run works both in DEV environment ('grails run-app') and in PROD ('grails run-app -Dgrails.env=prod', more aligned with the real test at Heroku)
- to generate the runnable war like at Heroku, do 'gradle stage', and run it with 'java -Dgrails.env=prod -Dserver.port=8080 -jar libs\grails3-example-0.2.war' (note that in Windows libs\*.war or libs\*.jar doesn't work)
- add sample configuration of a PostgreSQL data source, and for a MongoDB data source, but not used at the moment (maybe in next release)
- cleanup of commented/unused/deprecated code will be done later (maybe in next release)

# **0.1**
- update to Grails-3.0.5 and make it run at Heroku with external runners (Jetty Runner, Tomcat Webapp Runner), but note that in some cases 'grails run-app' doesn't work anymore
- start from original code base (based on Grails-3.0.1)

---
